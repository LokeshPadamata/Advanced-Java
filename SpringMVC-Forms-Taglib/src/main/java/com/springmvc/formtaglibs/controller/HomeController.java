package com.springmvc.formtaglibs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.formtaglibs.model.User;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home")
	public String home() {
		System.out.println("Home Controller Called");
		return "home";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		System.out.println("Login Called");
		return "login";
	}
	@PostMapping("/authenticate")
	public String authenticate(@ModelAttribute("user") User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String ui = "";
		if(username.contentEquals("lokesh")&&password.contentEquals("padamata")) {
			ui = "success";
		}
		else {
			ui = "failure";
		}
		System.out.println("I am in Authenticate Function");
		return ui;
	}
}
