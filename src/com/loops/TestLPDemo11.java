package com.loops;
// WAP to print binary to decimal 
//input --> 10010
//output --> 18
import java.util.Scanner;

public class TestLPDemo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int base = 1;
		int decimal = 0;

		while (n != 0) {
			r = n % 10;
			decimal = decimal + (r * base);
			base = base * 2;
			n = n / 10;
		}
		System.out.println("The decimal value is : " + decimal);
		sc.close();

	}
}
