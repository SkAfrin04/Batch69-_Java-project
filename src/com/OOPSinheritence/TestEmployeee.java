package com.OOPSinheritence;

class Employee {
	String name;
	Address1 address1;

	public Employee(String name, Address1 address1) {
		super();
		this.name = name;
		this.address1 = address1;
	}

	public Employee(Employee emp1) {
		this.name = emp1.name;
		this.address1 = new Address1();
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1() {

	}
}

	public class TestEmployeee {

		public static void main(String[] args) {

			Address1 addr = new Address1("hyd");
			Employee emp1 = new Employee("Affu", addr);
			System.out.println(emp1.name);
			System.out.println(emp1.address1.city);
			System.out.println("******************");

			Employee emp2 = new Employee(emp1);
			System.out.println(emp2.name);
			System.out.println(emp2.address1.city);

			emp2.name = "Shravs";
			emp2.address1.city = "Banglore";

			System.out.println("*******After Change*********");
			System.out.println(emp2.name);
			System.out.println(emp2.address1.city);
			System.out.println(emp1.name);
			System.out.println(emp1.address1.city);

		}
	}
