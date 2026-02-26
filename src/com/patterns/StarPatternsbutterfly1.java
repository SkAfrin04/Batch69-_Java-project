package com.patterns;

public class StarPatternsbutterfly1 {

	public static void main(String[] args) {
		int star = 0;
		int space = 8;

		for (int i = 1; i <= 9; i++) {
			// Left Stars

			for (int l = 0; l <= star; l++) {
				System.out.print("*");
			}
			// for spaces
			for (int a = 0; a <= space; a++) {
				System.out.print(" ");
			}
			// right stars
			for (int r = 0; r <= star; r++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < 5) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
		}

	}

}
