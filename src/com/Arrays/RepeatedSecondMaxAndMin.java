package com.Arrays;

//write a java program to find max frequency number in an array and 
//find second max and second min frequency in an array?

public class RepeatedSecondMaxAndMin {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 1, 3, 1, 9, 3, 2, 1, 3, 2, 3 };
		int ele = 0;
		int maxcount = 0;
		int c = 0;
		boolean arr1[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			if (arr1[i]) {
				continue;

			}

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					c = arr[j];
					arr1[j] = true;
					count++;
				}

			}

			if (count > maxcount) {
				maxcount = count;
				ele = arr[i];

			}
			System.out.println(arr[i] + " occurs " + count + " times");
		}
		System.out.println(" repeated value " + ele + "maxcount is" + maxcount);
		System.out.println("second max repeated values" + c);
	}

}