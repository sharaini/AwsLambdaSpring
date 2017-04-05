package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.services.EmployeeService;
@RestController
public class EmployeeController {
	
	//@Autowired
	private EmployeeService empService;
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void insertEmployee(@RequestBody Employee emp){
		empService.save(emp);
	}
}
