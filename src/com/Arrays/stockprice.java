package com.Arrays;
//find stock price anf find profit??

public class stockprice {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 1, 2, 27, 13, 7 };
		int profit = 0;
		int count = 0;
		int buyDay = 0;
		int sellDay = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int d = arr[j] - arr[i];
				if (d > profit) {
					profit = d;
					buyDay = i + 1;
					sellDay = j + 1;
				}
			}
		}
		System.out.println(profit + " buy day" + buyDay + " sell day " + sellDay);
	}
}