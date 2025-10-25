package week4.day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandlByIndex {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();
			
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Navigate to url
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//get current window address
		String myCurrentWindowHandle = driver.getWindowHandle();
		System.out.println("My current window address is: " + myCurrentWindowHandle);
		
		//get current tile 
		String myCurrentPagetitle = driver.getTitle();
		System.out.println("My current window title is: " + myCurrentPagetitle);
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> MyHandles = driver.getWindowHandles();
		
		for (String title : MyHandles) {
			
			driver.switchTo().window(title);
			String currentTabTitle = driver.getTitle();
			System.out.println("My curent window title is: " + currentTabTitle);
			
			if (currentTabTitle.contains("Domestic & International Flight")){
				
				driver.switchTo().defaultContent();
				//close all open tabs
				driver.close();
				
				
			}
			
		}
		
		
		
		
		
		
		
		


	}

}
