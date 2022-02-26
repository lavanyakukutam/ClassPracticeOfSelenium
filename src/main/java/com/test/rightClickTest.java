package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(driver);

		//rightclick
		WebElement elemenet1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(elemenet1).perform();  
		Thread.sleep(2000);
       
		//click Edit
		WebElement element2= driver.findElement(By.xpath("//span[text()='Edit']"));
		element2.click();
		driver.switchTo().alert().accept();//alert
		Thread.sleep(2000);
		
		//double click
		WebElement element3 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));//double click
		action.doubleClick(element3).perform();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();   //alert



	}

}
