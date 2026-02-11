package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of day ");
		int day = sc.nextInt();

		switch (day) {
		case 1 -> System.out.println("Sundays are always Fun Days !!");
		case 2 -> System.out.println("Mondays are always Lazy Days !!");
		case 3 -> System.out.println("Tuesdays  are Routine Days !!");
		case 4 -> System.out.println("Wednesdays  are Routine Days !!");
		case 5 -> System.out.println("Thursdays  are Routine Days !!");
		case 6 -> System.out.println("Fridays are  Happy Days !!");
		case 7 -> System.out.println("Saturdays are Weekends !!");
		}
		sc.close();
	}

}
