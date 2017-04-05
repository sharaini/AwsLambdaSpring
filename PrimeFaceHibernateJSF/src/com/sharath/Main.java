package com.sharath;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sharath.data.Employee;

public class Main {
	public static void main(String[] args){
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		Session session = factory.getCurrentSession();
		
		session.getTransaction().begin();
		Employee emp = new Employee();
		emp.setName("manish");
		emp.setAddress("NJ");
		session.save(emp);
		session.getTransaction().commit();
	}
}
