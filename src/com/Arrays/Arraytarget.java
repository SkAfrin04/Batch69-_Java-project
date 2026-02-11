package com.Arrays;

import java.util.Scanner;

public class Arraytarget {

	public static void main(String[] args) {
		int[] num = { 123, 223, 452, 32 };
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target : ");
		int target = sc.nextInt();
		
		
		for (int i = 0; i < num.length; i++) {
			int r = 0;
			int n = num[i];
			while (n != 0) {
				r = n % 10;
				n = n / 10;
				if (r == target) {
					count++;
				}
			}

		}
		System.out.println("The count of the Target is : " + count);

	}

}
