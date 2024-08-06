package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Base;


public class Frames extends Base{

	static WebDriver driver = launchBrowser("https://www.globalsqa.com/demo-site/frames-and-windows/", "chrome");
	
	static String mainWindow = driver.getWindowHandle();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames f = new Frames();
		f.openNewTab(mainWindow);
		//f.openNewTab(mainWindow);
		f.openIFrame(mainWindow);
		
	}
	
	public void openNewTab(String mainWindow) {
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/a")).click();
		System.out.println("Open New Tab");
	}

	public void openNewWindow(String mainWindow) {
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("Open New Window")).click();
		driver.findElement(By.linkText("Click Here")).click();
	}
	
	public void openIFrame(String mainWindow) {
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		System.out.println("Frames - 2");
	}
	
}
