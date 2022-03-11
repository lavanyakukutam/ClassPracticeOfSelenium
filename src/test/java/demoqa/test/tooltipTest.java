package demoqa.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltipTest{
	private static ChromeDriver driver;
	private static Actions action;
	
	@Test(groups= {"regression"})
	public void login()
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	System.out.println("logged in successfully");
	//System.out.println(Thread.currentThread().getId());

    }
	
	@Test (groups= {"regression"})
	public void test1()
	{   
		
		WebElement one = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		action = new Actions(driver);
		action.moveToElement(one).perform();
		System.out.println("mousehover on the button");
		WebElement two= driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		action.moveToElement(two).perform();
		System.out.println("mousehover on the textfield");
		WebElement three= driver.findElement(By.xpath("//a[text()='Contrary']"));
		action.moveToElement(three).perform();
		System.out.println("mousehover on contrary ");
		driver.close();
		
		
	}
}
