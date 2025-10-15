package week3.day3;

import java.util.Arrays;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		
			
		  int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		  Arrays.sort(num);

	        for (int i = 0; i < num.length; i++) {
	            for (int j = i + 1; j < num.length; j++) 
	                if (num[i] == num[j]) {
	                    System.out.println("Duplicate identified: " + num[i]);
	                }
	            }
			
			

	}

}
