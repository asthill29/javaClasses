package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your heights");
		
		int heights=scan.nextInt();

		if (heights<5) {
			System.out.println("short (under 5 feet) ");
		}else if (heights>=5 && heights<=6) {
			System.out.println("medium(5 to 6 feet) ");
		}else if (heights>6 && heights<=10) {
			System.out.println("tall (6 feet and over) ");
		}else {
			System.out.println("not valid");
		}
		
		
	}

}
