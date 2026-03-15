package com.OOPSinheritence;

//parent or Base or super class

class Testa1 {
	int a = 100;

	void method1() {
		System.out.println("method 1 called from A");

	}
}

//child or derived or sub
class TestB1 extends TestA1 {
	int b = 200;

	void method2() {
		System.out.println("method 2 called from B");
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
//		TestA1 a1 = new TestA1();
//		System.out.println(a1.a);
//		a1.method1();

		TestB1 b1 = new TestB1();
		System.out.println(b1.b);
		b1.method2();
        System.out.println(b1.a);
        b1.method1();
	}

}
