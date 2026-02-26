package com.Arrays;

public class ArrayDigitCount {

	public static void main(String[] args) {
		int[] arr = { 1, 12, 15, 133, 2 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int n = arr[i];
			while (n > 0) {
				n = n / 10;
				count++;
			}
			arr[i] = arr[i] * 10 + count;
			System.out.println(arr[i]);

		}
	}

}
