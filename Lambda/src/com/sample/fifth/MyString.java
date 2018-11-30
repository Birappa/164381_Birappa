package com.sample.fifth;


import java.util.ArrayList;
import java.util.function.Consumer;

public class MyString {

	public static void main(String[] args) {
	

		ArrayList<String> list=new ArrayList<String>();
		list.add("Ashna"); 
		list.add("Birappa");
		list.add("Prathyusha");
		list.add("Roshan");
		list.add("Chhaya");
		
		Consumer<ArrayList<String>> consumer=(words)->{
			 StringBuilder word=new StringBuilder();
			 
			 for(String name:words){
				 word.append(name.charAt(0));
			 }
			 System.out.println(word);
		};
		
		consumer.accept(list);
	}

	


}
