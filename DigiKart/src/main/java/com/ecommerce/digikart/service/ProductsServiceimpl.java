package com.ecommerce.digikart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.digikart.dao.ProductsDAO;
import com.ecommerce.digikart.model.Products;


@Service
public class ProductsServiceimpl implements ProductsService {
	
	@Autowired
	private ProductsDAO productsDAO;
	@Override
	public boolean addProduct(Products product) {
	
		return productsDAO.addProduct(product);
	}

	@Override
	public List<Products> list() {
		// TODO Auto-generated method stub
		return productsDAO.list();
	}

	@Override
	public boolean updateProduct(Products product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(Products product) {
		// TODO Auto-generated method stub
		return productsDAO.deleteProduct(product);
	}

}
