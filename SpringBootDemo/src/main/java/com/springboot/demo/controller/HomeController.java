package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@RequestMapping("/healthcheckup")     // API
		public String healthcheckup() {
			System.out.println("Health checkup function is Called");
			return "App is running Successfully";
		}
}
