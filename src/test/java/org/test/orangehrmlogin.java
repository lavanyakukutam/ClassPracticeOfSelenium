package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.test.Myloginpage;

public class orangehrmlogin {
	
	public static ChromeDriver driver;
	@BeforeSuite
    public void login()
    {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	System.out.println("This is OrangeHRM site");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
