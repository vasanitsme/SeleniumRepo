package week3.day3;

import java.util.Arrays;

public class MatchingElementsArray {

	public static void main(String[] args) {
		
		 int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7};
         Arrays.sort(a);
         Arrays.sort(b);
         
         
         for (int i=0; i<a.length;i++) {
        	 
        	 for (int j=0; j<b.length;j++){
        		 
        		if (a[i]==b[j]) {
        			
        			System.out.println("Identical match found between A and B: " + a[i]); }
        			
        		}
        		 
        	 }
        	 
         }
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
			/*
			 * System.out.println("a["+i+"] = " + a[i]); System.out.println("b["+i+"] = " +
			 * b[i]);
			 * 
			 * 
			 * if(a[i]==b[i]) {
			 * 
			 * System.out.println("Both A and B identical number: " + a[i]); }
			 * 
			 * else { System.out.println("No Identical numbers between A and B"); }
			 * 
			 * }
			 */
	}

