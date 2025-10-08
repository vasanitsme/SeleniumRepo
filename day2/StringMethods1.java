package week2.day2;

public class StringMethods1 {

	public static void main(String[] args) {

		// string literal
		String actName = "Jithin Krishna";
		String expName = "JiTHin KriSHna";

		// string instantiation
		String stdName = new String("Jithin Krishna");

		// String methods - length
		System.out.println("Length of the name is " + actName.length());

		// String methods - equals
		if (actName.equals(stdName)) {
			System.out.println("Both names are same");
		} else {

			System.out.println("Both names are NOT same");

		}

		// String methods - equal ignore case
		if (actName.equalsIgnoreCase(expName)) {
			System.out.println("Both names are same");
		} else {

			System.out.println("Both names are NOT same");

		}

		// String methods - contains
		boolean is_Exists = actName.contains("K");
		System.out.println("Is letter K exists: " + is_Exists);
		
		//String methods - convert string to chararray
		char charName[] = actName.toCharArray();
		for(int i=0; i<=actName.length()-1;i++) {
			System.out.print(charName[i]);
		}
		
		System.out.println();
		
		//String methods - convert string to chararray
		char revName[] = actName.toCharArray();
		for(int i=actName.length()-1;i>=0;i--) {
			System.out.print(revName[i]);
		}
		System.out.println();
		//String methods - finding index of a letter in a string
		System.out.println("Index of letter is : " + actName.charAt(3) );


	}

}
