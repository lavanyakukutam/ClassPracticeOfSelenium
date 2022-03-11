package demoqa.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selectableTest {
	ChromeDriver driver;
	
	@Test(groups = {"smoke"})
	public void login()
	{

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		String actualobject = driver.findElement(By.xpath("//div[text()='Selectable']")).getText();
		String expectedobject="Selectable";
		Assert.assertEquals(actualobject, expectedobject,"assertion failed");
		System.out.println("you are in selectable page");
	
	}
	@Test(priority = 1, groups = {"smoke"})
	public void selectList()
	{   
		System.out.println("You are in List Selectable");
		List <WebElement> options =driver.findElements(By.xpath("//ul[@id='verticalListContainer']/li"));
		System.out.println("number of selections are: " + options.size());
		WebElement one = driver.findElement(By.xpath("//ul[@id='verticalListContainer']/li"));
		WebElement two = driver.findElement(By.xpath("(//ul[@id='verticalListContainer']/li)[2]"));
		WebElement three = driver.findElement(By.xpath("(//ul[@id='verticalListContainer']/li)[4]"));
		Actions action =new Actions(driver);
		action.click(one).click(two).click(three).perform();
		//action.keyDown(two, Keys.CONTROL).click(one).perform();
		System.out.println("you selected the List options: " + one.getText());
		System.out.println(two.getText());
		System.out.println(three.getText());
	}
     @Test(priority = 2, groups = {"smoke"})
	public void selectGrid()
	{   
    	 System.out.println("You are in Grid Selectable");
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		List <WebElement> row1 = driver.findElements(By.xpath("//div[@id='gridContainer']/div/li"));
		System.out.println("row1 no.of options: " + row1.size());
		WebElement one = driver.findElement(By.xpath("(//div[@id='gridContainer']/div/li)[5]"));
		WebElement two = driver.findElement(By.xpath("//div[@id='gridContainer']/div/li"));
		WebElement three = driver.findElement(By.xpath("(//div[@id='gridContainer']/div/li)[9]"));
		Actions action = new Actions(driver);
		action.click(one).click(two).click(three).perform();
		System.out.println("you selected the Grid options: " + one.getText());
		System.out.println(two.getText());
		System.out.println(three.getText());
		driver.close();
	}
}
