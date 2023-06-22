package com.springmvc.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Controller Called");
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("Login Called");
		return "login";
	}
}
