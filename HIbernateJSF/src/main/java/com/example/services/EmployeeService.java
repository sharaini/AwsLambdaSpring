package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRep;
	
	public void save(Employee emp){
		empRep.save(emp);
	}
	public void update(Employee emp){
		
	}
	public void delete(Employee emp){
		
	}
	
}
