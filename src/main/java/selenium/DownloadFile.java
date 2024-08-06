package selenium;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.Base;

public class DownloadFile extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 

		File file = new File(UUID.randomUUID().toString());
		file.mkdir();
		
		ChromeOptions co = 	new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups",0);
		prefs.put("download_default_directory", file.getAbsolutePath());
		
		co.setExperimentalOption("prefs", prefs);
		
		driver= new ChromeDriver(co);
		launchBrowser("https://www.facebook.com/login.php", "chrome");
		System.out.println(driver.getCurrentUrl());
	}

}
