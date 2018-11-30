package com.sample.eight;
import com.sample.eight.MyThread;





public class Tester  {

	public static void main(String[] args) {
		
		Thread thread=new Thread(new MyThread());
		thread.start();
	}

	
	

}
