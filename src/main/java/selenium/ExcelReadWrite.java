package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite{

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome");
		readExcelFile("D:\\InputFiles\\ExcelFile.xlsx","Sheet0");
		writeExcelFile("D:\\OutputFiles\\ExcelFileOutput.xlsx","Sheet1");
	}


	public static void readExcelFile(String fileName, String sheetName) throws IOException {
		
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		System.out.println("FIS : " + file);
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
	
		int maxRow = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		
		for (int i=0;i< maxRow;i++) {
			row = sheet.getRow(i);
			int maxCell = row.getLastCellNum();
			for(int j=0; j< maxCell; j++){
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue() + " 		");
			}
			System.out.println();
		}
		fis.close();
		wb.close();
	}

	public static void writeExcelFile (String fileName, String sheetName) throws IOException {
		
		
		Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
		studentData.put("1", new Object[] {"RollNo", "Name", "Year"});
		studentData.put("2", new Object[] {"101", "Dhruv", "2022"});
		studentData.put("3", new Object[] {"102", "Arika", "2012"});
		studentData.put("4", new Object[] {"103", "Aarna", "2018"});
		studentData.put("5", new Object[] {"104", "Neal", "2022"});
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName);
		XSSFRow row;

		Set<String> keyId = studentData.keySet();
		int rowId = 0;
		for (String key: keyId) {
			row = sheet.createRow(rowId++);
			
			Object[] objArray = studentData.get(key);
			int cellId = 0;
			for (Object obj: objArray ) {
				XSSFCell cell = row.createCell(cellId++);
				cell.setCellValue((String) obj);
			}
		}
		FileOutputStream out = new FileOutputStream(new File(fileName));
		System.out.println("Output file name : " + fileName);
		wb.write(out);
		out.close();
		wb.close();
	}
}
