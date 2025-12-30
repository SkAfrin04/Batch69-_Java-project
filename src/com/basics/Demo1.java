package com.basics;

public class Demo1 {
	static int sid;
	String sname;
	static {
		System.out.println(sid);
	}
	{
		System.out.println(sname);
		Demo1 d1 = new Demo1();
	}

	public static void main(String[] args) {
		Demo1 d2 = new Demo1();

	}

}
