package com.loops;

import java.util.Scanner;

//Write a program to print prime numbers from 1 to 50..?
public class TestLPDemo1 {

	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		boolean prime = true;

		for (int j = 2; j < n; j++) {

			if (n % j == 0) {
				prime = false;
			}
		}

		return prime;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// checking given number is prime
		if (isPrime(n)) {
			System.out.println(n + " given number is a prime...!");
		}else {
			System.out.println(n + " given number is a not prime...!");
		}

		// printing prime number range of given number
		for (int i = 2; i <= n; i++) {

			if (isPrime(i)) {
				System.out.println(i + " is a prime");
			}
		}
		sc.close();

	}
}
