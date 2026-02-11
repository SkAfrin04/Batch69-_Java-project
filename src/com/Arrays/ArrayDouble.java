package com.Arrays;

public class ArrayDouble {

	public static void main(String[] args) {
		// Declaration
		double[] values;

		// Creation
		values = new double[3];

		// Initialization
		values[0] = 10.25;
		values[1] = 20.50;
		values[2] = 30.75;

		// Representation (printing elements)
		for (double d : values) {
			System.out.println(d);
		}
	}

}
