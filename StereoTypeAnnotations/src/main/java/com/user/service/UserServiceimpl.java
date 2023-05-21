package com.user.service;

import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.dao.UserDAOimpl;
import com.user.model.User;
@Service
public class UserServiceimpl implements UserService {
	
	
	private UserDAO userDAO = new UserDAOimpl();
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("In Service");
		userDAO.add(user);
	}

	@Override
	public void all() {
		// TODO Auto-generated method stub
		
	}

}
