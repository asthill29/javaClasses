package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		
// length function or method -->returns number of character or spaces in String
	// .length();
		
		String str="Syntax";
		
		int length=str.length();
		 System.out.println(length);
		
		 
		 String str1="Syntax Technologies";
		 System.out.println(str1.length());
		 
		 
		 String str2="Welcome, students!";
		 System.out.println(str2.length());
		 
		 System.out.println("------------");
		 
		
		 // to upper case   toUpperCase();
		 
		 String str3="Hello";
		 String newString=str3.toUpperCase();
		 System.out.println(newString);
		 
		 // to lower case    toLowerCase();
		 
		 
		 String lower=newString.toLowerCase();
		 System.out.println(lower);
		 
		 // to compare String .equals();
		 // will give you true or false output 
		 
		 String str4="Hello";
		 String str5="hello";
		 boolean equality=str4.equals(str5);
		 System.out.println(equality);
		 
//equalsIgnoreCase(); - compare 2 strings but ignores case(lower or upper)		 
		 String expectedBrowser="Chrome";
		 String actualBrowser="chrome";
		 
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		 System.out.println(equals);
		 
		
		 
	}	

}
