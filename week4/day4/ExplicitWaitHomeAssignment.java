package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHomeAssignment {

	public static void main(String[] args) {
		
		//handle browser popups
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		//instatiate webdriver 
		WebDriver driver = new ChromeDriver(options);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//maxmize window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.id("j_idt87:j_idt92")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		
		WebElement targetElement = driver.findElement(By.id("j_idt87:j_idt93"));
		
		
		
		Boolean hideElement = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt87:j_idt93")));
		
		System.out.println("The invisibility of the element is : " + hideElement);
		

	}

}
