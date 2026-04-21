package com.StringHandling;

public class CreatingString {

	public static void main(String[] args) {
		// String Literals --> SCP :String Constant Pool
		String s1 = "JAVA";// only one object

		// String Literals --> SCP :String Constant Pool
		String s2 = "Afrin";// only one object

		// 0 Objects Creating
		String s3 = "JAVA";

		System.out.println(s1 == s3);// true

		// 2 objects Creating = 1 in scp + 1 in heap area
		String s4 = new String("Veera");

		// 0 objects in scp
		String s5 = new String("Veera");
		System.out.println(s4 == s5);
		
		String s6 = "Veera";
		System.out.println(s5==s6);
		
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s6));
		System.out.println(s6.hashCode());
		System.out.println(s4.hashCode());

	}

}
