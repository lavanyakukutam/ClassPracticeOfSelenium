package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorpractice {

	public static void main(String[] args) throws Exception {

    System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
   // driver.manage().window().maximize();
    
    JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("document.getElementById('txtUsername').value='Admin'");//username
    js.executeScript("document.getElementById('txtPassword').value='admin123'");//pwd
    //js.executeScript("document.getElementById('btnLogin').click()");//loginbotton
    //js.executeScript("document.getElementsByTagName('a')[0].click();");//forgotpasswordlink
    
     String title=" ";//url
    title = js.executeScript("return document.title;").toString();
    System.out.println(title);
    
    String url=" ";//title
   url=js.executeScript("return document.URL;").toString();
   System.out.println(url);
    
    //border
    js.executeScript("document.getElementById('txtPassword').style.border='red solid'");
    js.executeScript("document.getElementById('txtUsername').style.border ='red solid'");
    js.executeScript("window.scrollBy(0,500)");//scroll vertical down
    //js.executeScript("window.scrollBy(500,0)");//scroll horizontally right
    Thread.sleep(2000);
    js.executeScript("window.scrollTo(0,0)");// scroll to top
    
    //WebElement linkedinlink= driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
   // js.executeScript("arguments[0].click()", linkedinlink);
   
    Thread.sleep(2000);
    
   //scroll upto the element
    WebElement facebook=driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
    js.executeScript("arguments[0].scrollIntoView(true)", facebook);
    

	}
	

}
