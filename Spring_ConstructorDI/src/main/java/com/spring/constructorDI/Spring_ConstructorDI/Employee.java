package com.spring.constructorDI.Spring_ConstructorDI;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private long salary;
	public Employee(int id, String name, String address, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getSalary() {
		return salary;
	}
	
	
	
	
}
