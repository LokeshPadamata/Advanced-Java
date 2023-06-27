package com.ecommerce.digikart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.ecommerce.digikart"})
@EntityScan(basePackages= {"com.ecommerce.digikart.model"})
@SpringBootApplication
public class DigiKartApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigiKartApplication.class, args);
	
	}

}