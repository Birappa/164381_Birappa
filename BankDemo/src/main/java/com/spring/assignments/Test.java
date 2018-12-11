package com.spring.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bank.BankDemo.HelloWorld;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		//Customer customer=context.getBean(Customer.class);
		ApplicationContext context= new ClassPathXmlApplicationContext("a2.xml");

		Question question=context.getBean(Question.class);
		System.out.println(question.toString());
		
	}

}
