import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.Myloginpage;

public class LoginTest {
	@Test(invocationCount = 4,invocationTimeOut = 20000)
    public void login()
    {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	System.out.println("This is OrangeHRM site");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();
	
}
}
