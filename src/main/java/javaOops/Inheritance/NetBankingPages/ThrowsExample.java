package javaOops.Inheritance.NetBankingPages;

import java.io.*;

public class ThrowsExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		openFile("abc.txt");
	}
	
	public static void openFile(String path) throws FileNotFoundException {
//		File fh = new File(path);
//		FileInputStream io = new FileInputStream(fh);
	}

	public void myException(String browserName) throws Exception {
		if (browserName.equals("IE"))
			System.out.println("Internet Explorer.");
		else if (browserName.equals("Chrome"))
			System.out.println("Chrome.");
		else 
			throw new Exception ("InvalidBrowserName");
	}
}
