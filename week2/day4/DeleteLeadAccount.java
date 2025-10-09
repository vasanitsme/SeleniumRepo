package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadAccount {

	public static void main(String[] args)  {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		String url = "http://leaftaps.com/opentaps/";
		String username = "DemoSalesManager";
		String password = "crmsfa";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get(url);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		String landingPageTitle = driver.getTitle();
		System.out.println(landingPageTitle);
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		if (landingPageTitle.equals(expTitle)) {
			System.out.println("Login is sucesssfull");
			driver.findElement(By.id("label")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();

			String leadID = driver.findElement(By.linkText("10013")).getText();
			System.out.println("First lead id is: " + leadID);

			driver.findElement(By.linkText("10013")).click();
			driver.findElement(By.linkText("Delete")).click();
			System.out.println("Lead ID: " + leadID +" was deleted sucessfully");
			driver.close();

		} else {
			System.out.println("Loginf failed - please try with valid credentials");
			driver.close();
		}
	}

}
