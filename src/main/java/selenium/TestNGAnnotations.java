package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//None of these Annotation related methods support return type, it is always void methods underneath.  
	
	// test case 1
	   @Test(priority = 2)
	   public void testCase1() {
	      System.out.println("---- test case 1 ----");
	   }
	   // test case 2
	   @Test (groups = {"smoke"})
	   public void testCase2() {
	      System.out.println("---- test case 2 ----");
	   }
	   // By default priority = 0
	   @Test (priority = 1, groups={"uat","smoke"})
	   public void testCase3() {
	      System.out.println("---- test case 3 ----");
	   }
	   
	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("= BeforeMethod =");
	   }
	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("= AfterMethod =");
	   }
	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("== BeforeClass ==");
	   }
	   @AfterClass
	   public void afterClass() {
	      System.out.println("== AfterClass ==");
	   }
	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("=== BeforeTest === ");
	   }
	   @AfterTest
	   public void afterTest() {
	      System.out.println("=== AfterTest === ");
	   }
	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("==== BeforeSuite ==== ");
	   }
	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("==== AfterSuite ====");
	   }
}
