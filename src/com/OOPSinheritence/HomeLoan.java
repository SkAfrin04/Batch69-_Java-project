package com.OOPSinheritence;

public class HomeLoan extends Loan {

	void getHomeLoanInfo() {
		System.out.println("Home Loan is helpful for your House needs !!");
	}

	void getHomeLoanDocumentInfo() {
		System.out.println("Home Loan Documents have been Submitted!!");
	}
// ex : if the parent class method is : number ----> C-->Number or integer or double...
//ex : if the parent class method is : String ---> C-->must be string.
//ex : if the parent class method is : object --> C -->can be another object.

	@Override
	double getRoi() {
		return 8.0;
	}

	// Cannot reduce the visibility of the inherited method from Loan.
	@Override
	public Number method1() {
		return 300.0;
	}

	@Override
	protected String method2() {
		return "method1-child";
	}

	// if we override we will get below error
	// The method method3() of type HomeLoan must override or implement a supertype.

	private void method3() {
		System.out.println("method 3 called!!");
	}

	//Cannot override the final method from Loan.
	
	public final void method4() {
		   System.out.println("Method4 called from parent!");
	   }
	
	public static void method5() {
		   System.out.println("Method5 called from parent!");
	   }
	public static void main(String[] args) {
		System.out.println("Main method Started !!");
		System.out.println("Welcome to VCUBE Home Loan Banking");
		HomeLoan h1 = new HomeLoan();

		String customerName = h1.getCustomername();
		System.out.println("Customer name : " + customerName);

		double salary = h1.getCustomerSalary();
		System.out.println("your Loan ROI is " + h1.getRoi());
		;

		int age = h1.getCustomerAge();
		int Cibil = h1.getCustomerCibilscore();

		if (salary > 800000.00 && Cibil > 780 && age > 27 && h1.isValidMobile() && h1.isValidAdhar()
				&& h1.isValidPAN()) {
			System.out.println("Congrats your loan got approved ");

			System.out.println("your Loan ROI is " + h1.getRoi());
			;
		} else {
			System.out.println("Sry your Loan got Rejected");
		}

		System.out.println("Main method ended!!");
	}

}
