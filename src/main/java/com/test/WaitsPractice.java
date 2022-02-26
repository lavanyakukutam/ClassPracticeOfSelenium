package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsPractice {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
   // driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    
    driver.findElement(By.id("btn1")).click();
    driver.findElement(By.id("btn2")).click();
    
    
    

	}

}
