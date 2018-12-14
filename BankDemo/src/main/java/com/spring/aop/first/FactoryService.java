package com.spring.aop.first;

public class FactoryService {

	public FactoryService() {
		
	}

	public Object getBean(String id){
		if(id.equals("student"))return new JuniorStudent();
		return null;
	}
}
