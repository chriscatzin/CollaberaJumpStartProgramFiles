package com.collabera.todoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LoginService {
	
	@Autowired
	UserService userService;
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean isValidUser(String userName, String password) {
		
		if(userName.equals("") && password.equals("")) {
			this.userName ="vijay";
			return true;
		}
			
		
		return false;
	}

}
