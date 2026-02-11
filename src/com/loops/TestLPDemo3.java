package com.loops;

//WAP to print odd and even numbers using if from 0 to 100 ?

public class TestLPDemo3 {

	public static void main(String[] args) {
		System.out.println("Main method Started !!");

//Even NUmbers

		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

// ODD Numbers 
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
