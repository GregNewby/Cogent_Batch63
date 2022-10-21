/**
 * 
 */
package com.cogent.boot.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.EmployeeManagement.entity.Employee;
import com.cogent.boot.EmployeeManagement.repo.EmployeeRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController

@RequestMapping("/api/employee") //routing
public class EmployeeController {
	
	//http method to creatE rest API Endpoints
	//GET -> select
	//POST-> create
	//PUT-> update ?
	//DELETE -> delete ?
	
	//Read
	
	@Autowired  
	EmployeeRepo employeeRepo;  
	
	
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/getemployee")  //End Point
	public List<Employee> getEmployees() {  
		return employeeRepo.findAll();  
	}  
	
	//creating a post mapping that creates an employee in the database   
	@PostMapping("/addemployee")  //End Point
	public Employee addEmployee(@RequestBody Employee employee) {  
		return employeeRepo.save(employee);  
	}  
	
	//business lobic to be tested by TDD
	public int addition() {
		int a=10;
		int b=20;
		
		return (a+b);
	}
	

}
