package com.accessmodifiers01;

public class TestDemo2 {

	public static void main(String[] args) {
		TestDemo1 t1 = new TestDemo1();

//Note : If the data members are private, we cannot access outside of the classes even though the classes are in same package.. 
//Private data members can be access inside the class only		

//		System.out.println(t1.a1);//The filed TestAccessDemo1.a1 is not visible
//		System.out.println(t1.name1);//The filed TestAccessDemo1.name1 is not visible
//	   t1.method1();//The method method1() from the type TestAccessDemo1 is not visible

		// Accessing default data members within the class
		// same package
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
	}

}
