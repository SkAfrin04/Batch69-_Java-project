package com.Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");

		Employee e1 = new Employee();
//		e1.salary = 500000.00; //The field Employee.salary is not visible

		// Accessing the data Directly we need to stop
		// for stoping the data access directly ,we must need to keep the data as
		// private.
//		System.out.println(e1.eid);//The field Employee.eid is not visible because we keep private in our class.
//		System.out.println(e1.ename);//The field Employee.ename is not visible
//		System.out.println(e1.mobileno);//The field Employee.mobileno is not visible
//		System.out.println(e1.salary);//The field Employee.salary is not visible

		e1.setEid(18);
		e1.setEname("Virat");
		e1.setEsalary(5000000.00);
		e1.setEmobileno(6794893380l);
		e1.setEage(16);

		System.out.println("Employee Id : " + e1.getEid());
		System.out.println("Employee Name : " + e1.getEname());
		System.out.println("Salary : " + e1.getEsalary());
		System.out.println(" Mobile No : " + e1.getEmobileno());
		System.out.println(" Age : " + e1.getEage());
	}

}
