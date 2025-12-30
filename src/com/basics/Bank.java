package com.basics;

public class Bank {
	static Integer accountnumber = 12031;
	String holderName;
	Double balance;

	void disp() {

		System.out.println(accountnumber++);
		System.out.println("helooo world a small changee ");
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.holderName = "Afrin";
		b1.balance = 454.7;
		b1.disp();

		Bank b2 = new Bank();
		b2.holderName = "Shravya";
		b2.balance = 7887.8;
		b2.disp();

	}

}
