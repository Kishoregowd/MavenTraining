package com.FBLogin;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropRepeated {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		Map<String, String> dragNdrop = new HashMap<String, String>();
//		dragNdrop.put("box1", "box101");
//		dragNdrop.put("box2", "box102");
//		dragNdrop.put("box3", "box103");
//		dragNdrop.put("box4", "box104");
//		dragNdrop.put("box5", "box105");
//		dragNdrop.put("box6", "box106");
//		dragNdrop.put("box7", "box107");
//
		Actions res = new Actions(driver);
//		
//		for (Entry<String, String> entry : dragNdrop.entrySet()) {
			WebElement capitals = driver.findElement(By.id("box1"));
			WebElement countries = driver.findElement(By.id("box101"));
			res.dragAndDrop(capitals, countries).perform();
			
			WebElement capitals1 = driver.findElement(By.id("box2"));
			WebElement countries1 = driver.findElement(By.id("box102"));
			res.dragAndDrop(capitals1, countries1).perform();
			
//			System.out.println("draged from" + entry.getKey() + "draged to : " + entry.getKey() );
			
//		}
		System.out.println("All capitals are draged");
	}

}
