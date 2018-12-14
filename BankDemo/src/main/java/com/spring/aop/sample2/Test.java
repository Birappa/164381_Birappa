package com.spring.aop.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
	
	}

	public static void main(String[] args) {
	
		//ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("aopSample2.xml");
		MyClass myClass=context.getBean(MyClass.class);
		System.out.println(myClass.getName());
		//myClass.setNumber(111);
		//myClass.setName("Spring");
	}

}
