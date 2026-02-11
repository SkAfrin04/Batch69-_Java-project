package com.Arrays;

import java.util.Scanner;

public class ArrayDuplicateNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate values are : ");
		for (int i = 0; i < size; i++) {
			int k;
			for (k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					break;
				}
			}
			if (k < i) {
				continue;
			}
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " ");
					break;
				}
			}
		}
	}

}
