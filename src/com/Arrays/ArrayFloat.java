package com.Arrays;

public class ArrayFloat {

	public static void main(String[] args) {
		// Declaration
		float[] values;

		// Creation
		values = new float[4];

		// Initialization
		values[0] = 1.5f;
		values[1] = 2.5f;
		values[2] = 3.5f;
		values[3] = 4.5f;

		// Representation (printing elements)
		for (float v : values) {
			System.out.println(v);
		}
	}

}
