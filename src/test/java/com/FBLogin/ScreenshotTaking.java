package com.FBLogin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;

public class ScreenshotTaking {
	
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	TakesScreenshot s = (TakesScreenshot)driver;
//	
//	File sf = s.getScreenshotAs(OutputType.FILE);
//	File sl = new File(".\\Picture\\home.png");
//	FileUtils.copyFile(sf, sl);
	
	WebElement e = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
	File sf = e.getScreenshotAs(OutputType.FILE);
	File sl = new File(".\\Picture\\home.png");
	FileUtils.copyFile(sf, sl);
	
	

	
	}
	}
