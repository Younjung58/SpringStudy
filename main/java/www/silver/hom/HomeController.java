package www.silver.hom;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/** aaa
 * Handles requests for the application home page.
 */
//@RestController
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "timeline", method = RequestMethod.GET) 
	public String timeline() {
		return "timeline";
	}
	
	@RequestMapping(value = "viewMessage", method = RequestMethod.POST) 
	public String viewMessage(@RequestParam("time") String t,
				@RequestParam("name") String n, Model m) {
		ModelAndView mm = new ModelAndView();
		// 디버깅 - 확인용
//		System.out.println(t+"/"+n);
		m.addAttribute("번수명","값");
		// 넘겨줄 변수명을 각각 변수명, 값으로 지정하고 각각의 값을 넘겨주면 알아서 matching해줌
		m.addAttribute("time",t);
		// time이라는 변수명에 값 t를 넘겨줌
		m.addAttribute("name",n);
		// name이라는 변수명에 값 n을 넘겨줌
		m.addAttribute("age",100);
		// age라는 변수명에 값 100을 넘겨줌
		return "viewMsg";
	}
	
	@RequestMapping(value = "viewMessage", method = RequestMethod.GET) 
	public String viewMessage1(@RequestParam("time") String t,
				@RequestParam("name") String n, Model m) {
		ModelAndView mm = new ModelAndView();
		// 디버깅 - 확인용
//		System.out.println(t+"/"+n);
		m.addAttribute("번수명","값");
		// 넘겨줄 변수명을 각각 변수명, 값으로 지정하고 각각의 값을 넘겨주면 알아서 matching해줌
		m.addAttribute("time",t);
		// time이라는 변수명에 값 t를 넘겨줌
		m.addAttribute("name",n);
		// name이라는 변수명에 값 n을 넘겨줌
		m.addAttribute("age",100);
		// age라는 변수명에 값 100을 넘겨줌
		return "viewMsg";
	}
	
}
