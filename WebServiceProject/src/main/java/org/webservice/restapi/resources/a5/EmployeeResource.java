package org.webservice.restapi.resources.a5;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/EmployeeManagementSystem")
public class EmployeeResource {
EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
	
int var=0;
	@POST
	@Path("/addEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/x-www-form-urlencoded")
	public boolean addEmployee(@FormParam("employeeName")String employeeName,
			@FormParam("employeeDepartment")String employeeDepartment,
			@FormParam("employeeDesignation")String employeeDesignation,
			@FormParam("employeeSalary")int employeeSalary){
		
		return employeeServiceImpl.addEmployee(employeeName, employeeDepartment, employeeDesignation, employeeSalary);
	}
	
	@POST
	@Path("/getEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/x-www-form-urlencoded")
	public Employee getEmployee(@FormParam("employeeId")int employeeId){
		return employeeServiceImpl.getEmployee(employeeId);
	}
	
	@POST
	@Path("/deleteEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes("application/x-www-form-urlencoded")
	public Employee deleteEmployee(@FormParam("employeeId") int employeeId){
		return employeeServiceImpl.deleteEmployee(employeeId);
	}
	
	@POST
	@Path("/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public Map getAllEmployees(){
		return employeeServiceImpl.getAllEmployees();
	}
	
	@POST
	@Path("/check")
	public int check(){
		var=10;
		return var;
	}
	
	@POST
	@Path("/getVar")
	public int getVar(){
		return var;
	}
}
