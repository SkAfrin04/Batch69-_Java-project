package languagefundamentals.constructors;

public class Bank {
	String accountHoldername;
	long accountnumber;
	String password;
	double balance;

	void createAccount(String accountHoldername, long accountnumber, String password, double balance) {
		this.accountHoldername = accountHoldername;
		this.accountnumber = accountnumber;
		this.password = password;
		this.balance = balance;

	}

	double deposit(double ammount) {
		balance = balance + ammount;
		System.out.println("Deposit Ammount : " + ammount);

		System.out.println("Total Balance :" + balance);
		return ammount;
	}

	double withdraw(double ammount) {
		balance = balance - ammount;
		System.out.println("WithDraw ammount : " + ammount);
		System.out.println("Total Balance : " + balance);
		return ammount;
	}

	double checkbalance() {
		return balance;
	}

	static void accountEnqu(Bank b) {
		System.out.println(b.accountHoldername);
		System.out.println(b.accountnumber);
		System.out.println(b.password);
		System.out.println(b.balance);
	}

}
