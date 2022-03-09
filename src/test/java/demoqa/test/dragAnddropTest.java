package demoqa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class dragAnddropTest {
     
	@Test (groups = {"sanity","regression"})
	public void drag()
	{
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/droppable");
				String url= "https://demoqa.com/droppable";
	 
				Assert.assertTrue(driver.getCurrentUrl().equals(url));
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		System.out.println("drag and drop happened");
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
        driver.quit();
		
	}
	

	}


