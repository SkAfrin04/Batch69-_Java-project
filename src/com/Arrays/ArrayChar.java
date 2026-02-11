package com.Arrays;

public class ArrayChar {

	public static void main(String[] args) {
		// Declaration
		char[] letters;

		// Creation
		letters = new char[4];

		// Initialization
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';

		// Representation (printing elements)
		for (char ch : letters) {
			System.out.println(ch);
		}
	}

}
