package com.java.programs.streams.scenarioBaedPractice.employee;

import java.util.Arrays;
import java.util.List;

public class Data {

	
	public static List<Employee> getAllEmployees()
	{
		Employee emp = new Employee("Agatha Christie", "ABC101", 30, 50000.00, "Literature", 4);
		Employee emp1 = new Employee("Bethy Night", "ABC102", 25, 35000.00, "Accounts", 2);
		Employee emp2 = new Employee("Christine Paige", "ABC103", 28, 40000.00, "Tech", 3);
		Employee emp3 = new Employee("Daniel Potter", "ABC104", 41, 120000.00, "Accounts", 12);
		Employee emp4 = new Employee("Elizabeth Carter", "ABC105", 24, 15000.00, "Accounts", 1);
		Employee emp5 = new Employee("Frank Delton", "ABC106", 41, 60000.00, "Tech", 5);
		
		
		List<Employee> employeeList = Arrays.asList(emp, emp1, emp2, emp3, emp4, emp5);
		return employeeList;
	}
	

}
