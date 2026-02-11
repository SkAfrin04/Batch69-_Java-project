package ConstructorChaining;

public class Book {
	String Bookname;
	double price;

	Book(String Bookname, double price) {
		this.Bookname = Bookname;
		this.price = price;
		System.out.println("Two  arg Constructor called !");

	}
}

class Author extends Book {
	String Authorname;
	String Authorplace;

	Author(String Bookname, double price, String Authorname, String Authorplace) {
		super(Bookname, price);
		this.Authorname = Authorname;
		this.Authorplace = Authorplace;
	}

	public static void main(String[] args) {
		Author f = new Author("magic", 1230.00, "abcd", "asdgh");
		f.details();
	}

	void details() {
		System.out.println("Book Name is :" + Bookname);
		System.out.println("Book price is : " + price);
		System.out.println("Author Name is : " + Authorname);
		System.out.println("Author Place is : " + Authorplace);

	}

}
