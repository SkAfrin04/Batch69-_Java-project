package com.basics;

public class Student {
	int sid;
	String sname;
	long smobileno;

	public void display() {
		System.out.println("student id is :" + sid);
		System.out.println("student name is :" + sname);
		System.out.println("student mobileno is :" + smobileno);
	}

	public static void Afrin() {
		Student s1 = new Student();
		s1.sid = 2334;
		s1.sname = "Affu";
		s1.smobileno = 783452839l;
		s1.display();
	}

	public static void main(String[] args) {
		Afrin();

	}

}
