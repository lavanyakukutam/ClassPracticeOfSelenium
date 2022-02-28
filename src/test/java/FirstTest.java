import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	
	@Test
	public void one()
	{
		System.out.println("i am test 1");
	}
	@Test(priority = 2)
	public void two()
	{
		System.out.println("i am test 2 ");
	}
	@BeforeSuite
	public void three()
	{
		System.out.println("i am before suite");
	}
	@AfterSuite
	public void four()
	{
		System.out.println("i am after suite");
	}
	@BeforeClass
	public void five()
	{
		System.out.println("i am before class");
	}
	@AfterClass
	public void six()
	{
		System.out.println("i am after class");
	}
	@BeforeTest
	public void seven()
	{
		System.out.println("i am before test");
	}
	@AfterTest
	public void eight()
	{
		System.out.println("i am after test");
	}
	@BeforeMethod
	public void nine()
	{
		System.out.println("i am before method");
	}
	@AfterMethod
	public void ten()
	{
		System.out.println("i am after method");
	}
	
	@Test(priority = 3)
	public void eleven()
	{
		System.out.println("i am test 3");
	}
	
	
	
	
	
}
