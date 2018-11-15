package com.sample;

public class Interest {

	public double findSimpleInterest(int principal,int rateOfInterest,int numberOfYears){
		double simpleInterest=(principal*numberOfYears*rateOfInterest)/100;
		return simpleInterest;
		
	}
	
public double findCompoundInterest(double principal,double rateOfInterest,double numberOfYears){
		
		double calc=1+rateOfInterest/100;
		double total=principal*Math.pow(calc,numberOfYears);
		double compoundInterest= total- principal;
		return compoundInterest;
		
	}
}
