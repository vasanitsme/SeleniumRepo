package week4.day4;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionHomeAssignments {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Load the Amazon url
		driver.get("https://www.amazon.in");

		// Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		// Get the price of the first product.
		String priceText = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		// print the price of the first product.
		System.out.println("Price of the first product is  : " + priceText);
		
		// Get ratings
		String ratingText = driver.findElement(By.xpath("//span[@class='a-size-small a-color-base']")).getText();
		System.out.println("Ratings of the first product is  : " + ratingText);

		// Click the first text link of the first image.
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Home page title is : " + driver.getTitle());
		System.out.println("Current window handle is: " + parentWindow);
		
		// Take a screenshot of the product displayed.
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/Amazon-Oneplus.png");
		FileUtils.copyFile(srcFile, destFile);
		
		
		Set<String> myHandle = driver.getWindowHandles();
		
		for(String handle : myHandle ) {
			
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to child eindow title: " + driver.getTitle());
				break;
			}
		}
		
		
		System.out.println("Item page title is : " + driver.getTitle());

		driver.findElement(By.id("add-to-cart-button")).click();

		String getPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		if (priceText.equals(getPrice)) {
			System.out.println("Price verified suceuessfully");
		} else {

			System.out.println("Price NOT verified suceuessfully");

		}

		driver.quit();

	}

}
