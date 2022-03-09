package assertandlogs.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class facebookTest {
	@Test
	public void login1()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@124");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//hard assert
		String ActualObject = driver.findElement(By.xpath("//div[@class='_9ay7']/a")).getText();
		String ExpectedObject = "Forgot Password";
		Assert.assertEquals(ActualObject, ExpectedObject, "you failed your login");	
	}
	
	@Test
	public void login2()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg@gmail.com");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String ActualObject =driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).getText();
		String ExpectedObject = "Find your account and log in";
		
		//softAssert
		SoftAssert sf= new SoftAssert();
		sf.assertEquals(ActualObject, ExpectedObject);
		System.out.println("enter user name and pwd");
		
	}
}
