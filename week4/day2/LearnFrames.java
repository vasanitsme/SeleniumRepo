package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().accept();
		
		String alertString = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		
		if(alertString.contains("You pressed OK!")) {
			System.out.println("Alert accepted sucuessfully");
		}
		
		driver.switchTo().defaultContent();
		driver.quit();

		

	}

}
