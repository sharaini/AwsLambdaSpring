package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HIbernateJsfApplication {	
	public static void main(String[] args) {
		SpringApplication.run(HIbernateJsfApplication.class, args);
		/*Session sesion = HibernateUtilities.getSessionFactory();
		sesion.beginTransaction();
		Employee emp=new Employee();
		emp.setName("sharath");
		emp.setAddress("IA");
		sesion.save(emp);
		sesion.getTransaction().commit();	
		
		sesion.beginTransaction();
		Employee emp1 = (Employee) sesion.get(Employee.class, 1);
		System.out.println(emp1.getName());
		sesion.getTransaction().commit();
		//hibernate returns a proxy hence manipulations to the objects are persisted in the table
		
		sesion.close();*/
	}
}
