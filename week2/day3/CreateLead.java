package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		String url = "http://leaftaps.com/opentaps/";
		String username = "DemoSalesManager";
		String password = "crmsfa";
		
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);;
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		String landingPageTitle = driver.getTitle();
		System.out.println(landingPageTitle);
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		if (landingPageTitle.equals(expTitle)) {
			System.out.println("Login is sucesssfull");
			Thread.sleep(3000);
			driver.findElement(By.id("label")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("firstname");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("lastname");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("title");
			driver.findElement(By.className("smallSubmit")).click();
			String actAccoutPageTitle =  driver.getTitle();
			String expAccountPageTitle = "Create Lead | opentaps CRM";
			System.out.println("Lead Page title is : " + actAccoutPageTitle);
			if (actAccoutPageTitle.equals(expAccountPageTitle)) {
				System.out.println("Home Assignment <2>: Create Lead");
				driver.close();
			}
			else {
				System.out.println("some issue in findiing elements");
			}
		}
		
		else {
			System.out.println("Loginf failed - please try with valid credentials");
			driver.close();
		}
		
		
	}

}
