package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BasicXpath {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		String url = "http://leaftaps.com/opentaps/";
		String username = "DemoSalesManager";
		String password = "crmsfa";
		
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		String landingPageTitle = driver.getTitle();
		System.out.println(landingPageTitle);
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		if (landingPageTitle.equals(expTitle)) {
			System.out.println("Login successfull");
			driver.close();
		}
		
		else {
			System.out.println("Loginf failed - please try with valid credentials");
			driver.close();
		}
			
	}

}
