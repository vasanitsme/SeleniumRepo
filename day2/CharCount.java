package week2.day2;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String userInput = scanner.nextLine();
		char actString[] = userInput.toCharArray();
		
		System.out.println("Please enter the char to check : ");
		String userChar = scanner.nextLine();
		char actChar[] = userChar.toCharArray();

		int count = 0;

		for (int i = 0; i <= userInput.length() - 1; i++) {

			if (actString[i] == actChar[0]) {
				count += 1;
			}

		}

		if (count == 0) {

			System.out.println("sorry! No matches found for " + actChar[0] + " in: " + userInput);

		}

		else { 
			System.out.println("Total count of " + actChar[0] + " in " + userInput + " is: " + count);
		}

	}

}
