package com.Arrays;

import java.util.Arrays;

public class ArrayMovingNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 0, 5 };

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				duplicate[i] = arr[i];
//				System.out.println(duplicate[i]);
//			}
//		}
//		int[] temp = new int[arr.length];
//		for (int j = 0; j < arr.length; j++) {
//			if (arr[j] == 0) {
//				temp[j] = arr[j];
//				System.out.println(temp[j]);
//			}
//		}
		int t = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int tep = arr[i];
				arr[i] = arr[t];

				arr[t] = tep;
				t++;

			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
