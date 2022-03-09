import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
public class parametersTest {
    
	@Test
	@Parameters({"username", "password"})
	public void login(String data1, String data2)
    {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	System.out.println("This is OrangeHRM site");
	driver.findElement(By.id("txtUsername")).sendKeys(data1);
	driver.findElement(By.id("txtPassword")).sendKeys(data2);
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();
	
}
}
