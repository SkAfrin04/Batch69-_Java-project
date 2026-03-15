package com.OOPSinheritence;

abstract class TestA {

	public static void main(String[] args) {
		System.out.println("Main method started");
	}

	abstract void method();

}

class TestB extends TestA {

	@Override
	void method() {

	}
}

abstract class TestC extends TestB {
     @Override
	abstract void method();
}

