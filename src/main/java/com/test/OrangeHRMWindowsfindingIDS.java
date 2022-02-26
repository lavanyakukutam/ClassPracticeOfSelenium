/* Website:  https://opensource-demo.orangehrmlive.com/
   Get the title and url and print window id. then click linkedin icon then get the likedin window id,
    title.after that open facebook icon from main page get the window id and title. And enter user name 
   orangeHrm then facebook then linkedin.
 */

package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindowsfindingIDS {
	public static String parent,linkedin, facebook;
	public static Set<String> handles;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("parent window title is: " + driver.getTitle());
		parent = driver.getWindowHandle();
		System.out.println("parent window id is: "+ parent);
		System.out.println("   ");
		driver.findElement(By.xpath(" //div[@id='social-icons']/child::a")).click();
		
		handles = driver.getWindowHandles();
		for (String each: handles) {
			if(!each.equals(parent)) {
				driver.switchTo().window(each);
				linkedin = driver.getWindowHandle();
			}
		}
				System.out.println("linkedin window id is: " + linkedin);
				System.out.println("linkedin window title is: " +driver.getTitle());
				System.out.println("   ");
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		handles= driver.getWindowHandles();
		for (String each: handles) {
		if(!each.equals(parent))
			{
				driver.switchTo().window(each);
				facebook = driver.getWindowHandle();
			}
		}
				System.out.println("Facebook window id is: " + facebook );
				System.out.println("Facebook window title is: " + driver.getTitle());
					
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.switchTo().window(facebook);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdef@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().window(linkedin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email-address']")).sendKeys("hola");
		
		
		}
}
		
		

	


