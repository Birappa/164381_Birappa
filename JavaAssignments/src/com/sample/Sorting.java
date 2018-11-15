package com.sample;

public class Sorting {

	void bubbleSort(int array[]) 
    { 
        int arraySize = array.length; 
        for (int i = 0; i < arraySize-1; i++) 
            for (int j = 0; j < arraySize-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                   //Swap
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    } 
	
	void selectionSort(int array[]) 
    { 
        int arraySize = array.length; 
  
        // loop 
        for (int i = 0; i < arraySize-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int smallIndex = i; 
            for (int j = i+1; j < arraySize; j++) 
                if (array[j] < array[smallIndex]) 
                	smallIndex = j; 
  
            //Swap
            int temp = array[smallIndex]; 
            array[smallIndex] = array[i]; 
            array[i] = temp; 
        } 
    }
	
	 /*Function to sort array using insertion sort*/
    void insertionSort(int array[]) 
    { 
        int arraySize = array.length; 
        for (int i=1; i<arraySize; ++i)    
            for (int j=i+1;j<arraySize-1;j++) 
            	if(array[i]>array[j]){
            		//Swap
            		int temp=array[i];
            		array[i]=array[j];
            		array[j]=temp;
            	}
    }
    
    public void displayArray(int array[]){
    	int arraySize=array.length;
    	
    	for(int i=0;i<arraySize;i++)
    		System.out.print(array[i]+" ");
    	
    	System.out.println();
    }
}
