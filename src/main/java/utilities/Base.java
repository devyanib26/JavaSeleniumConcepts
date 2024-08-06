package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	static WebDriver driver;
	public static WebDriver launchBrowser(String url, String browserType) {
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devyani.Bhardwaj\\eclipse-workspace\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Devyani.Bhardwaj\\eclipse-workspace\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserType.contentEquals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Devyani.Bhardwaj\\eclipse-workspace\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Please enter a valid Browser Type like Chrome, Firefox or IE.");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}

	public static void closeBrowser(WebDriver driver) {
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
}
