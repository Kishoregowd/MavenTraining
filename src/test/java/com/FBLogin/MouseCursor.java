package com.FBLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCursor {
	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://lkmdemoaut.accenture.com/AccenSportz/#/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.id("playerregistrationlink"));
		
		Actions a = new Actions(driver);
		a.moveToElement(register).perform();
	}

}
