package com.accessmodifiers02;

import com.accessmodifiers01.TestDemo1;

public class TestDemo3 extends TestDemo1 {

	public static void main(String[] args) {

		TestDemo1 t1 = new TestDemo1();
		// Accessing default data members within the class
//				System.out.println(t1.a2);
//				System.out.println(t1.name2);
//				t1.method2();

		// Accessing public data members within the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Accessing protected data members outside of the
		// packages are not possible even though its a subclass
//		System.out.println(t1.a4);
//		System.out.println(t1.name4);
//		t1.method4();

		// but we can access protected data members outside of the package
		// of subclasses with subclass object reference only...

		TestDemo3 t3 = new TestDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();
	}

}
