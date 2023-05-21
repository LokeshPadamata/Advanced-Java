package com.spring.setterDI;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource r = new ClassPathResource("applicationContext.xml");
    	XmlBeanFactory factory = new XmlBeanFactory(r);
    	Employee employee = (Employee) factory.getBean("employee");
    	System.out.println(employee.getName());
    	System.out.println(employee.getSalary());
    }
}
