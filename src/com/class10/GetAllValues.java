package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		// I want to print all values from an array
		// when value is dog --> I love dogs
		
		
		String[] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		
		for (int i=0; i<animals.length; i++) {
			
			if (i==1) {
				System.out.println("I love dogs");
						
				}else {
					System.out.println(animals[i]);
				}
			}
			
		System.out.println("###############");	
		
		//second way
		
		String[] animals2 = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		
		for (int i=0; i<animals2.length; i++) {
			
			if (animals2[i].equals("Dog")) {
				System.out.println("I love dogs");
						
				}else {
					System.out.println(animals2[i]);
				}
			}
		
		
		
		

	}

}
