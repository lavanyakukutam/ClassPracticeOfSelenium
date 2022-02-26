package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		
		Select select = new Select(element);
		List <WebElement> opt = select.getOptions();
		System.out.println("The Number of options are: " + opt.size());
		
        select.selectByVisibleText("Pizza");
        select.selectByVisibleText("Donut");
        select.selectByVisibleText("Bonda");
        select.deselectByVisibleText("Pizza");
        //select.deselectAll();
      // System.out.println( (select.getAllSelectedOptions().get(1)).getText());
        driver.close();
       
	}

}
