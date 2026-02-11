package languagefundamentals.constructors;

public class Student {
	int id;
	String name;
	String Branch;
	int marks;

	Student(int id, String name, String Branch, int marks) {
		System.out.println("Parameterized arg called !!");
		this.id = id;
		this.name = name;
		this.Branch = Branch;
		this.marks = marks;

	}

	public static void main(String[] args) {
		Student s1 = new Student(20, "Affu", "Computers", 500);
        s1.display();
	}

	void display() {
		System.out.println("Student ID is : "  + id);
		System.out.println("Student name is : " + name);
		System.out.println("Student Branch is : " + Branch);
		System.out.println("Student marks are : " + marks);

	}

}
