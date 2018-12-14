package com.spring.aop.first;

public class JuniorStudent extends Student {

	public JuniorStudent() {
		
	}

	public String getName(){
		new LoggingAdvice().beforeAdvice();
		return super.getName();
	
	}
}
