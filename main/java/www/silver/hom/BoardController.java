package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.service.IF_BoardService;
import www.silver.vo.BoardVO;

@Controller
public class BoardController {
	
	@Inject
	IF_BoardService boardservice;
	
	@GetMapping(value="board") 
	public String board(Model model) throws Exception{
		// view로 값을 넘기기 위해서 Model객체를 사용
		//Controller > service > dao > mapper
		// 전체 게시글을 가져오는 작업이 필요
		// 서비스 layer에 전체글 서비스를 요청하고 결과를 리턴
		List<BoardVO> list = boardservice.boardlist();
		// 리턴받은 list변수의 값을 모델 객체로 뷰에게 전송하는 코드
		System.out.println(list.size());
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
	
	@PostMapping(value="bwrdo") 
	public String bwrdo(@ModelAttribute BoardVO boardvo) throws Exception{
		//Controller > service > dao > mapper
//		System.out.println(boardvo.toString());
		boardservice.addBoard(boardvo);
		// 서비스 레이어에게 클라이언트로부터 받아온 요청에 대한 값을 넘겨서 요청을 처리할 수 있도록 하는 코드
//		return "board/bbs";		
		// 이 코드로 작성하게 되면 받아오는 모델객체가 없어서 같은 view화면으로 넘어간다해도 목록이 뜨지 않음
		// 따라서 모델을 또 받아오는 코드를 작성해도 되지만, 이는 위의 board의 코드와 중복되게 되므로
		// 해당 부분으로 바로 이동하는 리턴값으로 바꾸면 됨(redirect:돌아가고 싶은 부분에 해당하는 value값)
		return "redirect:board";
	}
}
