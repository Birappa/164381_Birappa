package org.webservice.restapi.resources.a5;

import java.util.Map;

public interface EmployeeRepository {

	public Map<Integer,Employee> getAllEmployees();
	public Employee getEmployee(int employeeId);
	public Employee updateEmployee(int employeeId,Employee employee,String operation);
	
}
