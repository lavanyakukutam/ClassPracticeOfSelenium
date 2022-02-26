package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapdropdownpractice {

	public static void main(String[] args) throws Exception {

//System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
//ChromeDriver driver = new ChromeDriver();
//driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[@id='menu1']")).click();
//Thread.sleep(2000);
////WebElement boot= driver.findElement(By.xpath("//button[@id='custom']/preceding::ul"));
//List<WebElement> dropdown=  driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
//for (WebElement each : dropdown) {
//	
//	if(each.getText().equals("JavaScript"))
//	{
//	each.click();
//	}
//	dropdown.size();
//	}
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.findElement(By.xpath("//button[@id='custom']")).click();
		List<WebElement> listoptions = driver.findElements(By.xpath("//button[@id='custom']/following::ul"));
		
		for (WebElement each : listoptions) {
			if(each.getText().equals("submenu"))
			{
				each.click();
				
			}
			System.out.println(listoptions.size());
			}
		}
			
		}
	
		



	


