package com.sample.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyThread  implements Runnable{

	List<Integer> list;
	
	private void add(){
		list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		add();
		Consumer<Integer> consumer=(number)->System.out.println(number);
		for(Integer number:list)
			consumer.accept(number);
	}

}
