package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class LearnExplicitWait {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.id("j_idt87:j_idt89")).click();

		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(3000));

	    WebElement expElement = expWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt90")));

		String targetText = expElement.getText();

		System.out.println("Element is visible and the text is: " + targetText);

		driver.quit();

	}

}
