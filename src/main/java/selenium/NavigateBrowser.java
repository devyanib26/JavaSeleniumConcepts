package selenium;

import org.openqa.selenium.WebDriver;

import utilities.Base;

// This class has driver GET commands
public class NavigateBrowser extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = launchBrowser("http://demo.guru99.com/test/newtours/", "chrome");
		System.out.println("Title is "+driver.getCurrentUrl());
		
		// Navigation commands
		driver.navigate().to("https://www.simplilearn.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.close():  Closes the Current browser window.
		driver.close();
		
		//driver.quit():  Quit the entire browser session.
		 
	}

}
