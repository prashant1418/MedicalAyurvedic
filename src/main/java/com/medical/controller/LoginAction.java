package com.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medical.Entity.LoginBean;
import com.medical.dao.LoginDao;

@Controller
public class LoginAction {
	
	
	@Autowired
	LoginDao Ldao;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping("/login")
	//public String Login(@RequestParam("username") String name, @RequestParam("password") String password)
	
	public String Login(@ModelAttribute LoginBean loginBean )
	{
		/*System.out.println(name + "   " + password);

		LoginBean loginBean = new LoginBean(name,password);*/
		System.out.println(loginBean);
		
		Ldao.addLogin(loginBean);
		return "Welcome.jsp";
	}

}
