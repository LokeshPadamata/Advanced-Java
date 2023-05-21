package com.spring.setterDIDependantobj.setterDependencyInjectionDependantobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext r = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Product product = (Product) r.getBean("product"); 
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getSeller().getAddress());
    }
}
