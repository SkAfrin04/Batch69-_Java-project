package com.loops;

import java.util.Scanner;

public class TestLPDemo5 {
	static int findfact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return n*findfact(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Main method Started !! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();
		int f= findfact(n);
		System.out.println("Factorial of given number is : " + f);
		for (int i = 1; i <=n; i++) {
            if(n%i==0) {
            	System.out.println(i);
            }
		}
      sc.close();
	}

}
