package com.loops;

import java.util.Scanner;

public class TestLPDemo14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("Enter a number : ");

			 n = sc.nextInt();
			if (n <= 99) {
				System.out.println("enter the number more than 2digits...!");

			} else {
				break;
			}
		}

		int r = 0;
		int rev = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		if (rev == temp) {
			System.out.println("Given number is Palindrome ");
		} else {
			System.out.println("Given number is not Palindrome ");

		}
     sc.close();
	}
}
