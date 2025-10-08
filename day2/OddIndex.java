package week2.day2;

public class OddIndex {

	public static void main(String[] args) {

		String test = "I am a software tester";

		String[] split = test.split(" ");
		System.out.println(split.length);
		for (int i = 0; i <= split.length - 1; i++) {
			if (i % 2 == 1) {
				char[] revword = split[i].toCharArray();

				for (int j = split[i].length() - 1; j >= 0; j--) {
					System.out.print(revword[j]);
				}
			}

			else {

				char[] word = split[i].toCharArray();

				for (int x = 0; x <= split[i].length() - 1; x++) {
					System.out.print(word[x]);
				}
			}

			if (i < split.length - 1) {
				System.out.print(" ");
			}
		}

	}
}
