package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceofSelenium2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		Actions action= new Actions(driver);
		             //accordian
		driver.findElement(By.xpath("//a[text()='Accordion']")).click();
		driver.switchTo().frame(0);
		WebElement accordion1= driver.findElement(By.xpath("(//div[@id='accordion']/h3)[2]"));
		accordion1.click();
		Thread.sleep(2000);
		WebElement accordion2= driver.findElement(By.xpath("(//div[@id='accordion']/h3)[4]"));
		accordion2.click();
		System.out.println("youselected through accordian");
		
               //autocomplete text
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("b");
		Thread.sleep(4000);
		WebElement optiontab = driver.findElement(By.xpath("//ul[@id='ui-id-1']"));
		List<WebElement> options= optiontab.findElements(By.tagName("li"));
		System.out.println("number of option in text field are: " + options.size());
		
		for (WebElement each : options) {
			if(each.getText().equals("BASIC"))
			{
				each.click();
				break;
			}
		} System.out.println("you selected by  autocomplete ");
		
		                 //tabs
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Tabs']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@id='ui-id-1']")).click();
		driver.findElement(By.xpath("//a[@id='ui-id-3']")).click();
		Thread.sleep(2000);
		System.out.println("You achieved multi tabs");
		
		          //datepicker
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Prev']")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[5]")).click();
		System.out.println("you achieved date picker");
		
		//menu
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Menu']")).click();
		driver.switchTo().frame(0);
		WebElement menuitem1 = driver.findElement(By.xpath("(//html[@lang='en']/body/ul/li)[4]"));
		Thread.sleep(2000);
		action.moveToElement(menuitem1).perform();
		System.out.println("you achieved menu with mouse actions");
		System.out.println("moved to " +  menuitem1.getText());
		driver.switchTo().defaultContent();
		
		            //checkbox and radio
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('radio-2').click()");
		System.out.println("clicked radio button with the help of Js");
	
		
		
		
	
		
		}
	
		  
	}


