package week4.day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnMultipleWindowHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();
			
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Navigate to url
		driver.get("https://www.leafground.com/window.xhtml");
		
		//get current window address
		String myCurrentWindowHandle = driver.getWindowHandle();
		System.out.println("My current window address is: " + myCurrentWindowHandle);
		
		//get current tile 
		String myCurrentPagetitle = driver.getTitle();
		System.out.println("My current window title is: " + myCurrentPagetitle);
		
		driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
		
		//get child window address and title
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window currently opened are : " + windowHandles);
		System.out.println("Window currently opened are : " + windowHandles);
		
		//close current tab
		driver.quit();
		
		//close all open tabs
		driver.close();

	}

}
