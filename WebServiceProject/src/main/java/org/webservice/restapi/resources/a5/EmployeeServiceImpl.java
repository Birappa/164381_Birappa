package org.webservice.restapi.resources.a5;

import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
	
EmployeeRepositoryImpl employeeRepositoryImpl=new EmployeeRepositoryImpl();

	public boolean addEmployee(String employeeName,String employeeDepartment, String employeeDesignation, int employeeSalary){
		Object trueFalse= employeeRepositoryImpl.updateEmployee(0, new Employee(employeeName, employeeDepartment, employeeDesignation, employeeSalary), "add");
		if(trueFalse==null)
			return true;
		return false;
	}
	
	public Employee getEmployee(int employeeId){
		return employeeRepositoryImpl.getEmployee(employeeId);
	}
	
	public Employee deleteEmployee(int employeeId){
		return employeeRepositoryImpl.updateEmployee(employeeId, null, "delete");
	}
	
	public Employee updateEmployee(int employeeId,String employeeName,String employeeDepartment, String employeeDesignation, int employeeSalary){
		Employee employee=employeeRepositoryImpl.getEmployee(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setEmployeeDepartment(employeeDepartment);
		employee.setEmployeeDesignation(employeeDesignation);
		employee.setEmployeeSalary(employeeSalary);
		return employeeRepositoryImpl.updateEmployee(employeeId, employee, "update");
	}
	
	public static void main(String[] args) {
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
		System.out.println(employeeService.addEmployee("Birappa", "java with cloud", "Software Engineer", 20000));
		System.out.println(employeeService.addEmployee("Prathyusha", "J2EE with Cloud", "Trainee", 20000));
		System.out.println(employeeService.getEmployee(2));
		System.out.println(employeeService.updateEmployee(1, "Birappa","J2EE With Cloud","Analyst",20000));
		System.out.println(employeeService.deleteEmployee(2));
	}

	@Override
	public Map<Integer, Employee> getAllEmployees() {
		
		return employeeRepositoryImpl.getAllEmployees();
	}
}
