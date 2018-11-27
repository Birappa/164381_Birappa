package com.sample.fifth;

import java.util.Hashtable;

public class ServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Employee, Integer> hashtable=new Hashtable<Employee, Integer>();
		System.out.println(hashtable.put(new Employee("Birappa", 50000), 1));
		System.out.println(hashtable.put(new Employee("Roshan", 60000), 2));
		System.out.println(hashtable.get(new Employee("Birappa", 50000)));
	}

}
