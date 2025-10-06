package week2.day1;

public class ConditionSwitch {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		switch (browserName) {
		case "chrome":
			System.out.println("Chrome browser launched");
			break;
			
		case "firefox":
			System.out.println("Firefox browser launched");
			break;
		
		default:
			System.out.println("Please enter a valid browser");
			break;
		} 

	}

}
