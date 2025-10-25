package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearningActionClass {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://www.snapdeal.com");
		
		//webelemtn to mouseHover
		WebElement mouseHover = driver.findElement(By.xpath("//span[@class='catText'][contains(text(),'Men')]"));
		
		//Action class
		Actions action = new Actions(driver);
		
		//moving to an element or mouseHover - perform is must
		action.moveToElement(mouseHover).perform();
		
		System.out.println("Before privacy policy -  title is " + driver.getTitle());
		
		//scroll to element
		WebElement scrollToElement = driver.findElement(By.xpath("//a[@class='underLineOnHover'][contains(text(),'Privacy Policy')]"));
		
		//moving to an element or mouseHover - perform is must
		action.scrollToElement(scrollToElement);
		
		scrollToElement.click();
		
		Thread.sleep(3000);
		System.out.println("After provacy policy -  title is " + driver.getTitle());
		Thread.sleep(3000);
		
		// Navigate to url
		driver.get("https://www.snapdeal.com");
		
		
		//double clicking element
		WebElement doubleClickelement = driver.findElement(By.xpath(("//h2[text()='TRENDING PRODUCTS']")));
		
		//mousaction double click
		action.doubleClick(doubleClickelement);
		Thread.sleep(3000);
		
		
		
		//closing driver
		driver.quit();

	}

}
