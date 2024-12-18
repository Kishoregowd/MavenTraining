package com.FBLogin;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileInput {
	
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	
	String filepath = "C:\\Users\\kishore.muninanjappa\\OneDrive - Accenture\\Desktop\\Test Folders";
	FileInputStream file = new FileInputStream(filepath);
	Workbook wb = new XSSFWorkbook(file);
	Sheet s1 = wb.getSheetAt(0);
	
	String username = s1.getRow(0).getCell(0).getStringCellValue();
	String password = s1.getRow(0).getCell(1).getStringCellValue();
	
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	
	}
	}
