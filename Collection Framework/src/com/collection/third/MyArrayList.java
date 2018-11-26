package com.collection.third;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayList {

	ArrayList<Integer> arrayList;
	
	public static void main(final String[]  args) {
		
		
		MyArrayList obj=new MyArrayList();
		obj.add();
		obj.display();
	}
	public void add(){
		arrayList=new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
	}
	
	public void display(){
		
		ListIterator<Integer> listIterator=arrayList.listIterator();
		System.out.println("Forward");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		System.out.println("Backward");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
	}
}
