package week3.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] numA = { 3, 2, 11, 4, 6, 7 };

		int[] numB = { 1, 2, 8, 4, 9, 7 };

		List<Integer> commonList = new ArrayList<Integer>();

		for (int i = 0; i < numA.length; i++) {
			for (int j = 0; j < numB.length; j++) {

				if (numA[i] == numB[j]) {

					commonList.add(numB[j]);

				}

			}

		}

		System.out.println("Intersection of both array is : " + commonList);

	}

}
