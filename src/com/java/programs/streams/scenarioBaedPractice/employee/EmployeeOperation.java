package com.java.programs.streams.scenarioBaedPractice.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeOperation {

	public static void main(String[] args) {
		List<Employee> employeeList = Data.getAllEmployees();

		// Find the total number of employees in the company
		System.out.println("Employees in the company: " + employeeList.stream().count() + "\n");
		System.out.println("------------------------------------------------------------------");
		// Calculate the average salary of all employees.

		OptionalDouble avg = employeeList.stream().mapToDouble(Employee::getSalary).average();
		System.out.println("Average salary of employee: " + avg.getAsDouble() + "\n");
		System.out.println("------------------------------------------------------------------");

		// Identify the employee with the highest salary.

		Double maxSalary = employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst()
				.get();
		System.out.println("Max salary: " + maxSalary + "\n");
		System.out.println("------------------------------------------------------------------");

		// Filter employees based on years of experience and count the number of
		// employees with more than 5 years of experience.

		long count = employeeList.stream().filter(e -> e.getExpirience() > 5).count();

		System.out.println("Count of employees whose experience is more than 5: " + count + "\n");
		System.out.println("------------------------------------------------------------------");

		// Find the average age of all employees in a list.

		OptionalDouble age = employeeList.stream().mapToInt(Employee::getAge).average();
		System.out.println("The average age is :: " + age.getAsDouble() + "\n");
		System.out.println("------------------------------------------------------------------");

		// Create a comma-separated string of all distinct names from a list of
		// employees.

		System.out.println("Distinct Names: "
				+ employeeList.stream().map(Employee::getName).distinct().collect(Collectors.joining(",")) + "\n");
		System.out.println("------------------------------------------------------------------");

		// Identify the employee with the second highest salary.

		Double secondHighestSalary = employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println("Second Max salary: " + secondHighestSalary + "\n");
		System.out.println("------------------------------------------------------------------");

		// Check if any employee in the list has a salary greater than a specified
		// amount.

		Employee emp = employeeList.stream().filter(n -> n.getSalary() > 50000).findAny().get();
		System.out.println("Employee with greater than 50000 :" + emp.getName() + "\n");
		System.out.println("------------------------------------------------------------------");

		// Create a map where the key is the employee's department and the value is the
		// count of employees in that department.
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("Map with dept: " + map);
		System.out.println("------------------------------------------------------------------");

		// Find all employees whose names start with a specific letter and collect them
		// into a list.

		System.out.println("Employee details: ");
		employeeList.stream().filter(m -> m.getName().startsWith("C")).map(Employee::getName)
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");

	}

}
