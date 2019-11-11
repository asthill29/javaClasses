package com.class14;

import java.util.Scanner;

public class interviewQuestion7 {

	public static void main(String[] args) {
		
			//Write a java program to check whether a given number 
			//is prime or not?
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
	    boolean b = false;
	    for(int i = 2; i <= num/2; ++i)
	    {
	        // condition for non-prime number
	        if(num % i == 0)
	        {
	            b = true;
	            break;
	        }
	    }
	    if (!b)
	        System.out.println(num + " is a prime number.");
	    else
	        System.out.println(num + " is not a prime number.");

	}

}
