package com.user.dao;

import com.user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOimpl implements UserDAO {

	// @Autowired
	@Override
	public void add(User user) {
	
		System.out.println("In UserDAO Impl");
		System.out.println("User Gamil:  " + user.getEmail());
		System.out.println("User Name:  " + user.getName());
	}

	@Override
	public void all() {
		// TODO Auto-generated method stub
		
	}
}
