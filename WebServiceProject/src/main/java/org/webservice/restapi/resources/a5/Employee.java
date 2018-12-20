package org.webservice.restapi.resources.a5;

public class Employee {

	private static int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private String employeeDesignation;
	private int employeeSalary;
	
	{
		employeeId++;
	}

	public Employee(String employeeName, String employeeDepartment,
			String employeeDesignation, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	public static int getEmployeeId() {
		return employeeId;
	}

	public static void setEmployeeId(int employeeId) {
		Employee.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName
				+ ", employeeDepartment=" + employeeDepartment
				+ ", employeeDesignation=" + employeeDesignation
				+ ", employeeSalary=" + employeeSalary + "]";
	}
	
	
}
