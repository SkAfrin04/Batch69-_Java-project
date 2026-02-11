package ConstructorChaining;

public class testdemo2 {

    int sid;
    String sname;
    int age;
    int marks;

    testdemo2() {
        System.out.println("No-Arg Constructor Called");
        sid = 0;
        sname = "Unknown";
        age = 0;
        marks = 0;
    }

    testdemo2(int sid) {
        this();
        System.out.println("One-Arg Constructor Called");
        this.sid = sid;
    }

    testdemo2(int sid, String sname) {
        this(sid);
        System.out.println("Two-Arg Constructor Called");
        this.sname = sname;
    }

    testdemo2(int sid, String sname, int age) {
        this(sid, sname);
        System.out.println("Three-Arg Constructor Called");
        this.age = age;
    }

    testdemo2(int sid, String sname, int age, int marks) {
        this(sid, sname, age);
        System.out.println("Four-Arg Constructor Called");
        this.marks = marks;
    }

    void show() {
        System.out.println("********************");
        System.out.println("SID   : " + sid);
        System.out.println("SNAME : " + sname);
        System.out.println("AGE   : " + age);
        System.out.println("MARKS : " + marks);
    }

    public static void main(String[] args) {

        testdemo2 s1 = new testdemo2();
        s1.show();

        testdemo2 s2 = new testdemo2(101);
        s2.show();

        testdemo2 s3 = new testdemo2(102, "Afrin");
        s3.show();

        testdemo2 s4 = new testdemo2(103, "Sirisha", 22);
        s4.show();

        testdemo2 s5 = new testdemo2(104, "Divya", 23, 85);
        s5.show();
    }
}
