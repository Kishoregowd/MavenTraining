package com.FBLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizeMouse {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Resizable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("resizable"));
//		WebElement ab = driver.findElement(By.cssSelector(".ui-resizable-se"));
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-resizable-se")));
		a.clickAndHold(ab);
		a.moveByOffset(50, 50).release().perform();
		
		System.out.println("Resize is completed Successfully");
		driver.quit();

		
	}

}
