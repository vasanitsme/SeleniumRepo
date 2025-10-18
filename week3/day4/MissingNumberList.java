package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberList {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 10, 6, 8 };

		Arrays.sort(numbers);

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length-1; i++) {

			if (numbers[i + 1] != numbers[i] + 1) {
				for (int j = numbers[i] + 1; j < numbers[i + 1]; j++) {
					list.add(j);
				}

			}
		}
		System.out.println("Missing number in the array is : " + list);
	}

}
