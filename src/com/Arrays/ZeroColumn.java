package com.Arrays;

import java.util.Arrays;

public class ZeroColumn {
	// 110
	// 111
	// 011
	// output 000
	// 010
	// 000
	public static void main(String[] args) {

		int arr[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 1, 1 } };

		int row[] = new int[arr.length];
		int col[] = new int[arr.length];

		// Step 1: Find positions of 0
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;

				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}

		System.out.println(Arrays.deepToString(arr));
	}
}