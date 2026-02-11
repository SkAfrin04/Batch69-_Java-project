package com.logicalstatements;

import java.util.Scanner;

public class TestDemoLS1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = s.nextInt();

		System.out.println("Enter your Percentage : ");
		int percentage = s.nextInt();

		if ((marks > 50 && marks < 100) && (percentage > 80 && percentage < 100)) {
			System.out.println("Your Eligible for Scholarship with the Ammount of : 10000");
		} else {
			System.out.println("Your not Eligible for Scholarship ");

		}

	}

}
