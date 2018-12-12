package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("first.xml");
		Customer customer=context.getBean(Customer.class);
		System.out.println(customer.toString());
	}

}
