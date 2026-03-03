package com.OOPSinheritence;

public class Product {
	int pid;
	String pname;

	@Override
	public String toString() {

		return "ProductDetails : PID : " + pid + " PNAME : " + pname;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called!!");
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1);// @2b2fa4f7

		Product p2 = new Product();
		System.out.println(p2);// @1dbd16a6
		p2 = p1;// true //Reassigning

		System.gc();
		System.out.println(p1.equals(p2));// false

		System.out.println(p1.getClass());// Fully qualified name of the class with the class
		// output : class com.OOPSinheritence.Product

		System.out.println(p1.hashCode());// 724542711
		int i = 0x2b2fa4f7;
		System.out.println(i);

		Product p3 = new Product();
		System.out.println(p3);// com.OOPSinheritence.Product@7ad041f3

	}

}
