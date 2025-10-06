package week2.day1;

public class FindingOddForLoop {

	public static void main(String[] args) {

		// using mod operator for (int n = 1; n <= 10; n++) {
		for (int n = 1; n <= 10; n++) {

			if (n % 2 == 1) {

				System.out.println(n);
			}

		}

		// using increment operator
		for (int i = 1; i < 10;) {
			System.out.println(i);
			i += 2;
		}
	}
}
