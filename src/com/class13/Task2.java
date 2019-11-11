package com.class13;

public class Task2 {

	public static void main(String[] args) {
		
		
		// create a String and print it in reverse order (Sunday --> yadnuS)
		
		String day="Sunday";
		for (int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		
		System.out.println();
		// to print the middle of the string 
		String str="Hello";
		 
		int lenght =str.length();
		int middle=str.length()/2;
		
		if (str.isEmpty()) {
			  if (lenght%2!=0 && lenght>=3) {   //it should be a reminder
		
				  
			  }
			  
		  }
		System.out.println(str.charAt(middle));
		
		
		
	}

}
