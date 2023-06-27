package com.ecommerce.digikart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.ecommerce.digikart.dao.UserDAO;
import com.ecommerce.digikart.model.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO; 
	@Transactional
	public boolean register(Users user) {
		
		return userDAO.register(user);
	}
	@Override
	public boolean login(Users user) {
		// TODO Auto-generated method stub
		return userDAO.login(user);
	}
	

}
