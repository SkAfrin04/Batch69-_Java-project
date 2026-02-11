package com.loops;

import java.util.Scanner;

public class TestLPDemo8 {

	public static void main(String[] args) {
		System.out.println("main method Started !! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			int mul = 1;
			for (int i = 1; i <= r; i++) {
				mul = mul * i;
			}
			sum = sum + mul;

		}
		if (sum == temp) {
			System.out.println("The given number is Strong Number ");
		} else {
			System.out.println("The given number is not Strong Number ");
		}
		sc.close();
		

	}

}
