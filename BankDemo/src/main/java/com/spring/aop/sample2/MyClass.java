package com.spring.aop.sample2;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

	private String name;
	private int number;
	public MyClass() {
		name="AOP";
	}
	public String getName() {
		System.out.println("getName is called");
		//throw new RuntimeException();
		return name;
	}
	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	public int getNumber() {
		System.out.println("getNumber is called");
		return number;
	}
	public void setNumber(int number) {
		System.out.println("setNumber is called");
		this.number = number;
	}

}
