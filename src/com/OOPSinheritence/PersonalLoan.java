package com.OOPSinheritence;

//Child or Sub or Derived 



public class PersonalLoan extends Loan{
	
	void getpersonalLoanInfo() {
		System.out.println("Personal Loan is helpful for your personal needs !!");	
	}
	
	void getpersonalLoanDocumentInfo() {
		System.out.println("Personal Loan Documents have been Submitted!!");
	}
//	static Scanner s = new Scanner(System.in);
//
//	String getCustomername() {
//		System.out.println("Enter your full name : ");
//		String name = s.nextLine();
//		return name;
//	}
//
//	double getCustomerSalary() {
//		System.out.println("Enter your Salary : ");
//		double salary = s.nextDouble();
//		return salary;
//	}
//
//	int getCustomerAge() {
//		System.out.println("ENter your age : ");
//		return s.nextInt();
//	}
//
//	int getCustomerCibilscore() {
//		System.out.println("Enter your Cibil Score :");
//		int cibil = s.nextInt();
//		return cibil;
//	}
//
//	double getRoi() {
//		return 9.5;
//	}
//
//	 boolean isValidMobile() {
//		System.out.println("Enter your Mobile no :");
//		String mobile = s.next();
//
//		boolean isValid = mobile.matches("[6-9][0-9]{9}");
//		if (isValid) {
//			System.out.println("Valid Mobile Number");
//			return true;
//		} else {
//			System.out.println("Invalid Mobile Number");
//			return false;
//		}
//	}
//
//	 boolean isValidAdhar() {
//		System.out.println("Enter your Adhar Number : ");
//		String adhar = s.next();
//
//		boolean isValidAdhar = adhar.matches("[2-9][0-9]{12}");
//		if (isValidAdhar) {
//			System.out.println("Valid Adhar Number");
//			return true;
//		} else {
//			System.out.println("Invalid Adhar Number ");
//			return false;
//		}
//	}
//
//	 boolean isValidPAN() {
//		System.out.println("Enter your PAN Number : ");
//		String pan = s.next();
//
//		boolean isValidPAN = pan.matches("[A-Z] {5} [0-9] {4}[A-Z]{1}");
//		if (isValidPAN) {
//			System.out.println("Valid PAN Number");
//			return true;
//		} else {
//			System.out.println("Invalid PAN Number ");
//			return false;
//		}
//	}
//
//  String getAddressDetails(){
//		System.out.println("Enter your flat number :");
//		String flat = s.next();
//		
//		System.out.println("Enter your plot number : ");
//		String plot = s.next();
//		
//		System.out.println("Enter your Street name : ");
//		String Street = s.next();
//		
//		System.out.println("Enter your City name :");
//		String City = s.next();
//		
//		System.out.println("Enter your PIN Code : ");
//		long pincode = s.nextLong();
//		
//		String address = "flat" + flat + "Plot name" + plot + "street name" + Street + "City " + City + "Pincode" + pincode;
//		return address;
//	}

	public static void main(String[] args) {
		System.out.println("Main method Started!!");
		System.out.println("VCUBE PErsonal Loan Banking!!");

		//By using Child Object, Child Reference, we can call Parent and child class functionalities.
		PersonalLoan p1 = new PersonalLoan();
		String customerName = p1.getCustomername();
		System.out.println("Customer name : " + customerName);

		double salary = p1.getCustomerSalary();
		int age = p1.getCustomerAge();
		int Cibil = p1.getCustomerCibilscore();

		if (salary > 600000.00 && Cibil > 750 && age > 25 && p1.isValidMobile() && p1.isValidAdhar() && p1.isValidPAN()) {
			System.out.println("Congrats your loan got approved ");

			System.out.println("your Loan ROI is " + p1.getRoi());
			
			System.out.println("Address Details");
			p1.getAddressDetails();
			
			p1.getpersonalLoanDocumentInfo();
		} else {
			System.out.println("Sry your Loan got Rejected");
		}

		System.out.println("Main method ended!!");
	}

}
