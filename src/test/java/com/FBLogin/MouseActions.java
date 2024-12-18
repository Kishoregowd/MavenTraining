package com.FBLogin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		WebElement a = driver.findElement(By.xpath("//*[text()=\"right click me\"]"));
		WebElement b = driver.findElement(By.xpath("//*[text()=\"Double-Click Me To See Alert\"]"));
		Actions s = new Actions(driver);
//		s.contextClick(a).perform();
		s.doubleClick(b).perform();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
	}

}
