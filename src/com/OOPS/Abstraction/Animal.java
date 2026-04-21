package com.OOPS.Abstraction;

public interface Animal {

	// we can use static final for Strings but by default it is public.
	// if something has changed in interface you need to go update on all
	// classes. this is called tightly coupling or backward compatibiltiy.
	public static final String orgname = "Vcube";

	void sound();

	void walk();

	void eat();

//	Default methods are allowed only in interfaces.
//So whenever we changed something in interface
//all the classes which is implemented this interface should not broke.
//for not breaking all the classes , java introduced default methods in interfaces.
//Default methods we can override.
//To provide Backward Compatibility,we use default methods in interface.
	public default void sleep() {
		System.out.println("Any animal can sleep !!");
		
		hello();
	}

	default void run() {
		System.out.println("All animals can run !!");
		
		hello();
	}

//Static methods allowed in interfaces.
//So, whenever we create static method in interface which will be available for all classes to provide common or utility or constant behaviour. 
//Static methods we cannot override.
//static methods we can access only through interface names, in this case we cannot access through object reference.

	static void breath() {
		System.out.println("All animals mus breath for survival !!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called !!");
	}
	
//private methods introduced from java 1.9 version to provide re-usability and avoid the duplication from default methods.
//Ofcourse, private methods we cannot override.
	default void hello() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}
}
