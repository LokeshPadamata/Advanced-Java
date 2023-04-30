package com.genricservlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Genericservlets extends GenericServlet {

    /**
	 * 
	 */
	
	/**
     * Default constructor. 
     */
    public Genericservlets() {
        // TODO Auto-generated constructor stub
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Method is called");
	}

}
