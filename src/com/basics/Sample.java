package com.basics;

public class Sample {
	static int eid;
	long eno;

	public static void Affu() {
		int eid = 234;
		System.out.println(eid);
	}

	void display() {
		long eno = 780456378l;
		System.out.println(eno);
		Affu();

	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.display();
	}

}
