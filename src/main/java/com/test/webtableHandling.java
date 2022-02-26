package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bloomberg.com/markets/stocks");
		WebElement table = driver.findElement(By.xpath("(//table[@class='data-table'])[1]"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println("rows: " + rows.size());
		
//		List<WebElement> heads = table.findElements(By.tagName("th"));
//		System.out.println("heads size: " + heads.size());
//		
		Thread.sleep(2000);
        for(int i=1; i<rows.size(); i++)   
        {
        	List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
        	//System.out.println("i am in main loop");
        	
        	for(int j=1; j<cells.size(); j++)
       	{
    System.out.println(driver.findElement(By.xpath("(//table[@class='data-table'])[1]/tbody/tr[" + i + "]/td[" + j + "]")).getText());
        		//System.out.println("i am in inner loop");
       	}
        }
	}

}  
