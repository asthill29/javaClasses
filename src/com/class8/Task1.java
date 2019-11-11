package com.class8;

public class Task1 {

	public static void main(String[] args) {
	
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
	
		
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("#############");
		
		
		for (int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		//print odd number from 20 to 50 
		
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		//second way
		for (int i=20; i<=50; i++) {
			if ( i % 2 ==1)
			System.out.println(i);
		}
		
		
		System.out.println("***********");
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum= sum+i;
		}
		System.out.println(sum);
		
		System.out.println("*************");
		
		
		int sumAll=0;
		for (int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("___________________");
		// what is the output
		
		int total=2;
		for (int y=1; y<=3; y++) {
			total =total*y;
		}
		System.out.println(total);
	}

}
