package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//declaring an array in 2 lines
		int []b;//preferred way
		int c[];//
		
		b=new int[4];
		
		//declaring an array in 1 line
		int [] array=new int[4];
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		
		//access value from an array
		System.out.println(array[2]);
		
		// lets create an array that will store classes we have
		
		String [] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//print= Today I have java class
		System.out.println("Today we have "+classes[0]+" class");
		
		
		
		int [] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how to change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		//the size of an array is fixed
		String [] names=new String[3];
		
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="Olga"; during run time we will get the exception 
		//because we only declare 3 value and not 4 
		
		//System.out.println(names[3]);
		
		// we are putting less elements inside -->compiler will
		// give default values
		// default= int=0 string=null boolean=false
		int [] num=new int[4];
		num[1]=100;
		num[3]=200;
		System.out.println(num[2]);
		
		
		
	}

}
