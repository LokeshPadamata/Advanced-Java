package com.ecommerce.digikart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.digikart.model.Products;

@Repository
public class ProductsDAOimpl implements ProductsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Products product) {
		boolean result = false;
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		int i = (int) session.save(product);
		transaction.commit();
		if(i !=0) {
			result = true;
		}
		
		return result;
	}
	@Override
	public boolean deleteProduct(Products product) {
		boolean result = false;
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Products pro = (Products) session.merge(product);
			session.remove(pro);
			transaction.commit();
			result = true;
		}
		catch(Exception e) {
			System.out.println(e);
			result = false;
		}
		return result;
	}
	@Override
	public List<Products> list() {
		 Session session=sessionFactory.openSession();
		  List<Products> list = session.createQuery("from Products").list();
		return list;
	}

	@Override
	public boolean updateProduct(Products product) {
		// TODO Auto-generated method stub
		return false;
	}

}