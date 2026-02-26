package com.Encapsulation;

//DTO : Data Transfer Object.
//POJO : Plain Old Java Object.
//MODEL : Data Model to connect DB Entities.

public class Employee {

	private int eid;
	private String ename;
	private long emobileno;
	private double esalary;
	private int eage;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getEmobileno() {
		return emobileno;
	}
	public void setEmobileno(long emobileno) {
		this.emobileno = emobileno;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}

	// we used void because setter cannot return any value
//	public void setEid(int eid) {
//		this.eid = eid;
//
//	}
//
//	public int getEid() {
//		return eid;
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
//
//	}
//
//	public String getEname() {
//		return ename;
//	}
//
//	public void setEsalary(double esalary) {
//		this.esalary = esalary;
//	}
//
//	public double getEsalary() {
//		return esalary;
//	}
//
//	public void setEmobileno(long emobileno) {
//		this.emobileno = emobileno;
//
//	}
//
//	public long getEmobileno() {
//		return emobileno;
//	}

//	public void setAge(int age) {
//		if (age >= 18) {
//			this.eage = age;
//		} else {
//			System.out.println("Your age is not eligible to play cricket for Team A");
//		}
//
//	}
//
//	public int getAge() {
//		return eage;
//	}
	

}
