package com.Arrays;

public class ArrayEO {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int even = arr[0];
		int odd = arr[0];

//		System.out.println("The Even numbers are : " + even);
//		System.out.println("The Odd numbers are : " + odd);

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even = arr[i] * arr[i];
				System.out.println(even);
			} else if (i % 2 != 0) {
				odd = arr[i] * 2;
				System.out.println(odd);
			}

		}
	}

}
