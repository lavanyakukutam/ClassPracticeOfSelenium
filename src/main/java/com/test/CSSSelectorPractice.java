package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input#email")).sendKeys("abcdefgh@gmail.com");  // tag(inputidvalue i.e. #email)
driver.findElement(By.cssSelector("input[name='pass'")).sendKeys("5678910");//tag[name='value']

driver.findElement(By.cssSelector("button[type='submit']")).click();  //tag[type='value']
Thread.sleep(2000);


	}

}
