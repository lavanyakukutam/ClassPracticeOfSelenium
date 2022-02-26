package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myloginpage  extends OrangeURL{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Myloginpage page1= new Myloginpage();
		driver.get(page1.url);
		//page1.myUname();
		

	}

}
