package com.OOPS.Polymorphism;

//WAP to find getAreas of Square, Triangle, Circle, Rectangle
//Square = side * side
//Triangle = 0.5 * base * height
//Rectangle = length * breadth
//Circle = PIE * R * R
public class GetAreas {

	// Area of Square
	double getArea(double side) {
		return side * side;
	}

	//Area of Triangle
	double getArea(double base, double height) {
		return 0.5 * base * height;
	}

	//Area of Circle
	double getArea(float radius) {
		return Math.PI * radius * radius;
	}

	//Area of Rectangle
	double getArea(float length, float breadth) {
		return length * breadth;
	}

	void main(String[] args) {
		System.out.println("Main method Started");

		System.out.println("Area of Square : " + getArea(10));
		System.out.println("Area of Triangle : " + getArea(35.5, 78.6));
		System.out.println("Area of Circle : " + getArea(9.5));
		System.out.println("Area of Rectangle : " + getArea(10,10));
	}

}
