package com.OOPS.Abstraction;

public class Horse implements Animal{

	@Override
	public void sound() {
		System.out.println("hehehhe....");
		
	}

	@Override
	public void walk() {
		System.out.println("Horse runs like anything !!");
		
	}

	@Override
	public void eat() {
		System.out.println("Horse can eat chenna !!");
		
	}
	
	@Override
	public void run() {
	System.out.println("When compared to other animals horse can run Too fast !!");	
		
	}

}
