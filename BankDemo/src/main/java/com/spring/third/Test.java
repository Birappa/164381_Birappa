package com.spring.third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("third.xml");
		BankAccountController contrller=context.getBean(BankAccountController.class);
		System.out.println(contrller.getBalance(1));
		System.out.println(contrller.deposit(1, 5000));
		System.out.println(contrller.withdraw(1, 10000));
		System.out.println("to account balance " + contrller.getBalance(2));
		System.out.println(contrller.fundTransfer(1, 2, 5000));
		System.out.println("from account balance " + contrller.getBalance(1));
		System.out.println("to account balance " + contrller.getBalance(2));
		
		((ConfigurableApplicationContext)(context)).close();
	}

}
