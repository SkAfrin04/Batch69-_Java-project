package ConstructorChaining;

public class testdemo1 {

    int eid;
    String ename;
    double salary;
    int bonus;

    // No-Arg Constructor
    testdemo1() {
        System.out.println("No-Arg Constructor Called");
        eid = 0;
        ename = "Unknown";
        salary = 0.0;
        bonus = 0;
    }

    // One-Arg Constructor
    testdemo1(int eid) {
        this();   // calls no-arg constructor
        System.out.println("One-Arg Constructor Called");
        this.eid = eid;
    }

    // Two-Arg Constructor
    testdemo1(int eid, String ename) {
        this(eid);   // calls one-arg constructor
        System.out.println("Two-Arg Constructor Called");
        this.ename = ename;
    }

    // Three-Arg Constructor
    testdemo1(int eid, String ename, double salary) {
        this(eid, ename);   // calls two-arg constructor
        System.out.println("Three-Arg Constructor Called");
        this.salary = salary;
    }

    // Four-Arg Constructor
    testdemo1(int eid, String ename, double salary, int bonus) {
        this(eid, ename, salary);   // calls three-arg constructor
        System.out.println("Four-Arg Constructor Called");
        this.bonus = bonus;
    }

    void show() {
        System.out.println("********************");
        System.out.println("EID    : " + eid);
        System.out.println("ENAME  : " + ename);
        System.out.println("SALARY : " + salary);
        System.out.println("BONUS  : " + bonus);
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        testdemo1 e1 = new testdemo1();
        e1.show();

        testdemo1 e2 = new testdemo1(101);
        e2.show();

        testdemo1 e3 = new testdemo1(102, "Afrin");
        e3.show();

        testdemo1 e4 = new testdemo1(103, "Afrin", 45000);
        e4.show();

        testdemo1 e5 = new testdemo1(104, "Afrin", 55000, 5000);
        e5.show();

        System.out.println("Main Method Ended");
    }
}
