package com.sample;

public class MyStack {

	private int stackArray[];
	private int maxSize;
	private int top;
	public MyStack(int size){
		stackArray=new int[size];
		maxSize=size;
		top=-1;
	}
	
	public boolean isFull(){
		if(top==maxSize)
			return true;
		return false;
	}
	
	public boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	
	public void push(int number){
		if(isFull()){
			System.out.println("Stack is Overflow");
			return;
		}
		stackArray[++top]=number;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Underflow");
			return -1;
		}
		return stackArray[top--];
	}
}
