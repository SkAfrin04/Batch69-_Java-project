package com.Arrays;

public class ArrayLong {

	public static void main(String[] args) {
		long[] nums;
		nums = new long[4];

		nums[0] = 10000000l;
		nums[1] = 20000000l;
		nums[2] = 30000000l;
		nums[3] = 4000000l;

		for (long l : nums) {
			System.out.println(l);
		}

	}

}
