package com.Arrays;

public class ArrayBoolean {

	public static void main(String[] args) {
		// Declaration
		boolean[] flags;

		// Creation
		flags = new boolean[3];

		// Initialization
		flags[0] = true;
		flags[1] = false;
		flags[2] = true;

		// Representation (printing elements)
		for (boolean b : flags) {
			System.out.println(b);
		}
	}

}
