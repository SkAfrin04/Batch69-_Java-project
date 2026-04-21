package com.OOPS.Abstraction;

interface IN1 {
	void method1();

	void method2();

//	default void method3() {
//		System.out.println("default method called from In1 ");
//	}
}

//Hybrid Inheritance
class Test2 extends InA implements In1{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

}
interface In2 {
	void method2();

	void method3();

}

interface In3 extends In2, IN1 {

}

class TestIn1Imp1 implements In3 {

	@Override
	public void method1() {
		System.out.println("Method1 called");

	}

	@Override
	public void method2() {

		System.out.println("Method2 called");

	}

	@Override
	public void method3() {

		System.out.println("Method3 called");

	}

}

public class InterfaceswithMultipleInheritance {

	public static void main(String[] args) {

		In3 i1 = new TestIn1Imp1();

		i1.method1();
		i1.method2();
		i1.method3();
	}

}
