package com.class15;

public class StringManipulatons {

	public static void main(String[] args) {
		
		// string class comes in java lang pacake
		// 2 ways to create a String
		
		//1 way using String literal
		String str="Hello";
		
		//2 way using new keyword 
		String str1=new String("hello");
		
			System.out.println(str);
			System.out.println(str1);
		
		
// inside String class we have many methods that we can performed on Strings 

// 1. how many letters in the string --> we use .length();
			int length=str.length();
			System.out.println(length);
		
//2. --> .toLowerCase(); or toUpperCase();
			str=str.toLowerCase();
			System.out.println(str);
//3.verify if the String is Empty
		String str2="";
		boolean str3=str2.isEmpty();
		System.out.println(str3);

		String myString=null; //no value at all it is equal to String myString;
		// but its not empty it ill give an error 
		
		// System.out.println(myString.isEmpty()); 
			
		
		
		//how to verify existence of characters sequence in the string
		//how to see the begin and ends of a string
		String a="Good evenin students";
		boolean b=a.contains("students");
		System.out.println(b);
			
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
		
	}

}
