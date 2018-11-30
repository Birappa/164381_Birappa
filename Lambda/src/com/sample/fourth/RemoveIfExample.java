package com.sample.fourth;

import java.util.ArrayList;

public class RemoveIfExample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Birappa");
		list.add("Prathyusha");
		list.add("Roshan");
		list.add("Chhaya");
		
		list.removeIf((String name)->name.length()%2!=0);
		
		System.out.println(list);

	}

}
