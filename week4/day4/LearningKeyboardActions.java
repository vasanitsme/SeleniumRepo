package week4.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningKeyboardActions {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// max window
		driver.manage().window().maximize();
			
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Navigate to url
		driver.get("https://www.leafground.com/window.xhtml");
		
		//get current window address
		String myCurrentWindowHandle = driver.getWindowHandle();
		System.out.println("My current window address is: " + myCurrentWindowHandle);
		
		//get current tile 
		String myCurrentPagetitle = driver.getTitle();
		System.out.println("My current window title is: " + myCurrentPagetitle);

	}

}
