package com.class07;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		// how to print numbers from 1 to 20
		
		
		int i=1;
		
		while (i<=20) {
		System.out.println(i);
		i++;
		}
		System.out.println("####################");
		
// i want to print numbers from 10 to 30 in one line
		
		int num=10;
		
		while (num<=30) {
			System.out.print(num+" ");
			num++;
		}

		
		// want to print from 10 to 1
		
		int a=10;
		while (a>=1) {
			System.out.println(a);
			a--;
		}
		
		
		
	//print value from 50 to 20
	
		
		int b=50;
		
		while (b>=20) {
		System.out.print(b+" ");
		b--;
	}
		System.out.println("****************");	
		
// I WANT TO PRINT ALL EVEN NUMBER FROM 1 TO 20
	
		//first way
		
	int c = 2;
	
	while (c<=20) {
		System.out.println(c);
		c+=2;
	}
	// second way using modulus
	
	
	int z = 2;
	
	while (z<=20) {
		
		if (z%2==0) {
			System.out.print(z);
		}
		z++;
	}
	
	
	}

}
