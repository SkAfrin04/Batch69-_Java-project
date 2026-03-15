package com.OOPSinheritence;

class TestCon1 {

	public TestCon1() {
		System.out.println("TestCon1 no -arg constructor called");
	}

}

class TestCon2 {
	public TestCon2() {
		System.out.println("TestCon2 no -arg constructor called");
	}
}

class TestCon3 extends TestCon2 {
	public TestCon3() {
		System.out.println("TestCon3 no -arg constructor called");
	}
}
	public class Multilevel2 {

		public static void main(String[] args) {
           System.out.println("Main method started");
			TestCon3 t3 = new TestCon3();
			
		}

	}
