package com.ecommerce.digikart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.digikart.model.Users;

@Repository
public class UserDAOimpl implements UserDAO {
	boolean result = false;
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean register(Users user) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = (int) session.save(user);
		transaction.commit();
		if(id != 0) {
			result = true;
		}
		return result;
	}
	@Override
	public boolean login(Users user) {
		
		boolean result = false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String HQLQuery = "select password from Users where username=:username";
		Query query = session.createQuery(HQLQuery);
		query.setParameter("username",user.getUsername());
		transaction.commit();
		String pass = query.getSingleResult().toString();
		if(user.getPassword().contentEquals(pass)) {
			result = true;
		}
		return result;
	}

}
