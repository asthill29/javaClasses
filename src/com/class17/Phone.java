package com.class17;

public class Phone {

	String brand, name;
	int cost;
	
	void call() {
		System.out.println("I can make call on my "+name);
	}
	void text () {
		System.out.println("I can text with my friends on my "+name);
	}
	void playGames() {
		System.out.println("I can play games on my "+name);
	}
	
	

	
	public static void main(String[] args) {
		
		Phone cell1=new Phone ();
		cell1.brand="Apple";
		cell1.name="Iphone";
		cell1.cost=700;
		cell1.call();
		cell1.text();
		cell1.playGames();
		
		
	}

}
