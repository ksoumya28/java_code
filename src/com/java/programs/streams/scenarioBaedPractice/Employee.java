package com.java.programs.streams.scenarioBaedPractice;

public class Employee {

	private String name;
	private String employeeId;
	private Integer age;
	private Double salary;
	private String department;
	private Integer expirience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getExpirience() {
		return expirience;
	}

	public void setExpirience(Integer expirience) {
		this.expirience = expirience;
	}

	public Employee() {
		super();
	}

	public Employee(String name, String employeeId, Integer age, Double salary, String department, Integer expirience) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.expirience = expirience;
	}

}
