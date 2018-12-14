package com.spring.aop.first;

public class App {

	public App() {
		 	}

	public static void main(String[] args) {
		
		FactoryService factoryService=new FactoryService();
		Student student=(Student) factoryService.getBean("student");
		student.setName("Sara Ali Khan");
		System.out.println(student.getName());

	}

}
