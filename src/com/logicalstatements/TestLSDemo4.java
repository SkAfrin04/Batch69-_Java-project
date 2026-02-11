package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Telugu Marks : ");
		int s1 = sc.nextInt();
		
		System.out.println("Enter your Maths Marks : ");
		int s2 = sc.nextInt();
		
		System.out.println("Enter your English Marks : ");
		int s3 = sc.nextInt();
		
		System.out.println("Enter your Science Marks : ");
		int s4 = sc.nextInt();
		
		System.out.println("Enter your Social Marks : ");
		int s5 = sc.nextInt();
		
		int marks = s1+s2+s3+s4+s5;
		System.out.println("Your Total Marks : " + marks);
		
		
		double avg = marks/5;
		System.out.println("Your Total Average is : " + avg);
		
		
		
		String s = (marks >= 540 && marks <= 600)?"Grade A+":
			       (marks >= 450 && marks <= 539)?"Grade A":
			       (marks >= 360 && marks <= 449)?"Grade B":
			       (marks >= 270 && marks <= 359)?"Grade C":
			    	(marks>=250&&marks <= 270)?"D":"fail";
		
		System.out.println(marks);
		System.out.println(avg);
		System.out.println(s);
			sc.close();
			

	}

}
