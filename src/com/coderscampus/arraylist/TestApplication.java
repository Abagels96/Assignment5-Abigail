package com.coderscampus.arraylist;

public class TestApplication {

	public static void main(String[] args) {

		CustomArrayList<String> customArrayList= new CustomArrayList<String>();

		
		
		for(int i=0; i<10;i++) {
			customArrayList.add("item " + i );
			
		}
		System.out.println(customArrayList.get(4));
		System.out.println(customArrayList.get(6));
System.out.println(customArrayList.get(11));
		System.out.println(customArrayList.getSize());
		System.out.println(customArrayList.get(0));



	}

}
