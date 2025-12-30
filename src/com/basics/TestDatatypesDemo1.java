package com.basics;

import java.math.*;

public class TestDatatypesDemo1 {
	Byte b1 = 10;
	Short s1 = 5;
	Integer i1 = 15;
	Long l1 = 5678l;
	Float f1 = 5.7f;
	Double D1 = 100000.00;
	Character c1 = 'f';
	Boolean boo1 = true;
	BigInteger bi1;
	BigDecimal bd1;
	Sample s;

	class Sample {

	}

	public static void main(String[] args) {
		TestDatatypesDemo1 t1 = new TestDatatypesDemo1();
		System.out.println(t1.b1);
		System.out.println(t1.s1);
		System.out.println(t1.i1);
		System.out.println(t1.l1);
		System.out.println(t1.f1);
		System.out.println(t1.D1);
		System.out.println(t1.c1);
		System.out.println(t1.boo1);
//for BigInteger
		BigInteger b = new BigInteger("678945783948578393");
		System.out.println(b);
		BigInteger v = new BigInteger("738729729377839279");
		System.out.println(v);
		System.out.println("---------------Add--------------");
		System.out.println(b.add(v));
		System.out.println("---------------Substract-----------");
		System.out.println(b.subtract(v));
		System.out.println("---------------Multiply---------------");
		System.out.println(b.multiply(v));
		System.out.println("--------------divide------------------");
		System.out.println(b.divide(v));
		System.out.println("-------------modulus-----------------");
		System.out.println(b.mod(v));

//for BigDecimal
		BigDecimal d = new BigDecimal("200");
		System.out.println(d);
		BigDecimal q = new BigDecimal("300");
		System.out.println(q);
		System.out.println("------------Add----------");
		System.out.println(d.add(q));
		System.out.println("------------Substract------------");
		System.out.println(d.subtract(q));
		System.out.println("-----------Multiply-----------");
		System.out.println(d.multiply(q));
		System.out.println("-------divide--------");
		System.out.println(q.divide(d));

	}

}
