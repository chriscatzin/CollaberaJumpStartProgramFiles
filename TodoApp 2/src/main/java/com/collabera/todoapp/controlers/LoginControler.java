package com.collabera.todoapp.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.collabera.todoapp.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginControler {
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginGet() {
		return "login";
	}	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String loginPost(@RequestParam(value="name") String name, 
			@RequestParam(value="password") String password,
			ModelMap model) {
		
		if(loginService.isValidUser(name, password) ) {
			// welcome view
			
			
			model.put("name", loginService.getUserName());
			
			return "welcome";
		}
		
		// login view
		
		model.put("errorMessage", "Invalid Credentials");
		return "login";
	}	
}
