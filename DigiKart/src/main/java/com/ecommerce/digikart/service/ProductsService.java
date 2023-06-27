package com.ecommerce.digikart.service;

import java.util.List;

import com.ecommerce.digikart.model.Products;

public interface ProductsService {
	public boolean addProduct(Products product);
	public List<Products> list();
	public boolean updateProduct(Products product);
	public boolean deleteProduct(Products product);

}
