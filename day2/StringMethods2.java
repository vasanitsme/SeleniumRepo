package week2.day2;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String input = "Amazon development centre,Chennai";
		
		String company = input.toLowerCase();
		
		//String method - split()
		String[] split = company.split(" ");
		
		for (int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]);	
		}
		
		System.out.println("-------------------");
		
		//string method - replace()
		
		String replace = input.replace("e","a");
		System.out.println("Replaced string is: " + replace );
		
		//string method - replaceall()
		
		String replaceAll = input.replaceAll("Amazon", "*");
		System.out.println("Replace all string is:  " + replaceAll );
		
		//string method - substring()
		String substring = input.substring(0, 10);
		System.out.println("Substring is : " + substring);
		
		//string methos - uppercase and lowercase
		
		String lowerCase = input.toLowerCase();
		String upperCase = input.toUpperCase();
		System.out.println("lower case : " + lowerCase);
		System.out.println("uppercasee : " + upperCase);

	}

}
