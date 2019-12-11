package com.class27;
//Create a Class Student that will have 3 subclasses 
//as SyntaxStudent, CollegeStudent, SchoolStudent. 
//Define common behavior within parent class
//and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {
	
	public void study() {
		System.out.println("We have to study every day");
	}
   public void quiz() {
	   System.out.println("We have a quiz every week");
   }

}
class SyntaxStudent extends Student{
	
	public void code() {
		System.out.println("We are leaning coding");
	}
	public void study() {
		System.out.println("We have class every Saturday and Sunday");
	}
}
class CollegeStudent extends Student{
	public void bachelor() {
		System.out.println("They study to get a bachelor");
	}
	public void study() {
		System.out.println("They go to college from Monday to Friday");
	}
}
class SchoolStudent extends Student{
	public void learn() {
		System.out.println("They learm how to read");
	}
	public void study() {
		System.out.println("They finish school at 3:00 PM");
	}
	
}