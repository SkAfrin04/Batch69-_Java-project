package com.Arrays;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();// 4 5 6 7 --> 4

		int[] n = new int[size];

		System.out.println("Enter Elements to proceed : ");

		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();

		}
		System.out.println("Prime numbers from given array : ");
		for (int i = 0; i < size; i++) {
			boolean status = true;
			if (n[i] == 1) {
				status = false;
			}
			for (int j = 2; j < n[i]; j++) {
				if (n[i] % j == 0) { // 4%2==0 --> true
					status = false;
					break;
				}
			}
			if (status) {
				System.out.print(n[i] + " ");
			}
		}
	}

}
