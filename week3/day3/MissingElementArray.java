package week3.day3;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		
		int[] numInput =  {1,4,3,2,8,6,7};
		
		Arrays.sort(numInput);
		
		for (int i=1; i<numInput.length;i++) {
			if (i!=numInput[i-1]) {
				System.out.println(i);
				break;
			}
			
		}
		
		

	}

}
