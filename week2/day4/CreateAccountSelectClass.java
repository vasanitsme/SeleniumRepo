package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		String url = "http://leaftaps.com/opentaps/";
		String username = "DemoSalesManager";
		String password = "crmsfa";
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
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
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Test Srini");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			
			WebElement industry = driver.findElement(By.name("industryEnumId"));
			Select industrydd = new Select(industry);
			industrydd.selectByIndex(3);
			String selectedText1 = industrydd.getFirstSelectedOption().getText();
			System.out.println("Option:  " + selectedText1 +" selected successfully");
			
			WebElement owenership = driver.findElement(By.name("ownershipEnumId"));
			Select owenershipdd = new Select(owenership);
			owenershipdd.selectByVisibleText("S-Corporation");
			String selectedText2 = owenershipdd.getFirstSelectedOption().getText();
			System.out.println("Option:  " + selectedText2 +" selected successfully");
			
			WebElement source = driver.findElement(By.name("dataSourceId"));
			Select sourcedd = new Select(source);
			sourcedd.selectByValue("LEAD_EMPLOYEE");
			String selectedText3 = sourcedd.getFirstSelectedOption().getText();
			System.out.println("Option:  " + selectedText3 +" selected successfully");
			
			WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
			Select marketingdd = new Select(marketing);
			marketingdd.selectByIndex(6);
			String selectedText4 = marketingdd.getFirstSelectedOption().getText();
			System.out.println("Option:  " + selectedText4 +" selected successfully");
			
			WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
			Select statedd = new Select(state);
			statedd.selectByValue("TX");
			String selectedText5 = statedd.getFirstSelectedOption().getText();
			System.out.println("Option:  " + selectedText5 +" selected successfully");
			
			driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			driver.findElement(By.id("numberEmployees")).sendKeys("10");
			driver.findElement(By.className("smallSubmit")).click();
			String actAccoutPageTitle =  driver.getTitle();
			String expAccountPageTitle = "Create Account | opentaps CRM";
			System.out.println("Account Page title is : " + actAccoutPageTitle);
			if (actAccoutPageTitle.equals(expAccountPageTitle)) {
				System.out.println("Home Assignment <3>: Create Account by Select class completed sucuessfuly ");
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
