package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableHandlingPractice2 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://chercher.tech/practice/table");
WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
List<WebElement> rows  =table.findElements(By.tagName("tr"));
System.out.println("No.of rows are :" + rows.size());
//List<WebElement> cells  =table.findElements(By.tagName("td"));
//System.out.println("No. of cells are :" + cells.size());
     for(int i=1; i<rows.size(); i++)
     {List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
     
    	 for(int j=0;j<cells.size(); j++)
    	 {
    	      String name ="";
    	      name=cells.get(j).getText();
    	      if(name.equalsIgnoreCase("facebook"))
    	      {
    	    	  System.out.println(cells.get(0).getText());
    	    	  System.out.println(cells.get(2).getText());
    	      }
    	 }
     }

	}

}
