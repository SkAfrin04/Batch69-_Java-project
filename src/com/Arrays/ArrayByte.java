package com.Arrays;

public class ArrayByte {

	public static void main(String[] args) {
		byte[] nums;          // Declaration: nums is a reference to byte array

        nums = new byte[4];   // Creation: array size is 4

        nums[0] = 10;         // Initialization: store 10 at index 0
        nums[1] = 20;         // store 20 at index 1
        nums[2] = 30;         // store 30 at index 2
        nums[3] = 40;         // store 40 at index 3

        for (byte b : nums) { // for-each loop: b gets one value at a time
            System.out.println(b);  // Representation: print element
        }
    }
}
