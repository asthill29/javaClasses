package com.class14;

public class interviewQuestion {

	public static void main(String[] args) {
		/*Java IQ
Part 1: Programming Questions
*Write a program to swap 2 numbers without a temporary variable? 
Swap  2 strings without a temporary variable?
*Write a java program to find the second largest number in the array? 
  Maximum and minimum number in the array?
*Find out how many alpha characters present in a string?
 How to find out the part of the string from a string? What is substring? 
Find number of words in string?
*
*Write a java program to reverse String? Reverse a string word by word?
*Write a Java Program to find whether a String is palindrome or not?
*Write a java program to check whether a given number is prime or not?
*Write a Java Program to print first 10 numbers of Fibonacci series.
* 
* 
 */
		
		//task 1
	// Swap two numbers without a temporary variable
				int x=21;
				int y=7;
				
				x=x+y; // 21+7=28
				y=x-y;//  28-7=21
				x=x-y; // 28-21=7
				
	//After swamping
		System.out.println("After swamping x = " + x+" y= " +y);
		
	//teacher way	
		String a="Morning";
		String b="Evening";
		
		a=a+b;
			
		b=a.substring(0,7);
			
		a=a.substring(7);
				
		// After swamping
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		//Swap two String without a temporary variable
		//group way
		
				String i="Good Morning";
				String j="Good Evening";
				i=i+j;
			
				j=i.substring(0,i.length()-j.length());
			
				i=i.substring(i.length()-j.length(), i.length());
				
				// After swamping
				System.out.println("i: "+ i+ " j: " + j);
	}

}
