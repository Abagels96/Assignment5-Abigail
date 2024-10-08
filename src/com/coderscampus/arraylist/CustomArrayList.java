package com.coderscampus.arraylist;

import java.util.Arrays;

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
		
		newItems[i]=items[i];
		newItems[i]=item;
	System.out.println(Arrays.toString(newItems));
	return true;
			}
			else {
				newItems[i+1]=item;
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
