package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		
		System.out.println(grades[4]);
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		}
		System.out.println("**************");
		
		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		for (int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println("--------------------");
		//create an array to store double values
		//print all in 1 line
		
		double [] num= {1.1, 1.2, 1.3, 1.4, 1.5};
		
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		
		
	}

}
