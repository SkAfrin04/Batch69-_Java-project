package ConstructorChaining;

public class testdemo4 {

    testdemo4() {
        System.out.println("No-Arg");
    }

    testdemo4(int a) {
        this();
        System.out.println("One-Arg: " + a);
    }

    testdemo4(int a, int b) {
        this(a);
        System.out.println("Two-Arg: " + (a + b));
    }

    testdemo4(int a, int b, int c) {
        this(a, b);
        System.out.println("Three-Arg: " + (a + b + c));
    }

    testdemo4(int a, int b, int c, int d) {
        this(a, b, c);
        System.out.println("Four-Arg: " + (a + b + c + d));
    }

    public static void main(String[] args) {
        new testdemo4(1, 2, 3, 4);
    }
}
