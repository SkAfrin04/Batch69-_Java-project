package Operators;

import java.util.Scanner;
//bitwise operators : & | ^ << >> 

public class TestDemoOp6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = s.nextInt();
		System.out.println("Enter b value : ");
		int b = s.nextInt();

		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(a << b);
		System.out.println(a >> b);

	}

}
