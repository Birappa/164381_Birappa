package com.sample.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Order {

	public static void main(String[] args) {
		ArrayList<Item> arrayList=new ArrayList<Item>();
		arrayList.add(new Item("Burger", 1000,"ACCEPTED"));
		arrayList.add(new Item("Pizza", 20000,"COMPLETED"));
		arrayList.add(new Item("Coffee", 15000,"COMPLETED"));
		arrayList.add(new Item("Coke", 10000,"ACCEPTED"));



		Predicate<Item> check=(items)->{
			boolean trueFalse=items.getOrderStatus().compareTo("ACCEPTED")==0||items.getOrderStatus().compareTo("COMPLETED")==0;
			if(items.getPrice()>=10000&&trueFalse)
				return true;
			else
				return false;

		};

		//ArrayList<Item> order=new ArrayList<Item>();
		Iterator<Item> iterator=arrayList.iterator();
		while(iterator.hasNext()){
			Item item1=iterator.next();
			
			if(check.test(item1))
				System.out.println(item1);
				//order.add(item1);
		}
		//System.out.println(order);
	}
}
