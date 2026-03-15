package com.OOPS.Polymorphism;

public class MOIofPoly {

	public static void main(String[] args) {
		MOIofPoly e1 = new MOIofPoly();

		String s = new String("Hello");

		StringBuffer sb = new StringBuffer("JAVA");

		byte b1 = 8;
		short s1 = 3245;

		System.out.println(b1); // --> Byte
		System.out.println(s1); // --> short
		System.out.println(100); // --> int

		System.out.println(e1); // --> object
		System.out.println(s); // --> String
		System.out.println(sb); // --> SB --> object

		System.out.println(904892890L);
		System.out.println(904892890.90876);
		System.out.println(904892890.976f);
	}

}
