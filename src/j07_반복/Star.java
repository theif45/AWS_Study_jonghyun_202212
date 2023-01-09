package j07_반복;

public class Star {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < 9 - i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
			}
			if (i > 4) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < -2 * i + 19; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}

	}

}
