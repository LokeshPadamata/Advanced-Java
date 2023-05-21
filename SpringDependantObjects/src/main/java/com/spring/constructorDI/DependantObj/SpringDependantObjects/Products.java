package com.spring.constructorDI.DependantObj.SpringDependantObjects;

public class Products {
	
	private int id;
	private String name;
	private int price;
	private Seller seller;
	public Products(int id, String name, int price, Seller seller) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.seller = seller;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Seller getSeller() {
		return seller;
	}
	
	
}
