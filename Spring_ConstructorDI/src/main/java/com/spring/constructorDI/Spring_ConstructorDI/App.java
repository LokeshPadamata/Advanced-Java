package com.spring.constructorDI.Spring_ConstructorDI;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);
        
        
        Employee employee = (Employee) factory.getBean("employee");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Address: " +employee.getAddress());
        System.out.println("Employee salary: " + employee.getSalary());
    }
}
