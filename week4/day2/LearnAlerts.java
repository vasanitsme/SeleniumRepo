//Modal Alerts - 1. Simple - Action is Yes/accept, 2. Confirmation, 3.Prompt    
//Non-Modal Alerts

package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.leafground.com/alert.xhtml");

		
		
		//simple Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']//span[text()='Show']")).click();
		driver.switchTo().alert().accept();
		boolean eleVisible = driver.findElement(By.id("simple_result")).isDisplayed();
		if(eleVisible=true) {
			String alertText = driver.findElement(By.id("simple_result")).getText();
			System.out.println("Alert accepted sucessfullt: " + alertText);
		}
		
		
		//Confirmation Alert

		// Prompt action
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[text()='Show']")).click();
		driver.switchTo().alert().sendKeys("alert");
		driver.switchTo().alert().dismiss();

		String alertText = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if (alertText.contains("cancelled ")) {
			System.out.println("User sucuesssfully dismissed the alert");
		}

		driver.quit();

	}

}
