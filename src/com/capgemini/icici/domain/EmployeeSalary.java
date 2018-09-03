package com.capgemini.icici.domain;

public class EmployeeSalary {

     public static int calSalary;
	private int employeeId;
     private String employeeName;
     private double HRA;
     private double PF;
     private double basicSalary;
     private double grossSalary;
     private double netSalary;
     private double medical;
     private double PT = 200;
     
     public EmployeeSalary() {
     }
     
     public EmployeeSalary(int employeeId, String employeeName, double basicSalary, double medical )
     {
    	this.employeeId = employeeId;
 		this.employeeName = employeeName;
 		this.basicSalary = basicSalary;
 		this.medical = medical;
    	 
     }
     public double calSalary (double Salary)
	{
		HRA = 0.5*basicSalary;
		PF = 0.12*basicSalary;
		grossSalary = HRA+basicSalary+medical;
		netSalary = grossSalary-(PF+PT);
		return Salary;
	}
     public void displayEmployeeDetails() {
    	 System.out.println("employeeId : " + employeeId + "\nemployee name: " + employeeName +  
 				"\nbasicSalary: " + basicSalary + "\nmedical: " + medical);
     }
 
}
