package com.class9;

public class PatternNumber {

	public static void main(String[] args) {
		// print patter of numbers
		//12345
		//12345
		//12345
		//12345
		
		
		for (int a=1; a<=4; a++) {///control the rows 
			
			for (int b=1; b<=5; b++) {// control the column
				System.out.print(b);
			}
			System.out.println();
		}

		
	System.out.println("_____________");
		// printing 
		//11111
		//22222
		//33333
		//44444
		//55555
		

		for (int a=1; a<=5; a++) {///control the rows 
			
			for (int b=1; b<=5; b++) {// control the column
				System.out.print(a);
			}
			System.out.println();
		
		}
		System.out.println("_________");
		
		//task
		/* 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 * 123456789
		 */
		
		
		for (int a=1; a<=5; a++) {
			
			for (int b=1; b<=9; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("_________");
		//task3
		
		/* 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */

		for (int a=1; a<=5; a++) {
			
			for (int b=5; b>=1; b--) {
				System.out.print(b);		
			}
			System.out.println();
			
		}
		System.out.println("_________");
		
		
		//task4
		
		/*55555
		 *44444
		 *33333
		 *22222
		 *11111
		 */
		
		for (int a=5; a>=1; a--) {
			
			for (int b=5; b>=1; b--) {
				System.out.print(a);
			}
			System.out.println();	
		}

		
	}

}
