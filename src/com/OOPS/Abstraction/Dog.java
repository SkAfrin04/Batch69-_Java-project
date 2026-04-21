package com.OOPS.Abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow Bow");
		
	}
	//default methods yes we can override
	@Override
	public  void sleep() {
		System.out.println("Dog can sleep mornings and active at nights !!");
	}
	

	@Override
	public void walk() {
		System.out.println("Dog can walk and also run like anything !!");
		
	}

	@Override
	public void eat() {
		System.out.println("Dogs can eat meat !!");
		
	}

//	public void sound() {
//		
//	}
//	
//	public void walk() {
//		
//	}
//	public void eat() {
//		
//	}
}
