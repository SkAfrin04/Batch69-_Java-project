package com.loops;

import java.util.Scanner;

public class TestLPDemo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int price = 0;
		int totalBill = 0;
		char moreOrder;

		do {
			System.out.println("-------- FOOD MENU --------");
			System.out.println("1. Burger   - Rs.100");
			System.out.println("2. Pizza    - Rs.200");
			System.out.println("3. Sandwich - Rs.80");
			System.out.println("4. Coffee   - Rs.50");
			System.out.println("---------------------------");

			System.out.print("Select your food item: ");
			int choice = sc.nextInt();

			System.out.print("Enter quantity: ");
			int quantity = sc.nextInt();

			switch (choice) {
			case 1:
				price = 100;
				break;
			case 2:
				price = 200;
				break;
			case 3:
				price = 80;
				break;
			case 4:
				price = 50;
				break;
			default:
				System.out.println("Invalid choice!");
				price = 0;
			}

			int itemTotal = price * quantity;
			totalBill = totalBill + itemTotal;

			System.out.println("Item Bill: Rs." + itemTotal);
			System.out.print("Do you want to order another item? (y/n): ");
			moreOrder = sc.next().charAt(0);

		} while (moreOrder == 'y' || moreOrder == 'Y');

		System.out.println("---------------------------");
		System.out.println("Final Bill Amount: Rs." + totalBill);
		System.out.println("Thank you for ordering!");
		System.out.println("---------------------------");

	}

}