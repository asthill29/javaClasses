package com.class18;

public class Task {

	public static void main(String[] args) {
		
      Task task1=new Task ();
      task1.nums(500, 100); // argument
      task1.nums(200, 400);
      task1.nums(20, 20);
      
      System.out.println("---------");
      
      Task task2=new Task ();
      task2.num(123);
      task2.num(50);
      
      System.out.println("--------");
      Task task3=new Task ();
      task3.word("kayak");
      task3.word("bye");
      
	}
 //methodName   //2 int parameters
	void nums (int a, int b) {
		
		if (a>b) {
			System.out.println("The largest number is a "+a);
		}else if (b>a){
			System.out.println("The largest number is b "+b);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	void num(int a) {
		
		if (a % 2 == 0) {
			System.out.println("It is an even number");
		}else {
			System.out.println("It is an odd number");
		} 
	}
	
	void word (String name) {
		
		String reverse = "";
        for (int i =name.length() - 1; i >= 0; i--) {
              reverse = reverse + name.charAt(i);
        } 
		if (name.equals(reverse)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
        }
		
	}
}
