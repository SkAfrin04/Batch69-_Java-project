package ConstructorChaining;

class Copyconstructor {

    int sid;
    String sname;

    // Parameterized Constructor
    Copyconstructor(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    // Copy Constructor
    Copyconstructor(Copyconstructor c) {
        this.sid = c.sid;
        this.sname = c.sname;
    }

    void display() {
        System.out.println("Student ID   : " + sid);
        System.out.println("Student Name : " + sname);
    }

    public static void main(String[] args) {

        // Original Object
        Copyconstructor c1 = new Copyconstructor(101, "Afrin");

        // Copied Object
        Copyconstructor c2 = new Copyconstructor(c1);

        System.out.println("Original Object Details:");
        c1.display();

        System.out.println("\nCopied Object Details:");
        c2.display();
    }
}
