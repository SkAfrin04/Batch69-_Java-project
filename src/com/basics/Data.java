package com.basics;

public class Data {
	byte svalue;
	short sshortvalue;
	int sid;
	long sno;
	float sheight;
	double ssalary;
	char sgender;
	boolean shostelfood;

	public void Afrin() {
		System.out.println("svalue is: " + svalue);
		System.out.println("sshortvalue is:" + sshortvalue);
		System.out.println("sid is:" + sid);
		System.out.println("sno is:" + sno);
		System.out.println("sheight is:" + sheight);
		System.out.println("ssalary is:" + ssalary);
		System.out.println("sgender is:" + sgender);
		System.out.println("shostelfood is:" + shostelfood);
	}

	public static void main(String[] args) {
		Data r = new Data();
		r.svalue = 18;
		r.sshortvalue = 100;
		r.sid = 234;
		r.sno = 8990345678l;
		r.sheight = 5.5f;
		r.ssalary = 100000.00;
		r.sgender = 'f';
		r.shostelfood = false;
		r.Afrin();
	}
}
