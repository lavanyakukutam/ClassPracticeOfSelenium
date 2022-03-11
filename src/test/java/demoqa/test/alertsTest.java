package demoqa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class alertsTest {
	  ChromeDriver driver;
	 String ObjectActual;
	 String ObjectExpected="ToolsQA";

	  @Test(priority = 0, groups = {"sanity"})
	  public void demologin() throws Exception
	   {   
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			System.out.println(driver.getTitle());;
			ObjectActual=driver.getTitle();
			//String ObjectExpected="ToolsQA";
			Assert.assertEquals(ObjectActual, ObjectExpected, "title mismatched Assertion failed");
			System.out.println("you are in demoqa site alerts");
	   }
 
       @Test(priority = 1,groups = {"sanity"})
       public void alert1()
       {   
    	   driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    	   driver.switchTo().alert().accept();
    	   System.out.println("you clicked ok on Alert 1");
    	
    	  // SoftAssert s1 =new SoftAssert();
    	  // ObjectActual= driver.getTitle();
    	   //s1.assertEquals(ObjectActual, ObjectExpected);
    	   
    	   
       }
       
       @Test(priority = 2, groups = {"sanity"})
       public void alert2()
       {
    	   driver.switchTo().defaultContent();
    	   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
    	   System.out.println("you clicked confirmation Alert");
    	   driver.switchTo().alert().dismiss();  
    	   driver.switchTo().defaultContent();
       }
       
       @Test(priority = 3,groups = {"sanity"})
       public void alert3() throws Exception
       {
    	   driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
    	   driver.switchTo().alert().sendKeys("Hello");
    	   driver.switchTo().alert().accept();
    	   System.out.println("you entered text and accepted  prompt alert"); 
    	   driver.close();
       }
    
}
       
      
