package com.Arrays;

public class Arrayint {

	public static void main(String[] args) {
    
		// 1. Declaration
        int[] marks;

        // 2. Creation
        marks = new int[5];

        // 3. Initialization
        marks[0] = 60;
        marks[1] = 70;
        marks[2] = 80;
        marks[3] = 90;
        marks[4] = 100;

        // 4. Representation or accessing (Displaying array elements)
        System.out.println("Array elements are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
	}

}
