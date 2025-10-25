package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningWebTable {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://www.leafground.com/table.xhtml");
		
		
		//getting all rows
		List<WebElement> getAllRows = driver.findElements(By.xpath("//table[@role='grid']//tbody/tr"));
		
		System.out.println("Number of rows int he table : "+ getAllRows.size());

		// Loop through rows and columns
		for (int i = 1; i <= getAllRows.size(); i++) {
		    List<WebElement> columns = driver.findElements(By.xpath("//table[@role='grid']//tbody/tr[" + i + "]/td"));
		    for (int j = 1; j <= columns.size(); j++) {
		        WebElement cell = driver.findElement(By.xpath("//table[@role='grid']//tbody/tr[" + i + "]/td[" + j + "]"));
		        System.out.print(cell.getText() + "  |  ");
		    }
		    System.out.println();
		}

		// closing the current tab
		driver.close();

	}

}
