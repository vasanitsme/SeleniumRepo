package week3.day2;

public class InheritEdge extends InheritChrome  {
	
	public void takeSnap() {
		System.out.println("takeSnap method invoked from InheritEdge class");

	} 
	
	public void clearCookies() {
		System.out.println("clearCookies method invoked from InheritEdge class");

	} 
	
	
	@Override
	public void clearCache() {
		System.out.println("Overided clearCache method invoked sucessfuly");
		super.clearCache();
	}
	
public static void main(String[] args) {
		
	InheritEdge edgeBrowser = new InheritEdge();
		
		edgeBrowser.browserName = "Chrome";
		edgeBrowser.browseVersion = 1.45f;
		
		edgeBrowser.openURL();
		edgeBrowser.navigateBack();
		edgeBrowser.closeBrowser();
		
		edgeBrowser.takeSnap();
		edgeBrowser.clearCache();
		edgeBrowser.clearCache();
		
		
		
		
		
		
	}

}
