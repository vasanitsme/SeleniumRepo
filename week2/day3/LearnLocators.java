package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnLocators {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.facebook.com/";
		driver.get(Url);
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String actTitle = driver.getTitle();

		System.out.println("Title of my current browser is : " + actTitle);
		Thread.sleep(3000);
		String expTitle = "Forgotten Password | Can't Log In | Facebook";
		if (actTitle.equals(expTitle)) {
			System.out.println("Browser launched sucessfully with the URL:" + Url);
			driver.close();
		}
		else {
			System.out.println("Login failed - might credential issue");
			driver.close();
		}
		

	}

}
