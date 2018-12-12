package com.spring.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("second.xml");
		Question question=context.getBean(Question.class);
		System.out.println(question.toString());

	}

}
