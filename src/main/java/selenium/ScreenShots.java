package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utilities.Base;

public class ScreenShots extends Base{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = launchBrowser("https://www.facebook.com/login.php", "chrome");

		// TODO Auto-generated method stub
		ScreenShots ss = new ScreenShots();
		ss.login(driver);
		//Step 1) Convert web driver object to TakeScreenshot
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		
		//Step 2) Call getScreenshotAs method to create image file
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		
		//Step 3) Copy file to Desired Location: Move image file to new destination
        File DestFile = new File("D:\\Workspace\\Concepts\\Output\\output.jpeg");
       
        //Selenium 4: FileHandler
        FileHandler.copy(srcFile, DestFile);
        
        // Selenium 3: FileUtils.copyFile(srcFile, DestFile);

		closeBrowser(driver);
	}
		
	public void login(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("divarays@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("PAsscode");
		Thread.sleep(2000);
	}

}
