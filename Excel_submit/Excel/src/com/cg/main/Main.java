package com.cg.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\ragutha\\Documents\\workspace-sts-3.9.2.RELEASE\\Excel_submit-master\\Excel_apoorva\\src\\com\\cg\\main\\signup.html");
		Thread.sleep(1000);


		XSSFWorkbook srcBook = new XSSFWorkbook("D:\\excel.xlsx");
		XSSFSheet sourceSheet = srcBook.getSheetAt(0);
		int rowMaxRowNum = sourceSheet.getLastRowNum();
		for(int row = 0;row <= rowMaxRowNum;row++){
		XSSFRow sourceRow = sourceSheet.getRow(row);
		XSSFCell fname = sourceRow.getCell(0);
		XSSFCell lname = sourceRow.getCell(1);
		XSSFCell sname = sourceRow.getCell(2);

		driver.findElement(By.id("fname")).sendKeys(fname.toString());
		Thread.sleep(1000);
		driver.findElement(By.id("lname")).sendKeys(lname.toString());
		Thread.sleep(1000);
		driver.findElement(By.id("sname")).sendKeys(sname.toString());
		Thread.sleep(1000);
		WebElement submitButton2 = driver.findElement(By.id("submit"));
		submitButton2.click();
		}
	}

}
