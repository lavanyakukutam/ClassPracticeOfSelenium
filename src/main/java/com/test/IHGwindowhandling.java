package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IHGwindowhandling {
	public static String parent, explore, facebook, twitter;
	public static Set<String> handles;
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println("First window title is : " + driver.getTitle());
		parent = driver.getWindowHandle();
		System.out.println("parent window id is: "+ parent);
		System.out.println( "      ");
		
		driver.findElement(By.xpath(" //input[@id='firstName']")).sendKeys("Lavanya");
		driver.findElement(By.xpath(" //input[@id='lastName']")).sendKeys("Kukutam");
		driver.findElement(By.xpath("(//a[@target='_blank'])[6]")).click();
		
		handles = driver.getWindowHandles();
		for (String each: handles) {
			Thread.sleep(2000);
			if(!each.equals(parent))
			{
				driver.switchTo().window(each);
				 explore = driver.getWindowHandle();
				System.out.println("second window title is : " +	driver.getTitle());
				System.out.println("explore window id is :" +  explore);
				System.out.println(driver.getCurrentUrl());
				System.out.println( "      ");
				WebElement e1= driver.findElement(By.xpath("//img[@alt='Facebook']"));
				e1.click();
			}
			}
		//Thread.sleep(2000);
		handles = driver.getWindowHandles();
		for (String each: handles) {
		if(!each.equals(parent) && !each.equals(explore))
			{
			driver.switchTo().window(each);
				facebook = driver.getWindowHandle();
				System.out.println("Third window title is : " +	driver.getTitle());
				System.out.println("facebook window id is: " + facebook);
				System.out.println(driver.getCurrentUrl());
				System.out.println( "      ");
			}
		}
		driver.switchTo().window(explore);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//a[@href='https://twitter.com/IHGhotels']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
		e2.click();
		handles= driver.getWindowHandles();
		for (String each: handles) {
			if(!each.equals(explore) && !each.equals(facebook))
			{
				driver.switchTo().window(each);
			twitter = driver.getWindowHandle();
			}
			}
		System.out.println("Fourth window title is : " + driver.getTitle());
		System.out.println("twitter window id is: " + twitter);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
			
		}
				
		
	}
	
	

			
	
		

	


