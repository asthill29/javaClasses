package com.class9;

import java.util.Scanner;

public class Task2Nested {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("Enter start number");
		int first=scan.nextInt();
		
		System.out.println("Enter ending number");
		int second=scan.nextInt();
		
		int even=0;
		int odd=0;
		
		for (int i=first; i<=second; i++) {
			
			if (i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
