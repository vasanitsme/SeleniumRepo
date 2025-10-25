package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentOnePVR {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to url
		driver.get("https://www.pvrcinemas.com/");
		
		
		
		//click cinema enable 
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		//clicking select cinema
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder'][text()='Select Cinema']")).click();
		
		//selecting theatre
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		//selecting show date and timings
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		//selecting movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='BISON KAALAMAADAN']")).click();
		
		//select timings
		driver.findElement(By.xpath("//span[@class='mx-2'][text()='10:25 PM']")).click();
		
		//click booking
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']/span")).click();
		
		//accepting terms popup
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//selecting seat
		driver.findElement(By.id("SL.SILVER|D:10")).click();
		
		//clicking proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//printing seat nymber
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Selected seat numberis: " + seatNumber);
		
		//printing grand totel
		String grandTotal = driver.findElement(By.xpath("//span[text()='214.48']")).getText();
		System.out.println("Grand total is: " + grandTotal);
		
		//pringting page title
		System.out.println("Current page title is: " + driver.getTitle());
			
		driver.quit();
	}

}
