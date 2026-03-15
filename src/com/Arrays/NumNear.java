package com.Arrays;

import java.util.Arrays;

public class NumNear {

	public static void main(String[] args) {
		int arr[] = { 23, 56, 89, 48, 30 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int sum = 0;

			int r = n % 10;
			if (r < 5) {
				arr[i] = arr[i] - r;

			} else if (r > 5) {
				int d = 10 - r;
				arr[i] = arr[i] + d;

			}

		}
		System.out.println(Arrays.toString(arr));

	}

}