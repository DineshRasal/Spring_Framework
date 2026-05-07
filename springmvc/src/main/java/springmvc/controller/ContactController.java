package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String show() {
		return "contact";
	}
	
	@RequestMapping(path="/processForm", method = RequestMethod.POST )
	public String form(@RequestParam(name="email", required=true)String userEmail,
			@RequestParam("password")String userPass,
			Model model) {
		System.out.println("User Email:"+userEmail);
		System.out.println("User Password:"+userPass);
		model.addAttribute("email",userEmail);
		model.addAttribute("password",userPass);
		return "success";
	}
}
