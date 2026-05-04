package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This Is Home Page");
		model.addAttribute("name","Dinesh Rasal");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("About Page Is Loaded");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This Help Page ");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Rushi");
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
