package com.coderscampus.arraylist;

import java.util.Arrays;


// to add an element to an array we need to 
//make sure that it is still the same array 
//a. check and see if there is an index that we can add to 
//b.find where the first empty space would be
//c.

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
		int n=items.length;
Object[] newItems= new Object[n+1];



	@Override
	public boolean add(T item) {
	
		System.out.println(item);
			
		
		
			System.out.println(Arrays.toString(items));
			for(int i=0;i<items.length; i++)
			if(items[i]==null) {
		items[i]=item;
		newItems[i]=items[i];
		
	System.out.println(Arrays.toString(newItems));
	//System.arraycopy(newItems, i, items[i], i, n);
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
