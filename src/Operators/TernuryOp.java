package Operators;

import java.util.Scanner;

public class TernuryOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		String max =  (a % 3 == 0) ? "fizz": (a % 5 == 0) ? "buzz" : ((a % 3 == 0) && (a % 5 == 0)) ? "fizz buzz" : "number not divible";
		System.out.println(max);

	}

}