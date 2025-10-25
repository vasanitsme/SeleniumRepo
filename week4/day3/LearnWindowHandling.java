package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// Navigate to url
		driver.get("https://www.irctc.co.in/");

		// clicking to open multiple tabs
		driver.findElement(By.xpath("//button[text()='OK']")).click();

		// get all window address
		Set<String> allWindowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(allWindowHandles);

		// printing parent window title
		String parentTabTitle = driver.switchTo().window(list.get(0)).getTitle();
		System.out.println("printing parent tab title :" + parentTabTitle);

		//clicking to multiple element to open multiple window
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		// printing child window title
		String childTabTitle = driver.switchTo().window(list.get(0)).getTitle();
		System.out.println("printing child tab title :" + childTabTitle);

		// moving back to parent tab
		String backToParentTabTitle = driver.switchTo().defaultContent().getTitle();
		System.out.println("printing parent tab title moving back to parent tab :" + backToParentTabTitle);

		driver.quit();

	}

}
