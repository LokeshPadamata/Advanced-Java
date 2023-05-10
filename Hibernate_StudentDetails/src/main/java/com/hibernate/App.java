package com.hibernate;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import antlr.collections.List;

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
        
        //   creating into table
        student.setName("eswar");
        student.setEmail("eswar@gmail.com");
         session.save(student);
        transaction.commit();
        
        //  update
        student.setStudentId(3);
        student.setName("Rahul");
        student.setEmail("rahul111222@gmail.com");
        session.update(student);
        transaction.commit();
        
        
       // delete
        student.setStudentId(5);
        student.setName("Rahul");
        student.setEmail("rahul@gmail.com");
        session.delete(student);
        transaction.commit();
        
        // Retrive 
        Query<Students> query =  session.createQuery("from User");
        List<Students> list =  query.list();
         Iterator<Students> iterator = list.iterator();
         
         while(iterator.hasNext()) {
        	 Students u1 =iterator.next();
        	 System.out.println(u1.getStudentId() + "\t"+ u1.getName()+ "\t"+ u1.getEmail());
         }
    
          
        
    }
}
