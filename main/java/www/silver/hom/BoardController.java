package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import www.silver.service.IF_BoardService;
import www.silver.util.FileDataUtil;
import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

@Controller
public class BoardController {
	
	@Inject
	IF_BoardService boardservice;
	
	@Inject
	FileDataUtil filedatautil;
	
	@GetMapping(value="board") 
	public String board(Model model, @ModelAttribute PageVO pagevo) throws Exception{
		// view로 값을 넘기기 위해서 Model객체를 사용
		//Controller > service > dao > mapper
		if(pagevo.getPage()==null) {
			pagevo.setPage(1);
		}
		pagevo.setTotalCount(348);
		
		System.out.println(pagevo.getStartNo()+"시작 글번호");
		System.out.println(pagevo.getEndNo()+"마지막 글번호");
		System.out.println(pagevo.getStartPage()+"그룹 시작번호");
		System.out.println(pagevo.getEndPage()+"그룹 끝 글번호");
		
		pagevo.setTotalCount(boardservice.totalCountBoard());
		
		// 전체 게시글을 가져오는 작업이 필요
		// 서비스 layer에 전체글 서비스를 요청하고 결과를 리턴
		List<BoardVO> list = boardservice.boardlist(pagevo);
		// 리턴받은 list변수의 값을 모델 객체로 뷰에게 전송하는 코드
//		System.out.println(list.size());
		model.addAttribute("list", list);
		// 뷰를 지정
		return "board/bbs";
	}
	
	@GetMapping(value="bwr") 
	public String bwr() throws Exception{
		//Controller > service > dao > mapper
		return "board/bbswr";
	}
	
	@GetMapping(value="del")
	public String del(@RequestParam("delno") String delno) throws Exception {
		boardservice.deleteBoard(delno);
		return "redirect:board";
	}
	
	@GetMapping(value="mod")
	public String mod(@RequestParam("modno") String modno, Model model) throws Exception {
		BoardVO bvo = boardservice.modBoard(modno);
//		System.out.println(bvo.getTitle());
		// sysout은 서버입장에서는 부하 걸리는 작업이다.
		// 그래서 테스트를 했다면 삭제하거나 주석처리를 해야한다.
		// 실제로 sysout은 잘 사용하지 않는다.
		// 테스트하기 위해서는 junit test라는 도구를 사용한다.
		// 또 기록을 남기 위해서는 로그라는 기능을 사용한다.
		// 로그는 홈 컨트롤러에 가면 볼 수 있다.
		model.addAttribute("boardvo", bvo);
		return "board/modform";
	}
	
	@PostMapping(value="mod")
	public String modsave(@ModelAttribute BoardVO bvo) throws Exception{
		boardservice.modBoard(bvo);
		return "redirect:board";
	}
	
	@PostMapping(value="bwrdo") 
	public String bwrdo(@ModelAttribute BoardVO boardvo, MultipartFile[] file) throws Exception{
		//Controller > service > dao > mapper
//		System.out.println(boardvo.toString());
		// 업로드 되는지 확인하는 중간코드
//		System.out.println(file.length);
//		for (int i = 0; i < file.length; i++) {
//			System.out.println(file[i].getOriginalFilename());
//		}
		
		String[] newFileName = filedatautil.fileUpload(file);
//		System.out.println(newFileName);
		boardvo.setFilename(newFileName);		
		boardservice.addBoard(boardvo);
		// 해당 코드를 건들지 않고, 추가로 파일명도 같이 보내기 위해서 vo에 변수를 추가하고 변수에 리턴받은 파일명을 저장한다.
		// 서비스 레이어에게 클라이언트로부터 받아온 요청에 대한 값을 넘겨서 요청을 처리할 수 있도록 하는 코드
//		return "board/bbs";		
		// 이 코드로 작성하게 되면 받아오는 모델객체가 없어서 같은 view화면으로 넘어간다해도 목록이 뜨지 않음
		// 따라서 모델을 또 받아오는 코드를 작성해도 되지만, 이는 위의 board의 코드와 중복되게 되므로
		// 해당 부분으로 바로 이동하는 리턴값으로 바꾸면 됨(redirect:돌아가고 싶은 부분에 해당하는 value값)
		return "redirect:board";
	}
	
	@GetMapping(value="view")
	public String boardView(@RequestParam("no") String no, Model m) throws Exception {
		BoardVO boardvo = boardservice.getBoard(no);
		// attach 가져오기
		List<String> attachList=boardservice.getAttach(no);
		// view에게 전송할 값들.. 게시글과 첨부파일 리스트
		m.addAttribute("boardvo", boardvo);
		m.addAttribute("attachList", attachList);
		return "board/dview";
	}
	
}
