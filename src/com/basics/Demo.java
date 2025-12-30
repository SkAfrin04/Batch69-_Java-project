package com.basics;

public class Demo {
	static int eid;
	String ename;
	static {
		eid = 455;
		System.out.println(eid);
	}
	{
		ename = "afrin";
		System.out.println(ename);
	}

	public static void Affu() {
		long eno = 783452748l;
		System.out.println(eno);

	}

	void display() {
		double salary = 100000.00;
		System.out.println(salary);
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		Affu();
		d.display();
		Affu();
	}

}
