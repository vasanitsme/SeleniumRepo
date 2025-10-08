package week2.day2;

public class StringReverse {

	public static void main(String[] args) {
		
		String companyName = "TestLeaf";
		
		char[] actname = companyName.toCharArray();
		
		for (int i=actname.length-1; i>=0; i--) {
			System.out.print(actname[i]);
		}
			
	}

}
