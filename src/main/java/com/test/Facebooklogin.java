package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		Facebooklogin page1 =new Facebooklogin ();
		//page1.login();
		page1.details();
		}
	public void login() throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");//
		System.out.println("Title is: " + driver.getTitle());
		System.out.println("Current URL is: " + driver.getCurrentUrl());
			
		driver.findElement(By.name("email")).sendKeys("2456789024");//email/phone num
		driver.findElement(By.id("pass")).sendKeys("Helloooo");   // password
		//driver.findElement(By.name("login")).click(); //loginbutton
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot password?")).click();//forgot password
		
		Thread.sleep(3000);
		driver.close();
	}
	public void details() throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.name("login"));//displaying login button name
		String button1= login.getText();
		System.out.println( "Button Name is :" + button1);
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.partialLinkText("Forgot"));//displaying the link text
		String str= element.getText();
		System.out.println("Link text is: " +str);
		
		Thread.sleep(1000);
		System.out.println("Down Label is: " +driver.findElement(By.id("reg_pages_msg")).getText());// displaying down label
		driver.close();
	}
		
	
	
}
