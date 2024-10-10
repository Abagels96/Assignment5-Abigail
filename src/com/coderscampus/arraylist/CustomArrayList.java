package com.coderscampus.arraylist;

import java.util.Arrays;


// to add an element to an array we need to 
//make sure that it is still the same array 
//a. check and see if there is an index that we can add to 
//b.find where the first empty space would be
//c. we now need to determine if the current array is full
// d. then have it double in size somehow probably with newItems

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	
	
	public int counter=1;

	Object[] newItems= new Object[items.length*counter];

	@Override
	public boolean add(T item) {
	
		if(arrayIsFull()==true) {
			counter++;
		}
		System.out.println(item);
			
			System.out.println(Arrays.toString(items));
			for(int i=0;i<items.length; i++)
			if(newItems[i]==null) {
		items[i]=item;
		newItems[i]=items[i];

		
	System.out.println(Arrays.toString(newItems));
	return true;
			}
			
			System.out.println(Arrays.toString(newItems));
			
	
	return false;
	
	
	
	}







	public boolean arrayIsFull() {
		for(Object element:items) {
				if(element==null) {
					System.out.println("the array is empty");
				}
				else {
					System.out.println("The array is full");
		           
		          
				}
		}  return true;
	}

	
		
			
			
			

	@Override
	public int getSize(
			
			) {
		
		
	
		return 0;
	}

	@Override
	public T get(int index) {

			if (newItems[index]!=null) {
				System.out.println(newItems[index]);
				
		}
		
		return null;
	}
	
}
