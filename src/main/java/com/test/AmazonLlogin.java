package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//OrangeHRM

public class AmazonLlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");//username
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");//pwd
		driver.findElement(By.id("btnLogin")).click();//login button
		
		driver.findElement(By.xpath("//a[@class='firstLevelMenu']")).click();//admin button
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("admin");//user name input
		 driver.findElement(By.xpath("//input[@id='searchBtn']")).click();//search button
		 driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Paul Collings");
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@href='#'])[20]")).click(); //toggle shrink
		driver.findElement(By.xpath("//td[@class='left']/a")).click();//click on admin for details
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.id("resetBtn")).click();//reset button
		driver.close();
		

	}

}
