package com.Arrays;

//Print the missing element in array??

import java.util.Arrays;

public class MissingNUm2 {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 5, 7, 9 };
		int a[] = new int[arr.length];
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			int start = arr[i];
			int end = arr[i + 1];
			if (start == end)
				continue;

			for (int j = start + 1; j < end; j++) {
				System.out.println(j);
			}
		}

	}

}