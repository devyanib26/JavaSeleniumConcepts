package selenium;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.Base;


public class TestNGParam extends Base {
	static WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.out.println("1. Before Suite");	
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("2. Before Test");	
		driver = launchBrowser("http://www.google.com", "chrome");
	}
	
	@BeforeClass
	public void loginApp() {
		System.out.println("3. Before Class ");	
	}
	
	@BeforeMethod
	public void checkPrecondition() throws Exception {
		System.out.println("4. Before Method ");
	}

	@Test (priority = 1)
	public void testUntitled() throws Exception {
		System.out.println("5. Test method ");
	}
	
	@Test (priority = 2)
	public void testListTitles() throws Exception {
		System.out.println("======== This is Test method : List Titles ==============");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='yuRUbf']//h3"));
		System.out.println(" List Size" + list.size());
		for (WebElement we: list) {
			System.out.println(" ---- "+we.getText());
		}
		System.out.println(" ImplicityWait() after Result Finding: "+ new Date());
	}

	@AfterMethod
	public void runsAfterTest() {
		System.out.println("6. After Method");	
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("7. After Class");
	}
	
	@AfterTest
	public void tearDownTest() throws Exception {
		System.out.println("8. After Test");
		driver.manage().deleteAllCookies();
	}
	
	@AfterSuite
	public void finalTearDown() throws Exception {
		System.out.println("9. After Suite");
		driver.quit();
	}
	
}
