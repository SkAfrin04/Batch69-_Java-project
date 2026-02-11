package ConstructorChaining;

public class Student {
	String sname;
	int sid;

	Student() {
		System.out.println("Student no arg constructor called !!");
	}

	Student(String sname) {
		this();
		System.out.println("Student one arg constructor called !!");
		this.sname = sname;
	}

	Student(String sname, int sid) {
		System.out.println("Student two arg constructor called !!");
		this(sname);
		this.sid = sid;

	}
}

class Teacher extends Student {
	String ssubject;
	int smarks;

	Teacher() {
		System.out.println("Teacher no arg constructor called !!");
	}

	Teacher(String ssubject) {
		super(ssubject);
		System.out.println("Teacher one arg constructor called !!");
	}

	Teacher(String ssubject, int smarks) {
		super(ssubject, smarks);
		System.out.println("Teacher two arg constructor called !!");

	}
	 Teacher(String sname, int sid, String ssubject, int smarks) {
	        super(sname, sid);
	        this.ssubject = ssubject;
	        this.smarks = smarks;
	        System.out.println("Teacher Four-Arg Constructor");
	    }


	public static void main(String[] args) {
		Teacher t = new Teacher("Afrin" ,16 ,"JAVA" ,200);
		t.display();

	}

	void display() {
		System.out.println("Student name is : " + sname);
		System.out.println("Student id is : " + sid);
		System.out.println("Subject is : " + ssubject);
		System.out.println("Student marks are : " + smarks);
	}
}
