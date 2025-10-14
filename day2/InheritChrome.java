package week3.day2;

public class InheritChrome extends InheritBrowser {
	
	public void openIncognito() {
		System.out.println("openIncognito method invoked from InheritChrome class");

	} 
	
	public void clearCache() {
		System.out.println("clearCache method invoked from InheritChrome class");

	} 
	
	public static void main(String[] args) {
		
		InheritChrome chromeBrowser = new InheritChrome();
		
		chromeBrowser.browserName = "Chrome";
		chromeBrowser.browseVersion = 1.45f;
		
		chromeBrowser.openURL();
		chromeBrowser.navigateBack();
		chromeBrowser.closeBrowser();
		
		InheritChrome cb = new InheritChrome();
		cb.openIncognito();
		cb.clearCache();
		
		
	}

}
