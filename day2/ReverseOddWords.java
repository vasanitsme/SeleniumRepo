package week2.day2;

public class ReverseOddWords {
	
			

	public static void main(String[] args) {
		
		String test = "changeme";
		int lenTest = test.length();
		char [] newTest = test.toCharArray();
		
		for (int i=0; i<=lenTest-1;i++) {
			
			if (i%2==1) {
				
				newTest[i] = Character.toUpperCase(newTest[i]);
								
			}
		}
		
		String result = new String(newTest);
		
		System.out.println("orignal: " + test);
		System.out.println("Result: " + result);
	}
}
