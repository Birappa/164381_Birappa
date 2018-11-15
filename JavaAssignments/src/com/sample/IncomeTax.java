package com.sample;

public class IncomeTax {

	public double findTaxAmount(int income){
		
		 if(income>=0 && income<=180000)
			 return 0.0;
		 else if(income>180000 && income<=300000)
			 return income*0.10;
		 else if(income>300000 && income<=500000)
			 return income*0.20;
		 else if(income>500000 && income<=1000000)
			 return income*0.30;
		 return 0.0;
	}
}
