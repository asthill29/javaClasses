package com.class14;

public class Task {

	public static void main(String[] args) {
	
		
		// 1 task create a string that will hold a sentence
		// then write a program to get a new string without spaces
		
		String str="Welcome to TT Bank";
		String str1=str.replaceAll("Welcome to TT Bank", "Welcome to class");
      System.out.println(str1.replaceAll(" ", ""));
      
      
      //2 task
      // create a string with letter numbers and special characters 
      // find how many alpha characters are there
      
      String str2="123&$Hello87";
      String str3=str2.replaceAll("\\W", "");
      System.out.println(str3.length());
      
      
      //task 3 
      // how many sentences there are
      
      String str4="Is it saturday? Is It raining? Do we have class today?";
      String [] array=str4.split("\\?");
      System.out.println(array.length);

	}

}
