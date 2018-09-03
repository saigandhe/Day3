package com.capgemini.icici.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeSalaryTest {
	EmployeeSalary employeeSalary;
	
	@BeforeEach
	void setUp() {
		employeeSalary = new EmployeeSalary(157690, "Naveena",250000,1500);
	}
	@Test
	void testEmployeeSalary() {
		assertEquals(250000,EmployeeSalary.calSalary,358000);
		
	}

}
