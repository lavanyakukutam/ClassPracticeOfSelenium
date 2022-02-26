package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Alert a ;
		

		//alert 
		WebElement button1 = driver.findElement(By.id("alertButton"));
		button1.click();
		 a = driver.switchTo().alert();
		 a.accept();
		Thread.sleep(2000);

		//confirmationbox
		WebElement button2 = driver.findElement(By.id("confirmButton"));
		Thread.sleep(2000);
		button2.click();
		a.dismiss();
		Thread.sleep(2000);

		//prompt
		WebElement button3=driver.findElement(By.id("promtButton"));
		button3.click();
		Thread.sleep(2000);
		a.sendKeys("hello");
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);

		driver.close();


	}

}
