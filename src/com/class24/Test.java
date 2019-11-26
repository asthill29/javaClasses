package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		System.out.println(Child1.race);
		System.out.println(c1.hairColor);
		System.out.println(c1.eyeColor);
		c1.sing();
		c1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.sing();
		//parent.code();compiler will give an error
		
		Child2 c2=new Child2();
		System.out.println(Child2.race);
		System.out.println(c2.hairColor);
		System.out.println(c2.eyeColor);
		c2.sing();
		//c2.code(); compiler gives an error because child2 cannot inheritance 
		// code() from child1. Child2 only has access to parent 
		c2.dance();
		

	}

}
