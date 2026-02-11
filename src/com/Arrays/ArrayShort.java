package com.Arrays;

public class ArrayShort {

	public static void main(String[] args) {
		short[] nums;
		nums = new short[4];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;

		for (short s : nums) {
			System.out.println(s);
		}
	}

}
