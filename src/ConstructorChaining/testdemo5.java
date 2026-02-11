package ConstructorChaining;

public class testdemo5 {

    String regNo;
    String ownerName;
    String model;
    double price;

    // No-Arg Constructor
    testdemo5() {
        System.out.println("No-Arg Constructor Called");
        regNo = "NA";
        ownerName = "Unknown";
        model = "NA";
        price = 0.0;
    }

    // One-Arg Constructor
    testdemo5(String regNo) {
        this();   // calls no-arg constructor
        System.out.println("One-Arg Constructor Called");
        this.regNo = regNo;
    }

    // Two-Arg Constructor
    testdemo5(String regNo, String ownerName) {
        this(regNo);   // calls one-arg constructor
        System.out.println("Two-Arg Constructor Called");
        this.ownerName = ownerName;
    }

    // Three-Arg Constructor
    testdemo5(String regNo, String ownerName, String model) {
        this(regNo, ownerName);   // calls two-arg constructor
        System.out.println("Three-Arg Constructor Called");
        this.model = model;
    }

    // Four-Arg Constructor
    testdemo5(String regNo, String ownerName, String model, double price) {
        this(regNo, ownerName, model);   // calls three-arg constructor
        System.out.println("Four-Arg Constructor Called");
        this.price = price;
    }

    void show() {
        System.out.println("---------------");
        System.out.println("Reg No  : " + regNo);
        System.out.println("Owner   : " + ownerName);
        System.out.println("Model   : " + model);
        System.out.println("Price   : " + price);
    }

    public static void main(String[] args) {
        testdemo5 v = new testdemo5("TS09AB1234", "Afrin", "Honda", 95000);
        v.show();
    }
}
