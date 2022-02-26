package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandlingpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		WebElement table= driver.findElement(By.xpath("//table[@id='webtable']]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
           }
            
              }
		
	
	
		
	
	


