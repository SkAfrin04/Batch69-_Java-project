package com.OOPSinheritence;

// parent or Base or super class

class TestA1 {
	int a = 100;

	void method1() {
		System.out.println("method 1 called from A");

	}
}

// child or derived or sub
class Testb1 extends TestA1 {
	int b = 200;

	void method2() {
		System.out.println("method 2 called from B");
	}
}

class TestC1 extends TestB1 {
	int c = 300;

	void method3() {
		System.out.println("method 3 called from C");

	}
}

class TestD1 extends TestC1 {
	int d = 400;

	void method4() {
		System.out.println("method 4 called from D");

	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
//		TestA1 a1 = new TestA1();
//		System.out.println(a1.a);
//		a1.method1();

//		TestC1 c = new TestC1();
//		System.out.println(c.b);
//		c.method2();
//        System.out.println(c.a);
//        c.method1();
//        System.out.println(c.c);
//        c.method3();

		TestD1 d1 = new TestD1();
		System.out.println(d1.b);
		d1.method2();
		System.out.println(d1.a);
		d1.method1();
		System.out.println(d1.c);
		d1.method3();
		System.out.println(d1.d);
		d1.method4();

	}

}
