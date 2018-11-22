package com.intermediate;

public class Printer {

	private static Printer printer = null;
	private static int queue[];
	private static int front, rear;
	private static int maxSize;
	public static Printer getInstance() {
		if(printer == null)
			printer = new Printer();
		return printer;
	}
	
	private Printer(){
		queue=new int[10];
		front=-1;
		rear=0;
		maxSize=10;
	}
	private static boolean isFull(){
		if(rear == maxSize)
			return true;
		return false;
	}
	private static boolean isEmpty(){
		if(front == -1)
			return true;
		return false;
	}
	
	public void givePrint(int paper){
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		queue[rear++]=paper;
		if(front == -1)
			front=0;
	}
	
	public static void getPrint(){
		if(isEmpty()){
			System.out.println("No prints are availables");
			return;
		}
		for(int i=front;i<rear;i++){
			System.out.println("Print "+queue[i]);
		}
		front=-1;
		rear=0;
	}
	
}
