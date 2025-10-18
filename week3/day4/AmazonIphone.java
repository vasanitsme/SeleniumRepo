package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonIphone {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		// get all iphone price web element
		List<WebElement> iPhonePrice = new ArrayList<WebElement>();
		List<Integer> price = new ArrayList<Integer>();

		iPhonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < iPhonePrice.size(); i++) {

			System.out.println(iPhonePrice.get(i).getText());
			String actPrice = iPhonePrice.get(i).getText().replaceAll("[^0-9]", "");
			int amazonPrice = Integer.parseInt(actPrice);
			price.add(amazonPrice);

		}

		Collections.sort(price);
		System.out.println("the smallest iphone cost is:  " + price.get(0));
		System.out.println("the largest iphone cost is:  " + price.get(price.size() - 1));

		// printing duplicate and unique prices

		Set<Integer> uniquePrice = new HashSet<Integer>();
		uniquePrice.addAll(price);
		System.out
				.println("Size of duplicate is : " + price.size() + " && List of prices includes duplicates: " + price);
		System.out
				.println("Size of duplicate is : " + uniquePrice.size() + " && List of unique prices: " + uniquePrice);

		driver.quit();

	}

}
