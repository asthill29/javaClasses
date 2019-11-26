package com.class14;

public class InterviewQuestion3 {

	public static void main(String[] args) {
		//Find out how many alpha characters present in a string?
				
		String b=new String("*&&$&*^**^*kjvjvncn4243645,bfdsj^$&%^");
		String bNew= b.replaceAll("[^a-zA-Z]", "");
		System.out.println(bNew);
		System.out.println(bNew.length());
	}

}
