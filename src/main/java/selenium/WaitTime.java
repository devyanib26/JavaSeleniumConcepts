package selenium;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Base;

public class WaitTime extends Base{

	WebDriver driver = launchBrowser("https://www.gmail.com", "chrome");
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WaitTime wt = new WaitTime();
		wt.checkImplicitWait();
		wt.checkExplicitWait();

	}

	public void checkImplicitWait() {
		// Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception. Once this time is set, WebDriver will wait for the element before the exception occurs.
		// Once the command is in place, Implicit Wait stays in place for the entire duration for which the browser is open. It�s default setting is 0, and the specific wait time needs to be set by the following protocol.
		// However, implicit wait increases test script execution time. It makes each command wait for the defined time before resuming test execution. If the application responds normally, the implicit wait can slow down the execution of test scripts. 
		
		System.out.println("Before ImplicityWait(): "+ new Date());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("After ImplicityWait() for 3 seconds: "+ new Date());
	}
	
	public void checkExplicitWait() {
		// saving the GUI element reference into a "element" variable of WebElement type
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("dummy@gmail.com");
		element.sendKeys(Keys.RETURN);
		// entering password
		driver.findElement(By.id("Passwd")).sendKeys("password");
		// clicking signin button
		driver.findElement(By.id("signIn")).click();
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='']")));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	
	}
	
}
