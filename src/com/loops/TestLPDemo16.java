package com.loops;

import java.util.Scanner;

public class TestLPDemo16 {
	static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
//		System.out.println(sum);
		return sum;
	}

	static int prod(int n) {
		int prod = 1;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			prod = prod * r;
		}
//		System.out.println(prod);
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int s = sum(n);
		int p = prod(n);
		System.out.println(s);
		System.out.println(p);

		if (s == p) {
			System.out.println("Given number is SPY ");
		} else {
			System.out.println("Given number is not SPY ");
		}
	}

}
