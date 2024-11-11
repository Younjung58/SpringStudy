package www.silver.hom;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_BoardService;
import www.silver.vo.BoardVO;

@Controller
public class BoardController {
	
	@Inject
	IF_BoardService boardservice;
	
	@GetMapping(value="board") 
	public String board() throws Exception{
		System.out.println("why?");
		//Controller > service > dao > mapper
		// 전체 게시글을 가져오는 작업이 필요
		return "board/bbs";
	}
	
	@GetMapping(value="bwr") 
	public String bwr() throws Exception{
		//Controller > service > dao > mapper
		return "board/bbswr";
	}
	
	@PostMapping(value="bwrdo") 
	public String bwrdo(@ModelAttribute BoardVO boardvo) throws Exception{
		//Controller > service > dao > mapper
//		System.out.println(boardvo.toString());
		boardservice.addBoard(boardvo);
		// 서비스 레이어에게 클라이언트로부터 받아온 요청에 대한 값을 넘겨서 요청을 처리할 수 있도록 하는 코드
		return "board/bbs";
	}
}
