package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framepractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.switchTo().frame("singleframe");//frame("id");
		WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("hello");
		Thread.sleep(2000);
		driver.close();


	}

}
