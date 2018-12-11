package com.spring.bank.BankDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld helloWorld=context.getBean(HelloWorld.class);
		helloWorld.display();
	}

}
