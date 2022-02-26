package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//	driver.get("https://opensource-demo.orangehrmlive.com/");
		//		
		//	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		//	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		//	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
				


		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[@class='visLg']")).click();//signin
		
//		driver.findElement(By.xpath("//input[@id='loginId']")).sendKeys("abcdef@gmail.com");//username
//		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("67891011");//pwd
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-brand btn-block']")).click();//loginbutton
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//a[@title='Forgot Password?']")).click();//forgot password
//		driver.findElement(By.xpath("//input[contains(@name,'Email/Phone')]")).sendKeys("ghijkl@gmail.com");//emailid
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-brand btn-block')]")).click();//send pwd
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.xpath("(//h6[@class='title'])[4]")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='col px-0']/small")).getText());
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//p[@class='mb-0 mt-4']")).getText());
		//System.out.println(driver.findElement(By.xpath("//p[@class='mb-0 mt-4']/child::a")).getText());
		
		System.out.println(driver.findElement(By.xpath("//li[@class='margin-r-20']/a")).getText());
		
	}

}