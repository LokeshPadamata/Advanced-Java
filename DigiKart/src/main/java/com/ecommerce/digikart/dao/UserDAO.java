package com.ecommerce.digikart.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.ecommerce.digikart.model.Users;


public interface UserDAO {
	public boolean register(Users user);
	public boolean login (Users user);
}
