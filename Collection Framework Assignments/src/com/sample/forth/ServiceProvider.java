package com.sample.forth;





public class ServiceProvider {

	public static void main(String[] args) {
		
		MyDate myDate=new MyDate();
	
		myDate.add(new DateClass(26,11,2018), "Birappa");
		myDate.add(new DateClass(25,11,2008), "Ashna");
		myDate.add(new DateClass(25,11,2018), "Prabhat");
		
		System.out.println(myDate.get(new DateClass(26,11,2018)));
		System.out.println(myDate.get(new DateClass(25,11,2018)));
	}

}