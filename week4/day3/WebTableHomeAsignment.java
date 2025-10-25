package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableHomeAsignment {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://finance.yahoo.com/markets/crypto/all/");


		// getting all rows
		List<WebElement> getAllRows = driver.findElements(By.xpath("//table[@class='yf-1onk3zf bd']//tbody/tr"));
		System.out.println("Number of rows int he table : " + getAllRows.size());

		for (int i = 1; i < getAllRows.size(); i++) {

			WebElement getCurrenctCol = driver.findElement(By.xpath("//table[@class='yf-1onk3zf bd']//tbody/tr[" + i + "]/td[2]"));
			String CurrenctName = getCurrenctCol.getText();
			System.out.println("Row :" + i + "|" + " Crypto Currency Name is: " + CurrenctName);
		}

		driver.quit();
	}
	
	

}
