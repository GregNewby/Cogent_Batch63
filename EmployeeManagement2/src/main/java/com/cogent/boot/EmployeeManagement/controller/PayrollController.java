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

import com.cogent.boot.EmployeeManagement.entity.Payroll;
import com.cogent.boot.EmployeeManagement.repo.PayrollRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController

@RequestMapping("/api/payroll") //routing
public class PayrollController {
	
	@Autowired
	PayrollRepo payrollRepo;
	
	@GetMapping("/getpayroll")
	public List<Payroll> getPayroll() {
		return payrollRepo.findAll();
	}
	
	@PostMapping("/addpayroll")
	public Payroll addPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll);
	}

}
