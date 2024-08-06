package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollBy {
	static WebDriver driver; 
	JavascriptExecutor js; 

	public ScrollBy(WebDriver wd){
		driver = wd;
		js = (JavascriptExecutor) driver;
	}

	public void getDimensions() {
		Dimension dim = new Dimension(700, 700);
		driver.manage().window().setSize(dim);
		System.out.println(driver.manage().window().getSize());
	}
	
	public void scrollDown(int x) {
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Scrolled Down");
	}
	
	public void scrollUp(int x) throws InterruptedException {
		js.executeScript("window.scrollBy(0, -1000)");
		System.out.println("Scrolled Up");
	}
	
	public void scrollLeft(int x) {
		js.executeScript("window.scrollBy(-200, 0)");	
		System.out.println("Scrolled Left");
	}
	
	public void scrollRight(int x) {
		js.executeScript("window.scrollBy(200, 0)");	
		System.out.println("Scrolled Right");
	}
	
}
