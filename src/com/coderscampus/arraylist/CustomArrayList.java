
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
	//
	int size = 0;

	@Override
	public boolean add(T item) {

		//

		if (size == items.length) {
			System.out.println("Array is full");
			items = arrayIsFull(items);

		}
		else {
			items[size] = item;

			size++;
			return true;}
		

		// if array is full then double the items

		return false;

	}


	{
	}

	@Override
	public int getSize() {
		int counter = 0;

		for (Object item : items) {
			if (item != null) {

				counter++;
			} else {

				System.out.println(counter);
				return counter;
			}

		}
		System.out.println(counter);

		return 0;
	}

	@Override
	public T get(int index) {

		int i = index;
		if (index >= 0 && index < items.length) {
			if (items[index] != null) {
				System.out.println(items[index]);
				return (T) items[i];
			}
		}

		return null;
	}
	public Object[] arrayIsFull(Object[] items) {
		
		items = Arrays.copyOf(items, items.length * 2);
		
		
		return items;
	}

}
