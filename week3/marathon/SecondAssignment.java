package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondAssignment {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to url
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys", Keys.ENTER);
		
		String totalCount = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		
		System.out.println("Totle result of bag is: " + totalCount);
		
		driver.findElement(By.xpath("//span[text()='LOVEVOOK']")).click();
		
		driver.findElement(By.xpath("//span[text()='JanSport']")).click();
		
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String FirstElementText = driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']/h2/span")).getText();
		System.out.println("First element text is : " + FirstElementText);
		
		System.out.println("Current page title is : " + driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		/*
		 * 1) Launch Chrome 02) Load https://www.amazon.in/ add implicitlyWait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 03) Type
		 * "Bags for boys" in the Search box 04) Choose the item in the result (bags for
		 * boys) 05) Print the total number of results (like 50000) example like
		 * this-----> 1-48 of over 50,000 results for "bags for boys" 06) Select the
		 * first 2 brands in the left menu (like American Tourister, Generic) 07) Choose
		 * New Arrivals (Sort) 08) Print the first resulting bag info (name, discounted
		 * price) 09) Get the page title and close the browser(driver.close())
		 */

	}

}
