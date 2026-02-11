package ConstructorChaining;

class Copyconstructor1 {

    int sid;
    String sname;

    // No-arg constructor
    Copyconstructor1() {
        sid = 0;
        sname = "Unknown";
        System.out.println("No-arg constructor");
    }

    // One-arg constructor
    Copyconstructor1(int sid) {
        this.sid = sid;
        this.sname = "Not Assigned";
        System.out.println("One-arg constructor");
    }

    // Two-arg constructor
    Copyconstructor1(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
        System.out.println("Two-arg constructor");
    }

    // ✅ Copy constructor
    Copyconstructor1(Copyconstructor c) {
        this.sid = c.sid;
        this.sname = c.sname;
        System.out.println("Copy constructor");
    }

    void display() {
        System.out.println("ID   : " + sid);
        System.out.println("Name : " + sname);
    }

    public static void main(String[] args) {

        Copyconstructor1 c1 = new Copyconstructor1();
        Copyconstructor1 c2 = new Copyconstructor1(101);
        Copyconstructor1 c3 = new Copyconstructor1(102, "Afrin");

        Copyconstructor1 c4 = new Copyconstructor1(); // copy

        System.out.println("\nCopied Object:");
        c4.display();
    }
}
