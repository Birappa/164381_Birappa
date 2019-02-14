package com.springdata.Mongodb.repository;

import com.springdata.Mongodb.model.Employee;



public interface EmployeeRepo {
	
	public void create(Employee e);
	
	public Employee readById(long id);
	
	public void update(Employee p);
	
	public int deleteById(long id);
}
