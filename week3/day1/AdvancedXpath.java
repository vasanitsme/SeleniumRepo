package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AdvancedXpath {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		String url = "https://www.leafground.com/radio.xhtml";
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get(url);
		
		//Parent - Child
		WebElement ParChild =  driver.findElement(By.xpath("//div[@class='user-profile']/a/span[@class='sidebar-profile-name']"));
		System.out.println(ParChild.getText());
		
		//Child - Parent
		WebElement childPar = driver.findElement(By.xpath("//span[@class='sidebar-profile-name']/parent::a"));
		childPar.click();
		
		//Grandparent → grandchild
		WebElement browserHeading = driver.findElement(By.xpath("//div[contains(@class,'layout-main')]//h5[normalize-space(.)='Your most favorite browser']"));
		System.out.println(browserHeading.getText());
		
		
		driver.quit();
		
		
	}

	}
