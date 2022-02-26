package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("txtUsername"));
		//username.sendKeys("Admin");
		//WebElement pwd= driver.findElement(By.id("txtPassword"));
		//pwd.sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.moveToElement(username).sendKeys("Admin").perform();
		
//		
//		.keyDown(Keys.CONTROL)
//	    .sendKeys("a")
//	    .keyUp(Keys.CONTROL)
//	    .sendKeys(Keys.BACK_SPACE)
//	    .build()
//	    .perform();

		
		
		
		
		
		
//		//action.moveToElement(leave).moveToElement(entitlement).moveToElement(addentitlement).click().build().perform();
//		
//		WebElement time = driver.findElement(By.xpath("//b[text()='Time']"));
//		action.contextClick(time).perform();
//		Thread.sleep(4000);
//		
//		WebElement emp = driver.findElement(By.xpath("//input[@type='text']"));
//		emp.sendKeys("Hari" ,Keys.ENTER);
//		
//		
//		WebElement savebtn = driver.findElement(By.xpath("//input[@id='btnSave']"));
//		action.moveToElement(savebtn).click().perform();
//		Thread.sleep(4000);
		
		//driver.quit();
	}
	

}

