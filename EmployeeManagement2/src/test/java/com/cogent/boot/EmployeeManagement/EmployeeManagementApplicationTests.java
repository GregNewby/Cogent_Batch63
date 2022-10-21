package com.cogent.boot.EmployeeManagement;

import static org.junit.Assert.assertEquals; /////////JUnit 5.8.2

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cogent.boot.EmployeeManagement.controller.ComplainController;
import com.cogent.boot.EmployeeManagement.controller.EmployeeController;

@SpringBootTest
class EmployeeManagementApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testingOne() {
		EmployeeController emp = new EmployeeController();
		//compare the expected to actual
		assertEquals(30, emp.addition());
	}
	
	@Test
	void testingString() {
		ComplainController cont = new ComplainController();
		assertEquals("string", cont.name());
	}
/*
	@Test
	void testingDouble() {
		ComplainController cont = new ComplainController();
		assertEquals(2.5, cont.amt());
	}
*/	
	@BeforeEach // not necessary but behaves before each test.
	void beforeEach() {
		System.out.println("before test");
	}
}
