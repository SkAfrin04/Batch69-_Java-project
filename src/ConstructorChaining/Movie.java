package ConstructorChaining;
class Director{
	Director()
	{
		System.out.println("Director");
	}
}

public class Movie extends Director{
	String hero;
	String heroine;
	double budget;
	String moviename;

	Movie() {
		System.out.println("No arg Constructor called !! ");
		this("Prabhas");

	}

	Movie(String hero) {
		System.out.println("One arg Constructor called !! ");
		this(hero, "Anushka");

	}

	Movie(String hero, String heroine) {
		System.out.println("Two arg Constructor called !! ");
		this(hero, heroine, 10000000.0);

	}

	Movie(String hero, String heroine, double budget) {
		System.out.println("Three arg Constructor called !! ");
		this(hero, heroine, 10000000.0, "Mirchi");

	}

	Movie(String hero, String heroine, double budget, String moviename) {
		System.out.println("Four arg Constructor called !! ");
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
		this.moviename = moviename;
	}

	public static void main(String[] args) {
     Movie m = new Movie();
     m.display();
	}

	void display() {
		System.out.println("Hero Name is : " + hero);
		System.out.println("Heroine Name is : " + heroine);
		System.out.println("Movie Budget is : " + budget);
		System.out.println("Movie Name is : " + moviename);

	}

}
