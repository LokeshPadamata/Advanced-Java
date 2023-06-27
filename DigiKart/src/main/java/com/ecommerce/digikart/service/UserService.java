package com.ecommerce.digikart.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.ecommerce.digikart.model.Users;

public interface UserService {
	public boolean register(Users user);
	public boolean login(Users user);
}
