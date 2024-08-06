package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Base;

public class MouseActions extends Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = launchBrowser("https://www.amazon.in/", "chrome");

		MouseActions ma = new MouseActions();
		ma.selectMenu( driver);
		
		closeBrowser(driver);
	}

	
	public void selectMenu(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//div[@id='hmenu-content']/a"));
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//span[@class='hm-icon-label']")))
				.click()
				.build()
				.perform();
		
		builder.moveToElement(element)
				.click()
				.build()
				.perform();
		
		Thread.sleep(3000);
		System.out.println("Actions: contextClick() method will click wherever the mouse is.");
		builder.contextClick();
		
		System.out.println("Actions: contextClick(WebElement) method will click at the middle of the element.");
		
		builder.moveToElement(driver.findElement(By.linkText("Beauty")))
		.contextClick(driver.findElement(By.linkText("Beauty")))
		.build()
		.perform();
		
		System.out.println("Clicked on Beauty");
	}

}
