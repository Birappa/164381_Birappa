package com.sample.lambda;

public class Lambda {
	public static void main(String[] args) {
		Add addition=(number1,number2)->number1+number2;
		Subtract subtract=(number1,number2)->number1-number2;
		Multiplication multiplication=(number1,number2)->number1*number2;
		Division division=(number1,number2)->number1/number2;
		
		System.out.println(addition.add(4,5));
		System.out.println(subtract.sub(4,5));
		System.out.println(multiplication.mult(4,5));
		System.out.println(division.div(40,5));

	}
	
}

