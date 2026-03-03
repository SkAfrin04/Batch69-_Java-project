package com.accessmodifiers01;

//Private is : Illegal modifier for the class TestDemo1;
//only public, abstract,<default>,strictfp & final are permitted
//
public class TestDemo1 {

//private TestDemo1() {
//	
//}

//Syntax error, insert "Identifier" to complete CompactConstructorHeader
//	private static {
//		
//	}

	// protected data members
	protected int a4 = 33;
	protected String name4 = "Hardik";

	protected void method4() {
		System.out.println("Method 4 called!!");
	}

	// public data members
	public int a3 = 77;
	public String name3 = "GILL";

	public void method3() {
		System.out.println("Method 3 called !!");
	}

	// Default Data Members
	int a2 = 63;
	String name2 = "SKY";

	void method2() {
		System.out.println("Method 2 called !!");
	}

	// Private Data Members
	private int a1 = 1;
	private String name1 = "affu";

	private void method1() {
		System.out.println("method 1 called !!");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		TestDemo1 t1 = new TestDemo1();

		// Accessing private data members within the class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		// Accessing default data members within the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Accessing public data members within the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing protected data members within the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
