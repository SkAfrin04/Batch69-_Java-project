package com.loops;
//WAP to print prime numbers and alphabet positions in that prime number...?

import java.util.Scanner;

public class TestLPDemo7 {

	static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		char c = 'A';
		for (int i = 1; i <= 26; i++) {
			
			if (isPrime(i)) {
				System.out.println(i + " " + c);
			}
			c++;
		}
		sc.close();

	}

}
