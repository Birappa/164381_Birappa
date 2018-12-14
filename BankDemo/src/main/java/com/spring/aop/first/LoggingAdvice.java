package com.spring.aop.first;

public class LoggingAdvice {

	public LoggingAdvice() {
		
	}

	public void beforeAdvice(){
		System.out.println("Before Advice is called");
	}
	
	public void afterAdvice(){
		System.out.println("After Advice is called");
	}
}
