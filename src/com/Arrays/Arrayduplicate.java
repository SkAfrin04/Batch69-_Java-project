package com.Arrays;

public class Arrayduplicate {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 5, 2, 1, 5 ,2};

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Duplicate elements are : " + arr[i]);
			}
		}

	}

}
