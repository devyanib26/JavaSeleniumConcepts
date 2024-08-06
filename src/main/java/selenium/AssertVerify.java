package selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {
	WebDriver driver;
		
	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("== BeforeClass ==");

			System.setProperty("webdriver.chrome.driver", "D:\\Softwares and JAR files\\Chrome Driver 110.0\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();	
			
	   }

	   @BeforeMethod
	   public void beforeMethod() {
		      System.out.println("= BeforeMethod =");
	   }

	   @Test 
	   public void hardAssertMethods() {
	      System.out.println("---- test case 1 ----");
	      String expectedTitle = "Google";
	      String actualTitle = driver.getTitle();
	      String str = null;
	      Boolean x = driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/");
	      
	      assertEquals(expectedTitle, actualTitle);
	     // assertNotEquals("Test", actualTitle);
	      assertTrue(x);
	      //assertFalse(x);
	      assertNull(str);
	      //assertNotNull(str);
	   }

	   @Test 
	   public void softAssertMethods() {
	      System.out.println("---- test case 1 ----");
	      String expectedTitle = "Google";
	      String actualTitle = driver.getTitle();
	      String str = null;
	      Boolean x = driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/");
	      
	      System.out.println(driver.getCurrentUrl());
	      SoftAssert sa = new SoftAssert();
	      sa.assertEquals(expectedTitle, actualTitle);
	     //sa.assertNotEquals("Test", actualTitle);
	      sa.assertTrue(x);
	      //sa.assertFalse(x);
	     sa.assertNull(str);
	     // sa.assertNotNull(str);
	      sa.assertAll();
	   }
	   
	   
	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("= AfterMethod =");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("== AfterClass ==");
	      driver.quit();
	   }


}
