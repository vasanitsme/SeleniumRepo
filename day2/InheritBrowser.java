package week3.day2;

public class InheritBrowser  {
	
	public String browserName = "Chrome";
	public float browseVersion = 2.3f;
	
	public void openURL() {
		System.out.println("OpenURL method invoked from InheritBrowser class");

	}
	public void closeBrowser() {
		System.out.println("closeBrowser method invoked from InheritBrowser class");

	}
	public void navigateBack() {
		System.out.println("navigateBack method invoked from InheritBrowser class");

	}
 	

	public static void main(String[] args) {
		
		InheritBrowser browser = new InheritBrowser();
		browser.openURL();
		browser.navigateBack();
		browser.closeBrowser();
		
		
		

	}

}
