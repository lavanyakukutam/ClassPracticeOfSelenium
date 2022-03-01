package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("testng");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']/div/span"));
		Thread.sleep(5000);
		System.out.println("number of options are : " + options.size());
		for (WebElement each : options) {
			System.out.println(each.getText());
		}
		
		

	}

}
