package Operators;

public class TestDemoOp3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !! ");

		long a = 20;
		long b = 30;
		System.out.println(-a);
		System.out.println(+b);
		System.out.println("******************");
		System.out.println(a++);// 5 --> 6 : a++ --> a = a+1
		System.out.println(++a);// 7 a = a+1
		System.out.println(++a);// 8
		System.out.println(a++);// 8 --> 9

		System.out.println("**************");
		System.out.println(++b);// 7
		System.out.println(++b);// 8
		System.out.println(b++);// 8 --> 9
		System.out.println("B value : " + b);
//
		System.out.println(a--);// 9--> 8 a-- : a= a-1
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(--b);// 8
		System.out.println(b--);// 8 --> 7
		System.out.println(--b);// 6
		System.out.println("A value : " + a);// 6
		System.out.println("B value : " + b);// 6

		System.out.println(a++ + b++ + a-- + b--);//

		System.out.println(a);
		System.out.println(b);

		// 7 + 8 + 6 + 8 + 7 + 9
		System.out.println(++a + ++a + b++ + a++ + b++ + a++);//

	}

}
