package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class WindowHandle extends Base {

	public static void main(String args[]) {
		
		WebDriver driver = launchBrowser("https://demoqa.com/browser-windows", "chrome");
		driver.findElement(By.id("windowButton")).click();
				
		// Get handle of the windows
		String mainWindowHandle = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		Iterator<String> itr = allWindowHandles.iterator();
		
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Element found using text: "+ text.getText());
				driver.close();
				System.out.println("Child window is closed");
			}
		}
		
		driver.switchTo().window(mainWindowHandle);
		driver.quit();
	}
}
