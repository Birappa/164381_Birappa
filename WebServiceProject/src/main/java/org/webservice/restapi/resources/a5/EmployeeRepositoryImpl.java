package org.webservice.restapi.resources.a5;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	Map<Integer,Employee> employees;
	
	public EmployeeRepositoryImpl() {
		super();
		employees=new HashMap<Integer, Employee>();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		
		return employees.get(employeeId);
	}

	@Override
	public Employee updateEmployee(int employeeId,Employee employee,String operation) {
		if(operation.equals("add")){
			return employees.put(employee.getEmployeeId(), employee);
		}
		else if(operation.equals("update")){
			return employees.replace(employeeId, employee);
		}
		else if(operation.equals("delete")){
			return employees.remove(employeeId);
		}
		return null;
	}

	@Override
	public Map<Integer,Employee> getAllEmployees() {
		return employees;
	}

	
}
