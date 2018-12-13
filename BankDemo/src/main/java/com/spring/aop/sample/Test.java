package com.spring.aop.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	

		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Alien alien = context.getBean(Alien.class);
		alien.show();
	}

}
