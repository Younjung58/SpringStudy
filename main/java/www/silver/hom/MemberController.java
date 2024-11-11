package www.silver.hom;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_MemberService;
import www.silver.vo.MemberVO;

@Controller
public class MemberController {

	//서비스 로직을 실행할 수 있는 변수 선언
	//선언시 객체의 주소가 필요하다.. 스프링에서는 객체의 주소를 주입받기에
	@Inject  // 주입 받기 위해서는 아래의 객체가 컨트롤러에 있어야 한다.
	IF_MemberService memberservice; 
	
	@PostMapping(value = "join")
	public String join(@ModelAttribute
			MemberVO membervo) throws Exception{  //VO로 파라미터 받는다
		//System.out.println(membervo.toString());
		//비지니스 로직을 서비스 단에게 요청..
		memberservice.join(membervo);
		
		return "home";
	}
	
}
