package com.Arrays;

public class PosAndNegNumArray {

	public static void main(String[] args) {
		// i=0 j 09 to le i=1 j=0
		// j= 0 to le
		// 2 -3 arr[j]=0
		// ifarr[j

		int arr[] = { 2, 8, -3, 7, -4, -1, 7, 4, 8 };

		for (int i = 0; i < arr.length; i++) {
			boolean pos = true;
			boolean neg = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					if (arr[j] > 0 && pos) {
						System.out.print(arr[j] + " ");
						arr[j] = 0;
						pos = false;
					} else if (arr[j] < 0 && neg) {
						System.out.print(arr[j] + ",");
						arr[j] = 0;
						neg = false;

					}
				}

			}
			System.out.println();

		}

	}

}
