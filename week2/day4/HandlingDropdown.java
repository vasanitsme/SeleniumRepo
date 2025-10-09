package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

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
			
			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select sourcedd = new Select(source);
			sourcedd.selectByIndex(1);
			System.out.println("ColdCall selected sucessfuly");
			
			WebElement mark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select markdd = new Select(mark);
			markdd.selectByVisibleText("Automobile");
			System.out.println("Automobile selected sucessfuly");
			
			WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select ownerdd = new Select(owner);
			ownerdd.selectByValue("OWN_CCORP");
			System.out.println("Corporation selected sucessfuly");
			
			String curPageTitle = driver.getTitle();
			System.out.println("Current page title is : " + curPageTitle);
			
			
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
