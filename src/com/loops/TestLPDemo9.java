package com.loops;

import java.util.Scanner;

public class TestLPDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = sc.nextInt();//123
		int r = 0;
		int rev = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;//321

		}
		System.out.println(rev);
	}

}
