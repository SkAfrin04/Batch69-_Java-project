package languagefundamentals.constructors;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Account Holder name : ");
		String accountHoldername = s.nextLine();
		System.out.println("Enter your Account Number : ");
		long accountnumber = s.nextLong();
		System.out.println("Enter your Password : ");
		String password = s.next();
		System.out.println("Enter your Balance : ");
		double balance = s.nextDouble();

		Bank b = new Bank();
		b.createAccount(accountHoldername, accountnumber, password, balance);
		System.out.println("enter a deposit ammount : ");
		double dp = s.nextDouble();
		b.deposit(dp);
		System.out.println("enter a withdraw ammount : ");
		double wd = s.nextDouble();
		b.withdraw(wd);

		System.out.println(b.checkbalance());
		s.close();

	}

}
