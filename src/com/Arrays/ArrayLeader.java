package com.Arrays;

public class ArrayLeader {

	public static void main(String[] args) {

		int[] num = { 16, 17, 4, 3, 5, 2 };

		int leader = 0;
		for (int i = num.length - 1; i >= 0; i--) {

			if (leader < num[i]) {
				leader = num[i];
				System.out.println("Leader values are :" + num[i]);

			}

		}

	}

}
