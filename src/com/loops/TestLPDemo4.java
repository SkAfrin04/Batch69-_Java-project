package com.loops;

import java.util.Scanner;

//WAP to print divisors & Factors of a given number ?
//input : 10
//output : 1,2,5,10

public class TestLPDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method started !! ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
//				System.out.println(i);
				System.out.print(i + " ");
			}

		}
		System.out.println(n);
		sc.close();
	}

}
