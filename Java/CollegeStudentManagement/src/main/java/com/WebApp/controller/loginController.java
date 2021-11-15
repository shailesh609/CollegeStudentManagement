package com.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class loginController {

	

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
}
