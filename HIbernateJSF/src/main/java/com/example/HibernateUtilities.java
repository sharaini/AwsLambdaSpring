package com.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtilities {
	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistryBuilder serviceRegistryBuilder;
	
	static{
		try{
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(serviceRegistryBuilder.build());
		}
		catch(HibernateException ex){
			ex.printStackTrace();
		}
	}
	
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
		 
}
