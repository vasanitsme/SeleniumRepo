package week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {

		System.out.println(browserName + " browser launched sucessfully");
		return browserName;

	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {

		Browser browser = new Browser();

		String browserName = browser.launchBrowser("Firefox");
		System.out.println(browserName);
		browser.launchBrowser("chrome");
		browser.loadUrl();

	}

}
