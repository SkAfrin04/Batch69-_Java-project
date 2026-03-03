package com.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 2, 3, 4, 5, 7, 5, 6, 7, 8, 9 };
		int start = 0;
		int end = 0;

		int maxLength = 0;

		for (int i = 0; i < arr.length;) {

			int length = 0;
			int j = i;

			while (j < arr.length - 1 && arr[j + 1] - arr[j] == 1) {
				length++;
				j++;
			}

			if (length > maxLength) {
				maxLength = length;
				start = i;
				end = j;
			}

			i = j + 1; // move forward properly
		}
		for (int i = start; i <= end; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}