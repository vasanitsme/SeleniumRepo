package week4.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionHomeAssignment {

	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://www.amazon.in/");

		// getting title for current page
		String homeTitle = driver.getTitle();
		System.out.println("Current page title is : " + homeTitle);

		// scroll to element
		WebElement scrollToElement = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));

		Actions action = new Actions(driver);
		action.scrollToElement(scrollToElement);
		// getting text of scroll element

		String text = scrollToElement.getText();
		System.out.println("Text is : " + text);
		scrollToElement.click();

		String conditionTitle = driver.getTitle();
		System.out.println("Condition title is : " + conditionTitle);

		if (homeTitle != conditionTitle) {

			System.out.println("condition of use element clicked successfully");

		}

		// takig screenshot

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/visible_screenshot.png");
		FileUtils.copyFile(srcFile, destFile);

		driver.quit();

	}

}
