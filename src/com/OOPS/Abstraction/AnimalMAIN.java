package com.OOPS.Abstraction;

public class AnimalMAIN {

	public static final String name = "vvs";

	public static void main(String[] args) {

		System.out.println("Main method Started !!");

		System.out.println("Welcome to Animal PArk");

		// Cannot Instantiate the type Animal
		// Animal a = new Animal();

		System.out.println("**********Dog related info *********");
		// Implementation hiding Animal d = new Dog();

		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		d.run();
		System.out.println("*********** String Related info **********");
		System.out.println(Animal.orgname);
		// sysout(d.orgname);

		System.out.println("******* Cat info ********* ");

		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.sleep();
		c.run();
//This static method of interface Animal can only be accessed as Animal.breath
		Animal.breath();

		System.out.println("******* Horse info ********* ");

		Animal h = new Horse();
		h.eat();
		h.sound();
		h.walk();
		h.sleep();
		h.run();

	}

}
