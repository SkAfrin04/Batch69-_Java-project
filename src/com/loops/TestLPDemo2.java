package com.loops;

import java.util.Scanner;

public class TestLPDemo2 {

    static boolean isPrime(int j) {
        if (j <= 1) {
            return false;
        }

        
        for (int i = 2; i <= j / 2; i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Alternate prime numbers are:");

        int count = 0; // to track prime positions

        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
            	 count++;
                if (count % 2 != 0) { // print alternate primes
                    System.out.print(i + " ");
                }
           
            }
        }

        sc.close();
    }
}
