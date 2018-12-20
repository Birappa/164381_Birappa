package com.spring.eight;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy method");		
		
	}
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
