package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Windowshandlingtest {
	 public static String parent,facebook,linkedin;
		public static Set<String> handles;
		//Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	      parent= driver.getWindowHandle();
	      System.out.println(parent);
	      System.out.println(driver.getTitle());
	      System.out.println("   ");
		
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("amin123");
	
	driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	handles = driver.getWindowHandles();
	Thread.sleep(2000);
	for (String each: handles) {
		if(!each.equals(parent))
		{ 
			driver.switchTo().window(each);
		}
	}
			System.out.println(driver.getTitle());
			Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12456");
		
		Thread.sleep(2000);	
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("amin123");
		Thread.sleep(2000);	
	}
	
	
}
	
		




