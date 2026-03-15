package com.OOPSinheritence;

class Loan1 {
	void calculateROI() {
		System.out.println("ROI is 8.5");
	}

	void hello() {
		System.out.println("Hello loan");
	}
}

class HomeLoan1 extends Loan1 {
	@Override
	void calculateROI() {
		System.out.println("ROI is 10.5");
	}

	void hello() {
		System.out.println("Hello home Loan");
	}
}

public class DynamicDispatching {

	public static void main(String[] args) {
		HomeLoan1 h1 = new HomeLoan1();
		h1.calculateROI();
		h1.hello();

		Loan1 l1 = new HomeLoan1();
		l1.calculateROI();
		l1.hello();
	}

}
