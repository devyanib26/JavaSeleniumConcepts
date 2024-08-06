package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Base;

public class ExceptionsList extends Base{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = launchBrowser("https://www.dorrii.com/", "chrome");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(By.tagName("iFrame")));
		driver.manage().window().fullscreen();
		driver.switchTo().alert();
		
		// TimeoutException: Timed out waiting for page to load.
		try{

		}
		catch(Exception e) {
			
		}
		// ElementNotFoundException
		
		//NoSuchElementException
		
		//NoClassFoundException
		
		//WebDriverException
		
		//NullPointerException - Exception in thread "main" java.lang.NullPointerException:
		
		//UnsupportedOperationException - Exception in thread "main" java.lang.UnsupportedOperationException
		
	}

}
