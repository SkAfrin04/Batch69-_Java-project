package com.loops;
//WAP to print the sum of given numbers 
//input --> 1234567
//output--> 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
import java.util.Scanner;

public class TestLPDemo12 {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		int r = 0;
		
		
		
		while(n!=0) {
			r = n%10;
			n = n/10;
			sum = sum + r;
		}
		System.out.println("Result : " + sum);
	}

}
