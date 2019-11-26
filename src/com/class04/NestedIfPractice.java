package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {
	
		
		boolean isFriday=true;
		int day=813;
		
		if (isFriday) {
				System.out.println("Today is Fraiday");
				
				if (day==13) {
					System.out.println("I will watch a scary movie");
				}else {
					System.out.println("I will wacth comedy");
				}
		} else {
			System.out.println("Today is Not Friday");
		}

	}

}
