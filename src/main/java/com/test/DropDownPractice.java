/*  User Story:
  Website: "https://www.globalsqa.com/demo-site/select-dropdown-menu/"
  Print the heading of Dropdown and print the list of dropdown options.
  First select the dropdown option by index then select by value then select by visible text
   and print the selected option.
 */

package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		driver.manage().window().maximize();
		System.out.println("DropDown Name is: "+ driver.findElement(By.xpath("//div[@class='information closable']/strong")).getText());

		WebElement dropdown = driver.findElement(By.xpath("//div [@class='information closable']/following::select"));

		Select ddownoptions = new Select(dropdown);

		System.out.println(" Dropdown options are: ");//printing options
		//List<WebElement> list = ddownoptions.getOptions();
		//for (WebElement each : list) {

		//	System.out.println(each.getText());
		//}
		System.out.println("First Selected Option is " + ddownoptions.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		ddownoptions.selectByIndex(2);
		Thread.sleep(2000);
		ddownoptions.selectByValue("ATA");
		Thread.sleep(2000);
		ddownoptions.selectByVisibleText("Canada");
		Thread.sleep(1000);


		
		driver.close();




	}

}
