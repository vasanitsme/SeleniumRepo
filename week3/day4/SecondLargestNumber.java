package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int [] numbers = {3, 2, 11, 4, 6, 7};
		
		List <Integer> list = new ArrayList<Integer>();
		
		for (int num:numbers) {
			
			list.add(num);
			
		}
		
		Collections.sort(list);
		
		System.out.println("Second largest number in the aray is : " + list.get(list.size()-2));

	}

}
