package com.FBLogin;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCombination {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()=\"Alert with OK \"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Simple Alert : " + al.getText());
		al.accept();

		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"click the button to display a confirm box \")]"))
				.click();

		al = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert to Cancel : " + al.getText());
		al.dismiss();
		WebElement demo = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		System.out.println("After actions : " + demo.getText());

		driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"click the button to demonstrate the prompt box \")]"))
				.click();

		al = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Before actions : " + al.getText());
		al.sendKeys("kishore");
		al.accept();
		WebElement demo1 = driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
		System.out.println("After actions : " + demo1.getText());

		driver.close();

	}

}
