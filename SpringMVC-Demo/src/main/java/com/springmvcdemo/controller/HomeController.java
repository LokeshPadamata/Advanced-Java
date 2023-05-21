package com.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Controller Home Called");
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("Login Called");
		return "login";
	}
}
