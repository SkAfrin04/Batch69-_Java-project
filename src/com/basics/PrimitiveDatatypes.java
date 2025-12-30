package com.basics;

public class PrimitiveDatatypes {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean boo;

	public void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(boo);

	}

	public static void main(String[] args) {
		PrimitiveDatatypes p1 = new PrimitiveDatatypes();
		p1.display();

	}

}
