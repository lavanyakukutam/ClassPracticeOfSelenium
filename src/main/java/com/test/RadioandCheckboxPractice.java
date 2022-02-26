package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckboxPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement radio = driver.findElement(By.xpath("//input[@name='gender']/following::label"));
		System.out.println("Male Radio Button");
		System.out.println("Radio Button before selection the selected status:" + radio.isSelected());
		radio.click();
		System.out.println("Displaying: " + radio.isDisplayed());
		System.out.println("Enabled :" + radio.isEnabled());
		System.out.println("Selected : " + radio.isSelected());	
	   System.out.println("Displaying: " + radio.isDisplayed());
	   System.out.println("  ");
	
	System.out.println("Name Label");
	WebElement label = driver.findElement(By.xpath("//label[@id='userName-label']"));
	System.out.println("Displaying: " + label.isDisplayed());
	System.out.println("Enabled :" + label.isEnabled());
	System.out.println("Selected : " + label.isSelected());
	System.out.println("  ");
	
	System.out.println("Submit Button");
	WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
	System.out.println("Displaying: " + button.isDisplayed());
	System.out.println("Enabled: " + button.isEnabled());
	System.out.println("Selected: " + button.isSelected());
	System.out.println("  ");
	
	System.out.println("Upload file ");
	WebElement uploadfile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	System.out.println("Displaying: " +uploadfile.isDisplayed());
	System.out.println("Enabled: " + uploadfile.isEnabled());
	System.out.println("Selected: " + uploadfile.isSelected());
	System.out.println("Type of WebElement: " + button.getAttribute("id"));
	System.out.println("  ");
	
	System.out.println("Checkbox  ");
	WebElement chkbox1 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
	System.out.println("Selected: " + chkbox1.isSelected());
	System.out.println("Displaying : " + chkbox1.isDisplayed());
	System.out.println("Enabled: " + chkbox1.isEnabled());
	JavascriptExecutor  js= (JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,350)", "");
	chkbox1.click();
	Thread.sleep(2000);
	System.out.println("Selected: " + chkbox1.isSelected());
	
	WebElement chkbox2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
	chkbox2.click();
	System.out.println("Selected: " + chkbox2.isSelected());
	WebElement chkbox4 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
	chkbox4.click();
	System.out.println("Selected: " + chkbox4.isSelected());
	}

}
