package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleHomeAssignment {

	public static void main(String[] args) throws Exception {
		// chrome option to login as guest
				ChromeOptions options = new ChromeOptions();
				options.addArguments("guest");
				// chrome driver initialization
				ChromeDriver driver = new ChromeDriver(options);

				String url = "http://leaftaps.com/opentaps/";
				String username = "DemoSalesManager";
				String password = "crmsfa";

				// window options
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				driver.get(url);

				driver.findElement(By.id("username")).sendKeys(username);
				driver.findElement(By.id("password")).sendKeys(password);
				driver.findElement(By.className("decorativeSubmit")).click();
				String landingPageTitle = driver.getTitle();
				System.out.println(landingPageTitle);
				
				driver.findElement(By.id("label")).click();
				
				System.out.println("before merge Window currently opened are : " + driver.getWindowHandle());
				System.out.println("before merge Window title is opened are : " + driver.getTitle());
				
				//clicking contacts tab
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				
				//clicking merge cotacts
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				
				String parentWindow = driver.getWindowHandle(); 
				
				//opening first name contacts
				driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img[@src='/images/fieldlookup.gif'])[1]")).click();
				
				Set<String> allFirstNameWindows = driver.getWindowHandles();
				for (String window1 : allFirstNameWindows) {
				    if (!window1.equals(parentWindow)) {
				        driver.switchTo().window(window1); // Switch to child
				        System.out.println("Child Window Title: " + driver.getTitle());
				        driver.findElement(By.xpath("//a[text()='11104']")).click();
				        Thread.sleep(3000);
				        
				    }
				}
				
				//coming back to parent window
				driver.switchTo().window(parentWindow);

				//opening second contacts
				driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img[@src='/images/fieldlookup.gif'])[2]")).click();
				
				Set<String> allSecondNameWindows = driver.getWindowHandles();
				for (String window2 : allSecondNameWindows) {
				    if (!window2.equals(parentWindow)) {
				        driver.switchTo().window(window2); // Switch to child
				        System.out.println("Child Window Title: " + driver.getTitle());
				        driver.findElement(By.xpath("//a[text()='11102']")).click();
				        Thread.sleep(3000);
				        
				    }
				}
				
				//coming back to parent window
				driver.switchTo().window(parentWindow);
				//clicking merge button
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				
				//accept Alert
				driver.switchTo().alert().accept();
				
				//getting title
				String mergeTitle = driver.getTitle();
				
				if(mergeTitle.contains("View Contact")) {
					System.out.println("Contacts merged successfully");
					driver.quit();
					
				}
				
				else {
					System.out.println("Merging contacts failed");
					driver.quit();
				}
				
				
	}

}
