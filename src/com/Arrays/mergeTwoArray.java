package com.Arrays;

//WAP to Merge Two Arrays??

import java.util.Arrays;

public class mergeTwoArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int arr1[] = { 4, 5, 6, 7 };
		int[] c = new int[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++) {
			c[i] = arr[i];
		}

		for (int j = 0; j < arr1.length; j++) {
			c[arr.length + j] = arr1[j];

		}
		System.out.println(Arrays.toString(c));
	}

}