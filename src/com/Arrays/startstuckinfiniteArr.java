package com.Arrays;

public class startstuckinfiniteArr {

	public static void main(String[] args) {
		int arr[] = { 2, 1, -2, -1, 0, 3 };
		int jumps = 0;
		int start = 1;
		while (start >= 0 && start < arr.length) {

			jumps++;
			if (arr[start] == 0) {
				System.out.println("struck");
				break;
			}
			int next = start + arr[start];

			// check invalid move
			if (next < 0 || next >= arr.length) {
				System.out.println("invalid starting position");
				break;
			}

			// check infinite condition safely
			if (arr[start] + arr[next] == 0) {
				System.out.println("infinite");
				break;
			}

			start = next;

		}
		System.out.println("jumps taken " + jumps);
	}

}