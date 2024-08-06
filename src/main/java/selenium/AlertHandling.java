package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Base;

public class AlertHandling extends Base{

	//Scenario: 
	//1. Launch the web browser and open the web page �https://demoqa.com/alerts�. 
	//2. click on the confirmation alert button
	//3. Accept the alert. 
	//4. Click on the confirmation alert button again. 
	//5. Reject the alert
	
	static WebDriver driver = launchBrowser("https://demoqa.com/alerts", "chrome");
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertHandling alert = new AlertHandling();
		alert.alertOk();		
		alert.alertCancel();
		alert.alertPrompt();
		driver.quit();
	}
	
	public void alertOk() throws InterruptedException {
		System.out.println("OK");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		try{
			driver.switchTo().alert().accept();	
			System.out.println("Alert Accepted");
		}
		catch (Exception e) {
			System.out.println("No Alert Present Exception/Element Click Intercepted Exception");
		}
		finally {
			driver.switchTo().parentFrame();
		}
	}
	
	public void alertCancel() throws InterruptedException {
		System.out.println("CANCEL");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert Dismissed");
		}
		catch (Exception e) {
			System.out.println("No Alert Present Exception");
		}
		finally {
			driver.switchTo().parentFrame();
		}
	}

	public void alertPrompt() throws InterruptedException {
		System.out.println("PROMPT");
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(4000);	
		try{
			driver.switchTo().alert().sendKeys("Devyani");;
			System.out.println("Alert Dismissed");
		}
		catch(Exception e){
			System.out.println("No Alert Present Exception");			
		}
		finally {
			driver.switchTo().parentFrame();
		}
	}
	
}
