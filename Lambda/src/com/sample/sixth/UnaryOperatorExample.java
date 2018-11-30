package com.sample.sixth;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> list=new ArrayList<String>();
		list.add("Birappa");
		list.add("Prathyusha");
		list.add("Roshan");
		list.add("Chhaya");
		list.add("Ashna");
		UnaryOperator<String> op=words-> words.toUpperCase();

		list.replaceAll(op);
		System.out.println(list);
	}


}
