package com.OOPS.Abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meaow Meaow");
		
	}

	@Override
	public void walk() {
		System.out.println("Cat can walk like a cat walk !!");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat & can also drink milk !!");
		
	}

}
