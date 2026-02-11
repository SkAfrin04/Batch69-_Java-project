package languagefundamentals.constructors;

public class Student1 {
	int rollno;
	String name;
	String branch;

	Student1() {
		System.out.println("No arg constructor called !!");
	}

	Student1(int rollno, String name) {
		System.out.println("One arg constructor called !!");
		this.rollno = rollno;
		this.name = name;
	}

	Student1(Student1 s, String branch) {
		System.out.println("Two arg construtor called !! ");
		this.branch = branch;
		this.rollno = s.rollno;
		this.name = s.name;

	}

	public static void main(String[] args) {
		Student1 s = new Student1(16, "Afrin");
		s.display();

		Student1 s1 = new Student1(s, "computers");
		s1.display();

	}

	void display() {
		System.out.println("Student roll no is : " + rollno);
		System.out.println("Student name is : " + name);
		System.out.println("Branch name is : " + branch);
	}

}
