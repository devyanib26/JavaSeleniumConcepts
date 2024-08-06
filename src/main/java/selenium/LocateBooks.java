package selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Base;

public class LocateBooks extends Base{
	WebDriver driver = launchBrowser("https://www.amazon.in/", "chrome");
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		LocateBooks obj = new LocateBooks();
		obj.locators();
	}
	
	
	public void locators() throws InterruptedException {
		/*driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Service")).click();
		Thread.sleep(3000);
		*/
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("devyanib26@gmail.com");
		Thread.sleep(2000);
		
		// CSS Selector: ID => "<tag name>#<attribute value>"
		driver.findElement(By.cssSelector("input#continue")).click();

		Thread.sleep(2000);
		// CSS Selector: Attribute => "<tag name> [<attribute name>='<value>']"
		driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("temp");;
		Thread.sleep(2000);
		// CSS Selector: Class => "<tag name>.<attribute value>"
		driver.findElement(By.cssSelector("input.a-button-input")).click();
		
	}
	
	public HashMap<Integer, ArrayList<String>> searchBook(String bookName) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(bookName);
		driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();

		List<WebElement> bookList = driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']"));
		System.out.println("The result shows: "+ bookList.size());
		
		HashMap<Integer, ArrayList<String>> data = new HashMap<Integer, ArrayList<String>>();
		int i=0;
		for (WebElement result: bookList) {
			ArrayList<String> bookDetails = new ArrayList<String>();
			
			String bookNm = result.findElement(By.xpath(".//*[@class = 'a-size-medium a-color-base a-text-normal']")).getText();
			String ratings = "No ratings available";
			String author = "No author";
			try {
				ratings = result.findElement(By.xpath(".//div[@class='a-row a-size-small']/span")).getAttribute("aria-label");
				author = result.findElement(By.xpath(".//div[@class = 'a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/div/div/a")).getText();
			}
			catch(Exception e){
			}
			
			bookDetails.add(bookNm);
			bookDetails.add(ratings);
			bookDetails.add(author);
			
			data.put(i, bookDetails);
			i++;
			
			System.out.println(bookNm + "	"+ ratings+"	"+author);		
		}
		return data;
		
	}
	
	public void writeToExcel(HashMap<Integer, ArrayList<String>> map) throws IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("AmazonBooks");
		
		for(Integer key: map.keySet()) {
			HSSFRow row = sheet.createRow(key);
			ArrayList<String> values = map.get(key);
			for (int i=0;i<values.size();i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellValue(values.get(i));
			}
		}
		
		FileOutputStream op = new FileOutputStream("D:\\Workspace\\Concepts\\Output\\AmazonBookList.xls");
		wb.write(op);
		op.close();
		wb.close();
	}
	
	
}
