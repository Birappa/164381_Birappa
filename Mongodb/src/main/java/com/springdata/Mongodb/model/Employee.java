package com.springdata.Mongodb.model;

import org.springframework.data.annotation.Id;

public class Employee {

	@Id
	private long empId;
	private String name;
	private String salary;
	public Employee(long empId, String name, String salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
