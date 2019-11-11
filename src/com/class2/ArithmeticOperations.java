package com.class2;

public class ArithmeticOperations {

	/*
	 * declare 2 variables and initialize them
	 * display result of addition, subtraction, multiplication and division
	 * 
	 */

public static void main (String [] args) {
	
	
	int num1, num2;
	
	num1=20;
	num2=10;
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	
	
	// how can we print value of num1 and num2 in the same line(without the arithmetic)
	
	System.out.println(num1+ ","+num2);
	
	int sum=num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int div=num1/num2;
	// the addition of 2 number is _
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	
	
	System.out.println("The addition of 2 number is "+sum);
	System.out.println("The Subtraction of 2 number is "+sub);
	System.out.println("The multiplication of 2 number is "+mult);
	System.out.println("The division of 2 number is "+div);
	
	
	
}

}
