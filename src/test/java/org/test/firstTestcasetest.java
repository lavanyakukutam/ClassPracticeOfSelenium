package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class firstTestcasetest extends orangehrmlogin{
	@Test(priority = 1)
	public void welcome() throws Exception
	{   System.out.println("title is: " + driver.getTitle());
		WebElement name = driver.findElement(By.xpath("//a[@id='welcome']"));
		System.out.println("the message here is: " + name.getText());
		driver.findElement(By.xpath("//a[@id='welcome']")).click();//button near welcome
		List<WebElement> options =driver.findElements(By.xpath("//div[@class='panelContainer']/ul/li"));
		System.out.println(options.size());
		Thread.sleep(4000);
		for (WebElement each: options) {
			if(each.getText().equalsIgnoreCase("support"))
			{
				each.click();
				System.out.println("you clicked : " + each.getText());
				break;
			}
		}
		
	}
	@Test(priority = 2)
	public void adminmenu()
	{
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		System.out.println("you clicked Admin");
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		System.out.println("you clicked admin/usermanagement/users");
		System.out.println(driver.findElement(By.xpath("//div[@class='head']")).getText());//header of toggletip
	}

}
