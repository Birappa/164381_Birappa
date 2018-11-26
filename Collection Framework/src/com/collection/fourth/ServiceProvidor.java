package com.collection.fourth;

import java.util.HashMap;



public class ServiceProvidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate myDate=new MyDate();
		DateClass dc=new DateClass(26,11,2018);
		myDate.add(dc, "Birappa");
		myDate.add(new DateClass(25,11,2008), "Ashna");
		myDate.add(new DateClass(25,12,2018), "Prabhat");
		
		System.out.println(myDate.get(dc));
		
		/*HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(10, "hii");
		hm.put(20, "h");
		System.out.println(hm.get(10));*/
	}

}
