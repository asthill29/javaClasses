package com.class30;

public interface Shape {
	
	void calculateArea();
	void calculatePerimeter();
}
class Circle implements Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area Of Circle is: " + 3.14*radius*radius );
	}
	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter Of Circle is: " + 3.14*2*radius );
	}
}
class Square implements Shape{
	double edge;
	Square(double edge){
		this.edge=edge;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area Of Square is: " + edge*edge );
	}
	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter Of Square is: " + 4*edge );
	}

}
