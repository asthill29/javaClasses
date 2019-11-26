package com.class14;

import java.util.Scanner;

public class interviewQuestion7 {

	public static void main(String[] args) {
		
		/*Write a java program to check whether a given number 
		*is prime or not?
		* Prime is a number that has to meet 2 conditions:
		* it should be divisible by 1 and by itself ONLY
		* 2, 3, 5, 7, 11, 13, 17, 19, 23
		*/  
			
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

	    
	    
	    //INSTRUCTOR WAY
	    
	    int num1=5;
	    boolean isPrime=true;
	    
	    
	    for(int i=2; i<num1; i++) {
	    	if (num1 % i ==0) {
	    		isPrime=false;
	    		break;
	    	}
	    } 
	    if (isPrime) {
	        System.out.println(num1 + " is a prime number.");
	    }else {
	        System.out.println(num1 + " is not a prime number.");
	    }
	    
	    
	    
	    
	    
	    
	}

}
