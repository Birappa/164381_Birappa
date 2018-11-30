package com.sample.third;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.sample.second.Item;

public class Predefined {

	public static void main(String[] args) {
		
		Item item=new Item("Burger", 100, "ACCEPTED"); //object creation.
		
		Predicate<String> predicate=(string)->{  //use of predefined Predicate functional interface.
			if(string.compareTo("ACCEPTED")==0||string.compareTo("Burger")==0)
				return true;
			return false;
		};
		
		Consumer<String> consumer=(itemName)->System.out.println(itemName); //use of Consumer functional interface.
		
		Function<String, Double> function=(itemName)->{ //use of Function functional interface.
			if(predicate.test(itemName))
				return item.getPrice();
			return 0.0;
		};
		
		System.out.println(predicate.test(item.getOrderStatus()));
		consumer.accept(item.getItemName());
		System.out.println(function.apply(item.getItemName()));
	}
}
