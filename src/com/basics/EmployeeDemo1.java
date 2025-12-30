package com.basics;

import java.math.*;

public class EmployeeDemo1 {
	String Employeename = "king";
	BigDecimal BasicSalary = new BigDecimal("5000");
	BigDecimal PF;
	BigDecimal DA;
	BigDecimal GST;
	BigDecimal MonthlySalary;
	BigDecimal AnnualSalary;
//instance block
//calculations
//Explanation PF = 3/100 = 0.03 * 5000 = 150

	{
		PF = BasicSalary.multiply(new BigDecimal("0.03"));
		DA = BasicSalary.multiply(new BigDecimal("0.05"));
		GST = BasicSalary.multiply(new BigDecimal("0.09"));
		MonthlySalary = BasicSalary.add(DA).subtract(PF).subtract(GST);
		AnnualSalary = MonthlySalary.multiply(new BigDecimal("12"));

		System.out.println("Salary Details");
		System.out.println("---------------------------------");
		System.out.println("Employee Name:" + Employeename);
		System.out.println("Basic Salary: " + BasicSalary);
		System.out.println("PF(3%) Deduction:" + PF);
		System.out.println("DA(5%) Allowances:" + DA);
		System.out.println("GST(9%) Deduction:" + GST);
		System.out.println("Monthly Salary:" + MonthlySalary);
		System.out.println("Annual Salary:" + AnnualSalary);

	}

	public static void main(String[] args) {
		EmployeeDemo1 d = new EmployeeDemo1();
	}

}
