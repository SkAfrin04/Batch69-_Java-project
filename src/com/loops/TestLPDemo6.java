package com.loops;

import java.util.Scanner;

public class TestLPDemo6 {
	
	static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for(int i =2 ; i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (isPrime(n) && n <= 26) {
			char alphabet = (char) ('A' + n - 1);
			System.out.println("Alphabet at given number position is : " + alphabet);
		} else {
			System.out.println("Input is not a prime number between 1 to 26 ");
		}
		sc.close();

	}

}
