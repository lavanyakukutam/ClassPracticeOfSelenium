/*   User Story:
website: https://chercher.tech/practice/practice-dropdowns-selenium-webdriver
 DropDown Automation 
 First Method printing Prodcuts Dropdown list and selecting an option
 Second Method printing Animals Dropdown list and selecting an option    */

package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		DropDownPractice2 d=new DropDownPractice2();
		d.First();
		//d.Second();
	}
		public void First() throws InterruptedException
		{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println("First Dropdown is");
		System.out.println(driver.findElement(By.xpath("(//select[@class='col-lg-3']/preceding::b)[2]")).getText());
		WebElement Productoptions = driver.findElement(By.className("col-lg-3"));
		Select select =new Select(Productoptions);
		select.selectByValue("Yahoo");
		System.out.println("First Selected Option in Products is:  " + select.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		System.out.println("Products Dropdown List is ");
		List<WebElement> options = select.getOptions();
		for (WebElement each : options) {
			
			System.out.println(each.getText());
		}
		driver.close();
		}
		public void Second() throws InterruptedException
		{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println("Second Dropdown is");
		System.out.println(driver.findElement(By.xpath("(//select[@class='col-lg-3']/preceding::b)[3]")).getText());
		WebElement animalOptions = driver.findElement(By.id("animals"));
		Select select = new Select(animalOptions);
		List<WebElement> options= select.getOptions();
		System.out.println("Dropdown List in Animals is ");
		
		Thread.sleep(2000);
		//Iterator it= ((animalOptions) select).iterator;
			
				
		for (WebElement each : options) {
			System.out.println(each.getText());
		}
		select.selectByValue("avatar");
		System.out.println("First Selected option is: "+ select.getFirstSelectedOption().getText());
		Thread.sleep(2000);
        driver.close();
		}
		}
		
		

	
