package com.OOPSinheritence;

class TestMI1 {
	void method1() {
		System.out.println("method 1 called from MI1");
	}

}

class TestMI2 extends TestMI1 {
	void method1() {
		System.out.println("method 1 called from MI2");
	}

}

//class TestMI3 extends TestMI2,TestMI1 {
//Java does not support multiple inheritance
//		
//	}
public class MultipleInheritance {
	public static void main(String[] args) {

//		TestMI3 t = new TestMI3();
//		t.method1();
	}

}
