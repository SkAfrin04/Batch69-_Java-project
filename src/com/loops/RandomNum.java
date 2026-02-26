package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(0, 10);
		System.out.println(n);
		Scanner sc = new Scanner(System.in);

		System.out.println("Hi user !in this game you have 3 chances to win ");

		for (int i = 1; i <= 3; i++) {
		    System.out.println("Enter your guessed number:");
		    int num = sc.nextInt();

		    if (n == num) {
		        System.out.println("Congratulations! Your guess is correct.");
		        return;  // Ends program immediately
		    } 
		    else if (n > num) {
		        System.out.println("Random number is greater than your guess.");
		    } 
		    else {
		        System.out.println("Random number is less than your guess.");
		    }
		}
		System.out.println("Chances over! The correct number was: " + n);
	}
}