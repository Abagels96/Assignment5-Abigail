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
	
			int n=1;
		Object[] newItems= new Object[items.length*n];




	@Override
	public boolean add(T item) {
	
		System.out.println(item);
		
		
		for(int i=0; i<items.length; i++) {
			if (items==null) {
				items=newItems;
				
			}
			else {
				
				n++;
			}
		
		System.out.println(n);
//		for(int z=0; z<items.length;z++) {
//		
//		if(z==items.length-2) {
//			
//			items=newItems;
//	    n++;
//			
//		}
		
	

	}
	
		
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

	
		
			
			
			

	@Override
	public int getSize() {
	
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
