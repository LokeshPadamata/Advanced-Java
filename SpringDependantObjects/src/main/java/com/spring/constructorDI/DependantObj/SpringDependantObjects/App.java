package com.spring.constructorDI.DependantObj.SpringDependantObjects;


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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Products products = (Products)context.getBean("products");
        System.out.println(products.getPrice());
        System.out.println(products.getSeller().getAddress());
        System.out.println(products.getSeller().getSellername());
    }
}
