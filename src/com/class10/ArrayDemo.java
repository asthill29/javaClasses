package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		
		//to find the # of elements inside 
		//an array we use .lenght(property of an array)
		System.out.println(nums.length);
		
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		System.out.println("I was born in "+array[2]);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		
	}

}
