package com.loops;

import java.util.Scanner;

public class TestLPDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		int temp = n;
		String bv = "";
		while (n != 0) {
			r = n % 2;
			n = n / 2;
			bv = r + bv;

		}
        System.out.println("The binary value is : " + bv);
	}

}
