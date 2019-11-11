package com.class7;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter the first number : ");
	        int a = sc.nextInt();
	        System.out.println("Please enter the second number : ");
	        int b = sc.nextInt();
	        System.out.println("Please enter the operator you wish to use : ");
	        char op = sc.next().charAt(0);
	        double result = 0.0;
	        
	        switch(op) {
	        case '+' :
	            result = a+b;
	            break;
	        case '-' :
	            result = a-b;  //Math.abs(a-b);
	            break;
	        case '*' :
	            result = a*b;
	            break;
	        case '/' :
	            result = a/b;
	            break;
	        case '%' :
	            result = a%b;
	            break;
	        default :
	            System.out.println("Invalid operator.");
	            
	        }
	        
	        System.out.println("The result is : " + result);
	        
	    }
		
		
		
	}


