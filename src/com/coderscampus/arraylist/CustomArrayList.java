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
	
	

	@Override
	public boolean add(T item) {
			
			System.out.println(Arrays.toString(items));
			for(int i=0;i<items.length; i++) {
			if(items[i]==null) {
				
//	items[i]=item;
	items[i]=item;
				System.out.println(item);

while(items[items.length-1]!=null) {
				arrayIsFull(item);}
	return true;
			}
				}
				
			
		
			
	return false;
			
			
	
	}







	public Object[]  arrayIsFull( T item
			) {
		int index=1;
//	
	Object[]newItems= new Object[items.length*index];
		
		for(int i=0; i<items.length;i++) {
		while(items[i]!=null) {
			
			index= index*2;
		newItems=Arrays.copyOf(items, items.length*index);
		newItems[items.length+i]=item;
		
		
		System.out.println(Arrays.toString(newItems));
				
		}}
			
		return newItems;
	
	}{
}

		
			
			
			

	@Override
	public int getSize() {
		//put different method in case Object are added to the list 
		
		if(items!=null) {
			System.out.println(items.length);
		return items.length;
		}
		
	
		return 0;
	}

	@Override
	public T get(int index) {

			if (items[index]!=null) {
				System.out.println(items[index]);
				
		}
		
		return null;
	}
	
}
