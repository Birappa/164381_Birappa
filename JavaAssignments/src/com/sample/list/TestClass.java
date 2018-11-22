package com.sample.list;

public class TestClass {
	
public static void main(String[] args) {
	MyArrayList myArrayList=new MyArrayList();
	System.out.println(myArrayList.add(10));
	System.out.println(myArrayList.add(20));
	System.out.println(myArrayList.add(30));
	System.out.println(myArrayList.add(40));
	System.out.println(myArrayList.add(50));
	System.out.println("get method : "+myArrayList.get(2));
	System.out.println("getAll method : "+myArrayList.getAll());
	System.out.println("update method : "+myArrayList.update(2,100));
	System.out.println("remove method : "+myArrayList.remove());
}
}
