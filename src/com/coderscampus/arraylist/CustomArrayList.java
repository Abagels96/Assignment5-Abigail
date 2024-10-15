
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
	int size = 0;

	@Override
	public boolean add(T item) {
		for(int i=0; i<items.length;i++)		
	items[size] = item;// adding each item
	
		for(int i=0; i<items.length*2;i++) {
			
			
			items[size] = item;// adding each item
		}
		System.out.println(item);
		size++;
		System.out.println(size);
		System.out.println(Arrays.toString(items));
		
		if (size == items.length) {
			System.out.println("Array is full");
			arrayIsFull(items);
			return true;
		}
	
		
		// if array is full then double the items

	


		



		return false;

	}

	public Object[] arrayIsFull(Object[] items) {

		items = Arrays.copyOf(items, items.length * 2);

		System.out.println(Arrays.toString(items));


		return items;
	}

	{
	}

	@Override
	public int getSize() {
		// put different method in case Object are added to the list

		if (items != null) {
			System.out.println(items.length);
			return items.length;
		}

		return 0;
	}

	@Override
	public T get(int index) {

		if (items[index] != null) {
			System.out.println(items[index]);

		}

		return null;
	}

}
