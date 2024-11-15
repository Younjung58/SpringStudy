package www.silver.hom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request) throws Exception{
		HttpSession session= request.getSession();
		session.invalidate();		// session을 무력화
		return "redirect:/";
	}
	
	
	@PostMapping("login")
	public String login(@RequestParam("id") String id, @RequestParam("pass") String pass, 
			HttpServletRequest request) throws Exception{
		// 클라이언트가 전송한 아이디와 패스워드가 DB에 있는지 확인
		// 현재는 세션과 인터셉터가 목적이라서 윗부분은 생략하고 진행
		
		// request의 세션을 가져온다.
		HttpSession session = request.getSession();
		// 가져온 세션에 설정된 id변수의 값을 가져온다.(타입을 모르기때문에 Object로 설정)
		Object nowid = session.getAttribute("id");
		// 현재 로그인한 아이디가 세션에 저장되어있는지 확인하고 가져오는데, 만약 가져온 값이 있다면
		// 즉, 로그인을 한 상태라면
		if(nowid != null) {
			// 기존의 세션값의 id변수의 값을 제거한다.
			session.removeAttribute("id");
		}
		// 변수가 비워진 상태에서
		// 세션 변수 id에 새로운 값(현재 로그인한 아이디) 저장한다.
		session.setAttribute("id", id);
		
		return "redirect:/";
	}
}
