package com.collection.first;


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ServiceProvider {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		
	}

	public static void display(){
		TreeSet<Person> treeSet=new TreeSet<Person>(new Person());
		treeSet.add(new Person("Birappa", 1.1, 60));
		treeSet.add(new Person("Prathyusha", 1.2, 50));
		treeSet.add(new Person("Mihir", 1.3, 70));
		treeSet.add(new Person("Roshan", 1.1, 80));
		treeSet.add(new Person("Suraj", 1.0, 80));
		
		Iterator<Person> iterator=treeSet.iterator();
		while(iterator.hasNext()){
			Person person=iterator.next();
			System.out.println(person.toString());
			//System.out.println("Name : "+person.getName()+"\nHeight : "+person.getHeight()+"\nWeight : "+person.getWeight()+"\n");
		}
	}
}
