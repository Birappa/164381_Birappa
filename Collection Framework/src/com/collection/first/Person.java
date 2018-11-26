package com.collection.first;

import java.util.Comparator;

public class Person implements Comparator<Person> {

	private String name;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public int compare(Person arg0, Person arg1) {
		// TODO Auto-generated method stub
		if(arg0.weight==arg1.weight){
			if(arg0.height>arg1.height)
				return 1;
			else
				return -1;
		}
		else if(arg0.weight>arg1.weight)
			return 1;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return "Name   : " + name + "\nHeight : " + height + "\nWeight : "
				+ weight + "\n";
	}
}
