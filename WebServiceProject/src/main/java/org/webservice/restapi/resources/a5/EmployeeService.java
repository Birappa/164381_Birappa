package org.webservice.restapi.resources.a5;

import java.util.Map;

public interface EmployeeService {
	public Map<Integer,Employee> getAllEmployees();
	public boolean addEmployee(String employeeName,String employeeDepartment, String employeeDesignation, int employeeSalary);
	public Employee getEmployee(int employeeId);
	public Employee deleteEmployee(int employeeId);
	public Employee updateEmployee(int employeeId,String employeeName,String employeeDepartment, String employeeDesignation, int employeeSalary);
}
