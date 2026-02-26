//monday single program
//write java program to find prime number if it is prime reverse the number and find again reverse number is prime or not
package com.Arrays;

public class reverseEachindexcheckPrime {
	public static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 14, 13, 17, 2, 4 };
		int r = 0;
		for (int i = 0; i < arr.length; i++) {

			boolean status = isprime(arr[i]);
			if (status) {
				int n = reverse(arr[i]);
				boolean c = isprime(n);

				if (status && c) {
					System.out.println(arr[i] + "is prime");
				} else {
					System.out.println(arr[i] + "only one side is prime");
				}
			} else {
				System.out.println(arr[i] + "it is not prime");
			}

		}

	}
}