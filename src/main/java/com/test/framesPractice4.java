package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framesPractice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.getTitle());
		
		//frame1
		driver.switchTo().frame("frame1");
        WebElement txtboxlabel = driver.findElement(By.id("topic"));
		System.out.println("Textbox is in Frame1 ");	
		Thread.sleep(2000);
		System.out.println("Title of Textbox is:  " + txtboxlabel.getText());		
		WebElement txtbox = driver.findElement(By.xpath("//b[@id='topic']/following::input"));
		txtbox.sendKeys("Hello");

		//frame3
		 driver.switchTo().frame("frame3");
		 Thread.sleep(2000);
		 WebElement chkboxlabel = driver.findElement(By.xpath("//input[@id='a']/preceding::b"));
		 System.out.println("Checkbox is in Frame 2");
		 System.out.println("The Checkbox label is: "  + chkboxlabel.getText());
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chkbox.click();
		
		//default
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//frame2
		driver.switchTo().frame("frame2");
		WebElement drpboxlabel = driver.findElement(By.xpath("//b[text()='Animals :']"));
		System.out.println("Dropbox is in frame2");
		Thread.sleep(2000);
		System.out.println("Label of Drop box is: "+ drpboxlabel.getText());
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		Select st= new Select(dropdown);
		st.selectByIndex(2);
		System.out.println("Your selected options in the dropdownis :" + st.getFirstSelectedOption().getText());
		System.out.println("The no. of options in dropdown are: ");
		List<WebElement> options= st.getOptions();
		
		System.out.println(options.size());
		for (WebElement each: options) {
			System.out.println(each.getText());
		}
		
		driver.quit();
	}

}
