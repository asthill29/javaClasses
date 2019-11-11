package com.class14;

public class interviewQuestion8 {

	public static void main(String[] args) {
		
		// Write a Java Program to print first 10 numbers 
		//of Fibonacci series.
		//Fibonacci numbers = 0,1,3,5,8,13,15,18,21 
		
		int n = 10, num1 = 0, num2 = 1;
        System.out.print("First " + n + " numbers of fibonaci series: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
	}
	}

}
