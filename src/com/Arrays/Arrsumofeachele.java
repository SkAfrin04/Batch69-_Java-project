package com.Arrays;

import java.util.Arrays;

public class Arrsumofeachele {

	public static void main(String[] args) {
		int arr[] = { 12, 51, 1, 101, 57 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				sum = sum + r;

			}

			String res = "" + arr[i] + sum;
			int num = Integer.parseInt(res);
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
	}

}