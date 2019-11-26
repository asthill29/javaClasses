package com.class08;

public class Task2 {

	public static void main(String[] args) {
		
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<=20; i++) {
			if (i%2==0) {
				sumEven = sumEven + i;
			}else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		
		System.out.println("***************");
		
		
		int i=7;
	    
	    while (i<=98){
	      System.out.println(i);
	      i+=7;
	    }

	}

}
