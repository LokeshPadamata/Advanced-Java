package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.user.model.User;
import com.user.service.UserService;
import com.user.service.UserServiceimpl;

@Controller
public class UserController {
	
	//@Autowired
	private UserService userservice = new UserServiceimpl();
	public void addUser(User user) {
		System.out.println("In Controller");
		userservice.add(user);
	}
		
}
