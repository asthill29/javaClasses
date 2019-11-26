package com.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        // TASK 1 find the largest number using if - else ...if
        System.out.println("Please enter 3 distinct numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is first, which equals to " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number is second, which equals to  " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Largest number is third, which equals to  " + num3);
        } else {
            System.out.println("Numbers can not be equal to each other, please try again");
            /*double num4 = scan.nextDouble();
            double num5 = scan.nextDouble();
            double num6 = scan.nextDouble();
            if (num4 > num5 && num4 > num6) {
                System.out.println("Largest number is first, which equals to " + num4);
            } else if (num5 > num4 && num5 > num6) {
                System.out.println("Largest number is second, which equals to  " + num5);
            } else if (num6 > num4 && num6 > num5) {
                System.out.println("Largest number is third, which equals to  " + num6);
            } else {
                System.out.println("Invalid entry");
            }*/
        }
        System.out.println("************************task2**************************");
        
        // TASK 2 find the largest number using nested if
        
        System.out.println("Please enter 3 distinct numbers for Nested If Task");
        
        double no1 = scan.nextDouble();
        double no2 = scan.nextDouble();
        double no3 = scan.nextDouble();
        
        if (no1>no2) {
            if(no1>no3) {
                System.out.println("Largest number is first - " + no1);
            } else {
                System.out.println("Largest number is third - " + no3);
            }
        }else {
            if(no2>no3) {
            System.out.println("Largest number is second - "+ no2);
            } else {
                System.out.println("Largest number is third - " + no3);
            }
        }
        
      //different way adding number are equals
 System.out.println("Please enter 3 distinct numbers for Nested If Task");
        
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        
       if (n1 != n2 || n2 != n3) { 
        	if (n1>n2) {
        		if(n1>n3) {
                System.out.println("Largest number is first - " + n1);
        		} else {
                System.out.println("Largest number is third - " + n3);
        		}
        		}else {
        			if(n2>n3) {
        				System.out.println("Largest number is second - "+ n2);
        			} else {
        				System.out.println("Largest number is third - " + n3);
                    }
              }
        
       }else {
    	   System.out.println("Numbers are equals");
       }
        
        
	}
}
