package com.example.repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.WrapperSessionFactory;
import com.example.model.Employee;
@Repository
public class EmployeeRepository{
	@Autowired
	private WrapperSessionFactory wrsessionFactory;
	
	public void save(Employee emp){
		Session session = wrsessionFactory.sessionFactory.getCurrentSession();
		session.save(emp);
	}
	
}
