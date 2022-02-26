/*website:  https://jqueryui.com/dialog/
	draggable, drag and drop, multi select, sortable, and resixable	*/

package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticofSelenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		Actions action= new Actions(driver);
		
		//1.draggable
//		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
//		driver.switchTo().frame(0);
//		WebElement draggable = driver.findElement(By.xpath("//p[text()='Drag me around']"));
//		action.dragAndDropBy(draggable, 100,180).build().perform();
				
		//2.drag and drop
//	    driver.findElement(By.xpath("//a[text()='Droppable']")).click();//droppable button
//		Thread.sleep(4000);
//		driver.switchTo().frame(0);
//		WebElement source =driver.findElement(By.xpath("//div[@id='draggable']/p"));
//		WebElement target =driver.findElement(By.xpath("//p[text()='Drop here']"));
//		action.dragAndDrop(source, target).perform();

		//3.sortable
//		 driver.findElement(By.xpath("//a[text()='Sortable']")).click();
//		 Thread.sleep(2000);
//		 driver.switchTo().frame(0);
//		 WebElement item1 =driver.findElement(By.xpath("(//ul[@id='sortable']/li)[2]"));
//		 WebElement item2= driver.findElement(By.xpath("(//ul[@id='sortable']/li)[4]"));
//		 action.dragAndDrop(item2, item1).build().perform();
//		 Thread.sleep(2000);
//		 action.dragAndDrop(item1, item2).build().perform();
		
//		//4.resizable
//		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
//		driver.switchTo().frame(0);
//		WebElement sizable = driver.findElement(By.xpath("//div[@id='resizable']"));
//		action.clickAndHold(sizable).moveByOffset(200, 150).perform();
//		//action.dragAndDropBy(sizable, 190, -180).perform();
//		System.out.println("its Resized");
		
		//5.multiselect
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		driver.switchTo().frame(0);
		WebElement s1= driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement s2=driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement s3=driver.findElement(By.xpath("//li[text()='Item 6']"));
		//with keys
		action.keyDown(Keys.CONTROL).moveToElement(s1).click().moveToElement(s3).click().moveToElement(s2).click().build().perform();
		//with mouse
		//action.clickAndHold(s1).clickAndHold(s2).clickAndHold(s3).build().perform();
		
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
