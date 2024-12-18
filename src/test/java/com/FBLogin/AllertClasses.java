package com.FBLogin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllertClasses {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.findElement(By.xpath("//*[text()=\"Alert with OK \"]"));
//		driver.findElement(By.xpath("//*[@id=\"OKTab\"]")).click();
		
//		driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Alert with OK & Cancel \"]"))).click();
//		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()=\"Alert with Textbox \"]")).click();
		driver.findElement(By.xpath("//*[text()=\"click the button to demonstrate the prompt box \"]")).click();
		Alert a = driver.switchTo().alert();
//		a.accept();
//		a.getText();
		String text = a.getText();
		System.out.println(text);
//		a.dismiss();
		a.sendKeys("Kishore");
		a.accept();
		
		driver.close();

	}

}
