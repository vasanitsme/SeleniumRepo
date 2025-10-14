package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {

		// get current url
		// get attribute
		// isEnabled()
		// isDisabled()
		// isDisplayed()
		// get text() --> input tag
		// get attributes value() --> value attribute

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// loading url
		String url = "https://www.leafground.com/checkbox.xhtml;jsessionid=node01kgdavg8x4plu1gun9sjc29wzq7249468.node0";

		driver.get(url);
		// get title
		String title = driver.getTitle();
		System.out.println("Title of my current page is: " + title);

		// verify title
		if (title.contains("CheckBox Components")) {
			System.out.println("url loaded successfully");
		}

		else {
			System.out.println("url failed to load");
		}

		// get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("My current url is : " + currentUrl);

		// verify current url
		if (currentUrl.contains(url)) {
			System.out.println("current url loaded successfully");
		}

		else {
			System.out.println("current url failed to load");
		}

		// get text
		String eleDiabled = driver.findElement(By.xpath("//span[text()='Disabled']")).getText();

		// Verify get text
		if (eleDiabled.contains("Disabled")) {
			System.out.println("Element identied successfully");
		}

		else {
			System.out.println("Failed to load an element");
		}

		// navigate to input url
		driver.get("https://www.leafground.com/input.xhtml");

		// get DOM attributes
		String eleDom = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).getDomAttribute("value");

		// Verify DOM attributes
		if (eleDom.contains("Chennai")) {
			System.out.println("DOM attribute identied successfully: " + eleDom);
		}

		else {
			System.out.println("Failed to load DOM attribute");
		}

		driver.get(url);
		
		// is Enabled() - true
		Boolean eleAjax = driver.findElement(By.xpath("//span[text()='Ajax']")).isEnabled();
		// Verify whether Ajax element is enabled or not
		if (eleAjax = true) {
			System.out.println("Ajax element is: Enabled: " + eleAjax);
		}

		else {
			System.out.println("Ajax element is: Disbaled: " + eleAjax);
		}
		
		//is Enabled() - false
		Boolean elementDisabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		
		// Verify whether Disabled element is enabled or not
		if (elementDisabled != true) {
			System.out.println("Disabled checkbox webelement is: Disabled: " + elementDisabled);
		}

		else {
			System.out.println("Disabled checkbox webelement is: Enabled: " + elementDisabled);
		}
		

		// is Displayed()
		Boolean eleDisabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed();
		// Verify whether Disabled element is enabled or not
		if (eleAjax = true) {
			System.out.println("Disabled element is: displayed: " + eleDisabled);
		}

		else {
			System.out.println("Ajax element is: not displayed: " + eleDisabled);
		}

		// closing driver
		driver.quit();

	}

}
