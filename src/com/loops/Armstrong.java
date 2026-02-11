package com.loops;

//WAP to print Armstrong numbers..?

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int count = 0;
		int temp = n;
		int temp1 = n;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		while (temp > 0) {
			int r1 = temp % 10;
			temp = temp / 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product*r1;
			}
			sum = sum + product;
		}
		if (temp1 == sum) {
			System.out.println("Given number is Armstrong!");
		} else {
			System.out.println("Given number is not Armstrong!");
		}
		sc.close();
	}

}
