package com.springmvc.forms;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Called");
		return "home";
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("Login Form Called");
		return "login";
	}
	@PostMapping("/authenticate")
	public String authenticate(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("I am in Authenticate");
		String ui="";
		if(username.contentEquals("lokesh") && password.contentEquals("padamata")){
			ui="success";
			}
		else {
			ui="failure";
		}
		return ui;
	}
}
