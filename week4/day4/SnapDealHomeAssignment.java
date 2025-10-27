package week4.day4;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.List;



public class SnapDealHomeAssignment {

	
	 		 
	public static void main(String[] args) throws Exception {

		/*
		 *  2. Go to "Men's Fashion". 3. Go to
		 * "Sports Shoes". 4. Get the count of sports shoes. 5. Click on
		 * "Training Shoes". 6. Sort the products by "Low to High". 7. Check if the
		 * displayed items are sorted correctly. 8. Select any price range ex:(500-700).
		 * 9. Filter by any colour. 10. Verify all the applied filters. 11. Mouse hover
		 * on the first resulting "Training Shoes". 12. Click the "Quick View" button.
		 * 13. Print the cost and the discount percentage. 14. Take a snapshot of the
		 * shoes. 15. Close the current window. 16. Close the main window.
		 */
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		
		//3. . Go to "Men's Fashion".
		WebElement element = driver.findElement(By.xpath("//span[@class='catText' and contains(text(),'Men')]"));
		
		//move to sports shpe
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		//cllick on sports shoe
		driver.findElement(By.xpath("//span[@class='linkTest' and contains(text(),'Sports Shoes')]")).click();
		
		//some time cursor moves to pincode  
		Boolean checkPincode = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']")).isDisplayed();
		System.out.println("Visibility of pincode elemtn is: " + checkPincode);
		
		if(checkPincode = true) {
			driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']")).sendKeys("625513");
			driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
			
		}
		
		//counting sports shoe
		String sportsShoeCount = driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div")).getText();
		System.out.println("Sports Shoe count is : " + sportsShoeCount);
		
		Thread.sleep(1000);
		
		//click on training shoes
		WebElement trainingShoe = 	driver.findElement(By.xpath("//div[text()='Training Shoes']/parent::a"));
		//action.moveToElement(trainingShoe);
		trainingShoe.click();
		
		//Sort the products by "Low to High".
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		
		// from low to high  
		driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']")).click();
		
		//getting first product cost
		String productOne = driver.findElement(By.id("display-price-640950075446")).getText().replaceAll("[^0-9]", "");
		
		//getting second product cost
		String productSecond = driver.findElement(By.id("display-price-676842253028")).getText().replaceAll("[^0-9]", "");
		
		//changing the cost stig to integer
		int productOneCost = Integer.parseInt(productOne);
		int productTwoCost = Integer.parseInt(productSecond);
		
		//comparing the cost so that sorting is in low to high
		if(productOneCost<=productTwoCost) {
			
			System.out.println("Element sorted sucuessfully from low to high");
			}
		
		//shoe filter - by cost with from cost 
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500");
		
		//shoe filter - by cost with to cost
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("700");
		
		//apply filter 
		driver.findElement(By.xpath("//div[normalize-space()='GO']")).click();
		
		Thread.sleep(1000);
		
		//filter with colot
		WebElement colorFilter = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
		action.scrollToElement(colorFilter).perform();
		colorFilter.click();
		
		Thread.sleep(1000);
		List<WebElement> shoes = driver.findElements(By.xpath("//p[@class='product-title']"));
		
		for(int i=0; i<shoes.size();i++) {
			String shoeDetails = shoes.get(i).getText().toLowerCase();
			if((shoeDetails.contains("white")) || (shoeDetails.contains("blue"))){
				System.out.println("Color filter applied syucuessfully");
			}			
		}
		
		Thread.sleep(1000);
		
		WebElement firstTrainingshoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		
		action.moveToElement(firstTrainingshoe).perform();
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		
		String shoeCost = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span")).getText();
		
		String shoeDiscount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
		System.out.println("COst of the shoe is : " + shoeCost +"||" + " Discount applied is " + shoeDiscount);
		Thread.sleep(1000);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/myFirstShoe.png");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("My first shoe purchased successfullt");
		
		driver.quit();
		
		
		//

	}

}
