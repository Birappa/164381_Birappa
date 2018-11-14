package com.sample;

public class Interest {

	public double findSimpleInterest(int principle,int rateOfInterest,int numberOfYears){
		double simpleInterest=(principle*numberOfYears*rateOfInterest)/100;
		return simpleInterest;
		
	}
	
public double findCompoundInterest(int principle,int rateOfInterest,int numberOfYears){
		double compoundInterest=(principle-(principle*Math.pow((1+rateOfInterest/100),numberOfYears)));
		return compoundInterest;
		
	}
}
