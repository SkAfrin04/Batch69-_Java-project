package com.loops;
//WAP to print the given number is magic or not ??
//input --> 1234567
//output--> 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
//output --> 2 + 8 = 10 --> 1 + 0 = 1 --> if we get 1 we can say it is a magic number
import java.util.Scanner;

public class TestLPDemo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;

		int r = 0;

		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				r = n % 10;
				n = n / 10;
				sum = sum + r;
			}

			n = sum;
			System.out.println("The sum of numbers is : " + n);

		}

		System.out.println(n);
		if (n == 1) {
			System.out.println("Given number is magic");
		} else {
			System.out.println("Given number is not magic");
		}
	}

}
