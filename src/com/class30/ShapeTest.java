package com.class30;

public class ShapeTest {
	
	public static void main(String [] args) {
	
	Shape circle=new Circle(23.2);
	circle.calculateArea();
	circle.calculatePerimeter();
	Shape square=new Square(3);
	square.calculateArea();
	square.calculatePerimeter();
}

}
