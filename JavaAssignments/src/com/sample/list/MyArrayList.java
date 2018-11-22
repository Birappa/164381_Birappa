package com.sample.list;

public class MyArrayList implements MyList {

	private int array[];
	private int rear;
	private int front;
	private final int MAXSIZE;
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		MAXSIZE=10;
		array=new int[MAXSIZE];
		rear=0;
		front=-1;
	}
	@Override
	public boolean add(int number) {
		// TODO Auto-generated method stub
		if(isFull()){
			System.out.println("Array is full");
		}
		else{
			this.array[rear++]=number;
			if(front==-1)
				front=0;
			return true;
		}
		return false;
	}

	@Override
	public int get(int index) {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("There is no element in the Array");
		}
		else{
			try {
				return this.array[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Array index is Out Of Bound ");
			}
			
		}
		return 0;
	}

	@Override
	public String getAll() {
		// TODO Auto-generated method stub
		String arrayElements="[ ";
		for(int i=front;i<=rear;i++){
			arrayElements+=array[i];
			if(i==rear){
				arrayElements+=" ]";
			}
			else
				arrayElements+=", ";
		}
		return arrayElements;
	}

	@Override
	public boolean update(int index, int number) {
		// TODO Auto-generated method stub
		try {
			this.array[index]=number;
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Index is Out Of Bound ");
			return false;
		}
		
	}

	@Override
	public int remove() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Array is Empty");
			
		}
		else{
			int element=array[front];
			swapArrayElement(array);
			return element;
		}
		return 0;
	}

	private void swapArrayElement(int[] array2) {
		// TODO Auto-generated method stub
		if(rear==0){
			array2[front]=0;
			front=-1;
		}
		else if(rear>0){
			for(int i=front;i<rear;i++){
				array2[i]=array2[i+1];
			}
			rear--;
		}
	}
	private boolean isFull(){
		if(rear==MAXSIZE)
			return true;
		return false;
	}
	
	private boolean isEmpty(){
		if(front==-1)
			return true;
		return false;
	}
	
	
}
