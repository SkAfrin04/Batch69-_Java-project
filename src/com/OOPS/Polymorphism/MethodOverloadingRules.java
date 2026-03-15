package com.OOPS.Polymorphism;

public class MethodOverloadingRules {

//1) Method name must be Same

//	void addition() {
//		
//	}
//	
//	void addition() {
//		
//	}
//	
//2)Method arguments must be different
//	- No of arguments must be different
//	-Types of arguments must be different
//	-Order of arguments must be different

//    void addition1() {
//		
//	}
//	
//	void addition1(int a,int b) {
//		
//	}

//3)Method  Return type is not applicable for MOL
	// MOL is only depends on Method signature like method signature = method name +
	// method arguments.

//    void addition() {
//		
//	}
//	
//	void addition() {
//		
//	}
//	int addition1() {
//		
//	}

//4)Access Modifiers can be different
//	public void addition() {
//		
//	}
//	private void addition(int a, int b) {
//		
//	}
//	
//5)Static Methods can also be Overloaded

//	public static void addition() {
//
//	}
//
//	private void addition(int a, int b) {
//
//	}

//6) Method can be overloaded in same class or subclass

	class TestA {
		void method1() {
			System.out.println("Method 1 called from A");
		}
	}

	class TestB extends TestA {
		void method1(int a) {
			System.out.println("Method 1 called from B" + a);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");

	}

}
