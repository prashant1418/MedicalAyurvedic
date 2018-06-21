package com.medical.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAction {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	} 
	
	@RequestMapping("/login")
	public String Login() {
		
		return "Welcome.jsp";
	}

}
