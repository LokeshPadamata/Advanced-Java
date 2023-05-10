package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ssreg = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metaData = new MetadataSources(ssreg).getMetadataBuilder().build();
        SessionFactory sessionFactory  =metaData.getSessionFactoryBuilder().build();
        System.out.println("sessionFactory:  " +sessionFactory);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Students student = new Students();
        student.setName("Varun");
        student.setEmail("varun@gmail.com");
        session.save(student);
        transaction.commit();
    }
}
