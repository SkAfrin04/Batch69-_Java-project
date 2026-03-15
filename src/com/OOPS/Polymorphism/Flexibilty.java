package com.OOPS.Polymorphism;

//byte --> short --> int --> long --> float --> double

public class Flexibilty {
	void add() {
		System.out.println("no arg method called");
	}

//	void add(int a) {
//		System.out.println("one arg method called");
//	}
//
	void add(float a) {
		System.out.println("one arg float method called ");
	}

	void add(double a) {
		System.out.println("one arg double method called ");
	}

	void add(int a, int b) {
		System.out.println("two arg method called");
	}

//	void add(int a, float b) {
//		System.out.println("two int float arg method called");
//	}

//	void add(float a, float b) {
//		System.out.println("two float arg method called");
//	}

//	void add(float a, int b) {
//		System.out.println("two float int arg method called");
//	}

	void main(String[] args) {
		System.out.println("main method started");
		add();
//The method add(int, int) in the type Flexibilty is not applicable for the arguments (int)
		add(10);
//		add(10.5);
//		add(1000.0);
//		add(100.5);
		add(10, 20);
		// The method add(int, float) is ambiguous(confusion) for the type Flexibilty

		System.out.println("main method ended");

	}

}
