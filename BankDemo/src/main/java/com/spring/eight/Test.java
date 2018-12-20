package com.spring.eight;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	/*	 //AbstractApplicationContext context=new ClassPathXmlApplicationContext("eight.xml");
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(Employee.class);
	Employee employee=context.getBean(Employee.class);
	employee.setName("Birappa");
	System.out.println(employee);
 context.registerShutdownHook();*/
		
		String str="hii";
		str.concat(" hello");
		System.out.println(str);
	}


}
