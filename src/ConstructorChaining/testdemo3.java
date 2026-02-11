package ConstructorChaining;

public class testdemo3 {

    int accNo;
    String holderName;
    double balance;
    int pin;

    testdemo3() {
        System.out.println("No-Arg Constructor Called");
        accNo = 0;
        holderName = "Unknown";
        balance = 0.0;
        pin = 0;
    }

    testdemo3(int accNo) {
        this();
        System.out.println("One-Arg Constructor Called");
        this.accNo = accNo;
    }

    testdemo3(int accNo, String holderName) {
        this(accNo);
        System.out.println("Two-Arg Constructor Called");
        this.holderName = holderName;
    }

    testdemo3(int accNo, String holderName, double balance) {
        this(accNo, holderName);
        System.out.println("Three-Arg Constructor Called");
        this.balance = balance;
    }

    testdemo3(int accNo, String holderName, double balance, int pin) {
        this(accNo, holderName, balance);
        System.out.println("Four-Arg Constructor Called");
        this.pin = pin;
    }

    void show() {
        System.out.println("********************");
        System.out.println("ACC NO : " + accNo);
        System.out.println("NAME   : " + holderName);
        System.out.println("BAL    : " + balance);
        System.out.println("PIN    : " + pin);
    }

    public static void main(String[] args) {

        testdemo3 b1 = new testdemo3();
        b1.show();

        testdemo3 b2 = new testdemo3(111);
        b2.show();

        testdemo3 b3 = new testdemo3(222, "Afrin");
        b3.show();

        testdemo3 b4 = new testdemo3(333, "Sri", 25000);
        b4.show();

        testdemo3 b5 = new testdemo3(444, "Cutie", 30000, 1234);
        b5.show();
    }
}
