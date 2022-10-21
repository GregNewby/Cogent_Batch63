/**
 * 
 */
package com.cogent.boot.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.EmployeeManagement.entity.Complain;
import com.cogent.boot.EmployeeManagement.repo.ComplainRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController

@RequestMapping("/api/complain") // parent directory routing
public class ComplainController {
	
	@Autowired
	ComplainRepo complainRepo;
	
	@GetMapping("/getcomplain") // End Point
	public List<Complain> getComplain() {  
	return complainRepo.findAll();  
	}  
	
	
	@PostMapping("/addcomplain")  //End Point
	public Complain addComplain(@RequestBody Complain complain) {  
		return complainRepo.save(complain);  
	}  

	public String name() {
		return "string";
	}
	
	public double amt() {
		return 2.5;
	}

}
