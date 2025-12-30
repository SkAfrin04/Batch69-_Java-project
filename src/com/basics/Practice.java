package com.basics;

public class Practice {
	static Integer accountnumber = 1456;
	String HolderName;
	Double balance;
	
	//instance disp method no return type creating
	public void disp() {
		System.out.println(accountnumber++);
		
	}

	public static void main(String[] args) {
		Practice b1 = new Practice();
		b1.HolderName = "Afrin";
		b1.balance = 245.7;
		
		//instance disp method no return type calling by object referance
		b1.disp();
	}
}
