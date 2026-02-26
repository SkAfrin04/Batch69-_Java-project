package com.accessmodifiers01;

//Private is : Illegal modifier for the class TestDemo1;
//only public, abstract,<default>,strictfp & final are permitted

class TestDemo1 {
	private class test {
		private int a1 = 1;
		private String name1 = "affu";
	}

	private void method1() {
		System.out.println("method 1 called !!");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		TestDemo1 t1 = new TestDemo1();
		t1.method1();
	}

}
