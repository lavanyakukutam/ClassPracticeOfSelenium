package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeURL {
	public static ChromeDriver driver;
	public static String url;
	WebElement uname,pwd;

	public static void main(String[] args) {

	}
	public  void myURL()
	{
	    url= "https://opensource-demo.orangehrmlive.com/";
	}
	
//	public void myUname()
//	{
//		uname=driver.findElement(By.id("txtUsername"));
//		uname.sendKeys("Admin");
//	}
}
