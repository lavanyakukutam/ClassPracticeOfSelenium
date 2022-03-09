import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.Myloginpage;


public class LoginTest {
	@Test(dataProvider = "credentials")
	public void login(String username, String password)
    {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	System.out.println("This is OrangeHRM site");
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();
	
}
	
	@DataProvider(name ="credentials", indices = 1)
	public Object[][] details()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "admin";
		data[0][1]= "admin12";
		
		data[1][0]= "Admin";
		data[1][1]= "admin123";
		
		
		
		return data;
	}
}
