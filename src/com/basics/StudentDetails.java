package com.basics;

public class StudentDetails {
	int rollno;
	String Sname;
	double Smarks;
	boolean ispassed;

	public void display() {
		System.out.println("Student rollno is :" + rollno);
		System.out.println("Student Sname is :" + Sname);
		System.out.println("Student Smarks are :" + Smarks);
		System.out.println("Student ispassed in  :" + ispassed);

	}

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.rollno = 1;
		s.Sname = "Esha";
		s.Smarks = 80;
		s.ispassed = true;
		s.display();
		System.out.println("-------------------------------------------");

		StudentDetails s1 = new StudentDetails();
		s1.rollno = 2;
		s1.Sname = "Rahul";
		s1.Smarks = 30;
		s1.ispassed = false;
		s1.display();
		System.out.println("-------------------------------------------");

		StudentDetails s2 = new StudentDetails();
		s2.rollno = 3;
		s2.Sname = "Alia";
		s2.Smarks = 60;
		s2.ispassed = true;
		s2.display();
		System.out.println("-------------------------------------------");

		StudentDetails s3 = new StudentDetails();
		s3.rollno = 4;
		s3.Sname = "Divya";
		s3.Smarks = 45;
		s3.ispassed = true;
		s3.display();
		System.out.println("-------------------------------------------");

		StudentDetails s4 = new StudentDetails();
		s4.rollno = 5;
		s4.Sname = "Karthik";
		s4.Smarks = 25;
		s4.ispassed = false;
		s4.display();
		System.out.println("-------------------------------------------");

	}

}
