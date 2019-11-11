package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		
 //contains(); -- check for specific value in the string 
		//if value is present --true, else--false
		
		String str="Good morning, students!";
		boolean contains=str.contains("students");
		 System.out.println(contains);
		
		String present="Welcome, Asel";
	
		String neededValue="Welcome,";
		
		boolean flag=present.contains(neededValue);
		 System.out.println(flag);  //true because neededValue has welcome also
		 
		 
		boolean flag1 = present.toLowerCase().contains(neededValue);
		 System.out.println(flag1);//false because we changed to lower case
		 // and neededValue has the Welcome with cap W
		 
		 System.out.println("_______StratWith & endwith______");
		 
		 //startsWith(); endsWith()	--> will return true or false value	 
		 String str1="syntax";
		boolean starts= str1.startsWith("s");
		 System.out.println(starts);
		 
		 
		 System.out.println(str1.endsWith("x"));
		 
		 System.out.println("************");
		
		 //isEmpty(); if length of string is=0 --> string is empty else is not
; 		 String str2="";
		 boolean isEmpty=str2.isEmpty();
		 System.out.println(isEmpty);
		 
//concat()--> will concatenate 1 string to the end of another
		 
		 String str3="Hello ";
		 String str4="Ali!";
		 System.out.println(str3+str4);
		 System.out.println(str3.concat(str4));
		 
		 System.out.println("_______________");

//trim(); --> will removed spaces at the beginning and at the end of your string
		 String expected="You may qualify for a multi-policy discount!";
		 String actual="  You may qualify for a multi-policy discount! ";
		 
		actual=actual.trim();
		 System.out.println(expected.equals(actual));
		 //or 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
