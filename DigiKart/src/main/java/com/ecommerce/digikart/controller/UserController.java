package com.ecommerce.digikart.controller;

import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.digikart.model.Users;
import com.ecommerce.digikart.service.UserService;
import com.ecommerce.digikart.utils.Response;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.razorpay.Order;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/healthcheckup")
	public String healthcheckup() {
		System.out.println("Health check invoked");
		return "App is running successfully";	
	}
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@RequestBody Users user) {
		System.out.println("----register---");
		System.out.println(user.getEmail());
		boolean result = userService.register(user);
		Response reponse = null;
		if(result==true) {
			Response response = new Response();
			response.setMessage("Registration Successful");
			response.setOperationstatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.OK);
	}
		else {
			Response response = new Response();
			response.setMessage("Registration Successful");
			response.setOperationstatus("Failure");
			return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		}
}
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody Users user) {
		boolean result = userService.login(user);
		Response reponse = null;
		if(result==true) {
			Response response = new Response();
			response.setMessage("Login Successful");
			response.setOperationstatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.OK);
	}
		else {
			Response response = new Response();
			response.setOperationstatus("Failure");
			response.setMessage("Login Failure");
			return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		}
		
	}
//	@PostMapping("/createOrder")
//	public ResponseEntity<Object> createOrder(@RequestBody Payment payment) throws RazorpayException{
//		RazorpayClient client = new RazorpayClient("rzp_test_ZAGfPt6YgsgBXE ", "BSYSOrXqmAx6HmLt1en693ZB");
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("amount",payment.getAmount());
//		jsonObject.put("currency",payment.getCurrency());
//		Order order = client.orders.create(jsonObject);
//		Response response = new Response();
//		response.setMessage(order.get("id"));
//		response.setOperationstatus("Order Created");
//		return new ResponseEntity<Object>(response,HttpStatus.CREATED);
//	}	
}