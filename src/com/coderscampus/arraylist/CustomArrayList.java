
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
				items=arrayIsFull(items);
				
				System.out.println(Arrays.toString(items));
			}
			
			
			for(int i=0; i<items.length;i++) {
				items[size]=item;
				
				System.out.println(item);
				size++;
				System.out.println(size);
				System.out.println(Arrays.toString(items));
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

//	I reviewed your get and getSize methods. The get method should return the item at the specified index, not null, and it should check if the index is within the bounds of the array.
//			The getSize method should return the number of items in the list, not the length of the underlying array. It should return size, not items.length.
	@Override
	public int getSize() {
int counter=0;

for(Object item:items) {

		if (item != null&& counter!=items.length) {
			
			 counter++;
		} 
		
		System.out.println(counter);
		
		return counter;
}

		return 0;
	}

	@Override
	public T get(int index) {
		
		
		int i=index;
		if(index>=0 && index<items.length){
// if index is at least zero and less than the length of the array
		// link to newItems or items pick one or the other
		if (items[index] != null) {
			System.out.println(items[index]);
             return (T) items[i];
		}}
		
		return null;
	}

}
