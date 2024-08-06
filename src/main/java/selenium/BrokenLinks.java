package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class BrokenLinks extends Base{
	
//	200 – Valid Link
//	404 – Link not found
//	400 – Bad request
//	401 – Unauthorized
//	500 – Internal Error
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = launchBrowser("https://www.google.co.in/","chrome");
		BrokenLinks bl = new BrokenLinks();
		bl.findBrokenLinks(driver);
	}

	public void findBrokenLinks(WebDriver driver) throws IOException {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The total number of links are "+ links.size());
		try {
			int i=1;
			for (WebElement link:links) {
				String href = link.getAttribute("href");
				URL url = new URL(href);
				HttpURLConnection httpURLCon = (HttpURLConnection) url.openConnection();
				httpURLCon.setConnectTimeout(3000);
				httpURLCon.connect();
				//System.out.println(i +". "+ httpURLCon.getResponseCode() + " ____ "+ httpURLCon.getResponseMessage());	
				
				if(httpURLCon.getResponseCode() >= 400) {
					System.out.println(i +". "+ href + "	" +httpURLCon.getResponseCode() + " ____ "+ httpURLCon.getResponseMessage());	
				}
				i++;
			}
		}
		catch (Exception e){
			System.out.println("Exception message is " + e.getMessage());
		}
	}
}
