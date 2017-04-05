package com.example;

import org.hibernate.SessionFactory;

public class WrapperSessionFactory {
	public SessionFactory sessionFactory;
	
	public void WrapperSessionFactory(){
		this.sessionFactory = HibernateUtilities.getSessionFactory();
	}
}
