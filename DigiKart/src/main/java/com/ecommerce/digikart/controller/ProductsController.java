package com.ecommerce.digikart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.digikart.model.Products;
import com.ecommerce.digikart.service.ProductsService;
import com.ecommerce.digikart.utils.Response;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Object> addProduct(@RequestBody Products product) {
		
		boolean result = productsService.addProduct(product);
		if(result == true) {
			Response response = new Response();
			response.setMessage("Product Added Successfully");
			response.setOperationstatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.CREATED);
		}
		else {
			Response response = new Response();
			response.setMessage("Product Added Failed");
			response.setOperationstatus("Failed");
			return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/deleteProduct")
	public ResponseEntity<Object> deleteProduct(@RequestBody Products product) {
		
		boolean result = productsService.addProduct(product);
		if(result == true) {
			Response response = new Response();
			response.setMessage("Product Deleted Successfully");
			response.setOperationstatus("Success");
			return new ResponseEntity<Object>(response,HttpStatus.CREATED);
		}
		else {
			Response response = new Response();
			response.setMessage("Product Deletion Failed");
			response.setOperationstatus("Failed");
			return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/listProducts")
	public ResponseEntity<Object> list(){
		List<Products> products = productsService.list();
		return new ResponseEntity<Object>(products,HttpStatus.OK);
	}
	
		
	}
	

