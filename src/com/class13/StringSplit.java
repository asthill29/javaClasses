package com.class13;

public class StringSplit {

	public static void main(String[] args) {
		
//if they ask u how many words in a string u use the .split() with the space
//if they ask u how many letters in a string u use the .length() 		
		
		// split.(); separate your string by the character you indicate
		
		String str="Welcome Syntax Students Batch 5";
		String [] array=str.split("s");
		System.out.println(array.length);
		
		//to print the value of the String not the length
		
		for (String substring: array) {   //each loop
			System.out.println(substring);
			
		}
		
		System.out.println("########");
		
		for (int i=0; i<array.length; i++) { //for loop
			System.out.println(array[i]);
		}
		
		// how many sentences are in a string 
		// 1 change to an array using .split();
		//2 do a for loop 
		// split after the . or spaces 
		
		String str2="Today is Sunda. Its a sunny day. And we are having Java.";
				
		String [] array1=str2.split("\\.");
		System.out.println(array1.length);
		
		
		
	}

}
