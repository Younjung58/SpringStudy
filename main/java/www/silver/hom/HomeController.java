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
	
	@RequestMapping(value = "viewMessage", method = RequestMethod.GET)
	public String viewMessage(@RequestParam("time") String t,
			@RequestParam("name") String n, Model m) {
		//디버깅 - 확인용
	//	ModelAndView mm = new ModelAndView();
	//	System.out.println(t +"/"+ n);
		m.addAttribute("변수명","값");
		m.addAttribute("time",t);
		m.addAttribute("name",n);
		m.addAttribute("age", 100);
		return "viewMsg";
	}
	@RequestMapping(value = "viewMessage", method = RequestMethod.POST)
	public String viewMessage1(@RequestParam("time") String t,
			@RequestParam("name") String n, Model m) {
		//디버깅 - 확인용
	//	ModelAndView mm = new ModelAndView();
	//	System.out.println(t +"/"+ n);
		m.addAttribute("변수명","값");
		m.addAttribute("time",t);
		m.addAttribute("name",n);
		m.addAttribute("age", 100);
		return "viewMsg";
	}
	
	
	
	
	
	
	
	
	
	//https://bubblecastle.tistory.com/9
	
}
