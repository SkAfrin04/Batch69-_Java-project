package com.OOPSinheritence;

public class HomeLoan extends Loan {

	void getHomeLoanInfo() {
		System.out.println("Home Loan is helpful for your House needs !!");	
	}
	
	void getHomeLoanDocumentInfo() {
		System.out.println("Home Loan Documents have been Submitted!!");
	}
	
	
	public static void main(String[] args) {
        System.out.println("Main method Started !!");
		System.out.println("Welcome to VCUBE Home Loan Banking");
		HomeLoan h1 = new HomeLoan();
		
			String customerName = h1.getCustomername();
			System.out.println("Customer name : " + customerName);

			double salary = h1.getCustomerSalary();
			int age = h1.getCustomerAge();
			int Cibil = h1.getCustomerCibilscore();

			if (salary > 800000.00 && Cibil > 780 && age > 27 && h1.isValidMobile() && h1.isValidAdhar() && h1.isValidPAN()) {
				System.out.println("Congrats your loan got approved ");

				System.out.println("your Loan ROI is " + h1.getRoi());;
			} else {
				System.out.println("Sry your Loan got Rejected");
			}

			System.out.println("Main method ended!!");
		}

	}


