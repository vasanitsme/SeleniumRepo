package week3.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		List<Integer> status = new ArrayList<Integer>();

		// Add one element
		marks.add(100);
		marks.add(200);
		marks.add(400);
		marks.add(600);
		marks.add(900);
		
		status.add(105);
		status.add(107);
		status.add(109);
		status.add(105);
		status.add(109);
		

		// Add one element
		marks.add(100);
		status.add(101);
		System.out.println("Add method in list: output: " + marks + status);

		// Add all element from other list
		marks.addAll(status);
		System.out.println("Add method in list: output: " + marks);
		
		//get ith element
		System.out.println("Get method in list: output: " + marks.get(2));
		
		//remove ith element from list
		System.out.println("Before remove: " + marks);
		System.out.println("Removed value is : " + marks.remove(4));
		System.out.println("After removal: " + marks);
		
		//remove ith element from list
		
		System.out.println("Before removeall: " + marks);
		System.out.println("After removalall: " + marks.removeAll(status));

	}

}
