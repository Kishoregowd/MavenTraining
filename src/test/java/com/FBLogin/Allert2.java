package com.FBLogin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allert2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[text()=\"Alert with OK \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]")).click();
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		
	}

}
