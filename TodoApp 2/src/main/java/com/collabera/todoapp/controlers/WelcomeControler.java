package com.collabera.todoapp.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeControler {

	// http://localhost:8080/welcome
	
	@RequestMapping(value = "/welcome")
	//@ResponseBody
//	public String welcomeMessage(@RequestParam(value="name", defaultValue = "Vijay") String name, 
//			@RequestParam(value="age", defaultValue = "1") String age,
//			ModelMap model) {
	public String welcomeMessage() {
		// modal, modalmap, modalview
		
		//model.addAttribute("name", name);
		//model.addAttribute("age", age);
		
		return "welcome";
	}	
}
