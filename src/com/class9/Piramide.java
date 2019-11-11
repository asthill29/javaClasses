package com.class9;

public class Piramide {

	public static void main(String[] args) {
		
		// rows will be equal to the columns 
		
		// print 
		//*
		//**
		//***
		//****
		//*****
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// print 
	            //1
				//12
				//123
				//1234
				//12345
		
		for (int a=1; a<=5; a++) {
			
			for (int b=1; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();	
		}
		System.out.println("*************");
		
		//task 
		//1
		//22
		//333
		//4444
		//55555
		//666666
		//7777777
		//88888888
		//999999999
		
		for (int a=1; a<=9; a++) {
			
			for (int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
