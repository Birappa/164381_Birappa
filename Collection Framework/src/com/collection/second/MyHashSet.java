package com.collection.second;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyHashSet {

	HashSet<Integer> hashSet;
	LinkedHashSet<Integer> linkedHashSet;
	
	public static void main(String[] args) {
		MyHashSet obj=new MyHashSet();
		obj.add();
		obj.display();
	}
	
	public void add(){
		hashSet=new HashSet<Integer>();
		linkedHashSet=new LinkedHashSet<Integer>();
		
		hashSet.add(50);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(10);
		hashSet.add(20);
		
		linkedHashSet.add(50);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		
	}
	
	public void display(){
		System.out.println("----HashSet Which Is Unordered-----");
		Iterator<Integer> iterator=hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("----LinkedHashSet  Which Is Ordered-----");
		iterator=linkedHashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}

