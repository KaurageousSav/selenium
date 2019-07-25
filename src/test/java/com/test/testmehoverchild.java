package com.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testmehoverchild {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();
  	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	  Actions act1=new Actions(driver);
  	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"))).perform();
  	  Thread.sleep(20);
  	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"))).perform();
  	  Thread.sleep(20);
  	  act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"))).click().build().perform();
  	  Set<String> windows=driver.getWindowHandles();
  	  Iterator<String> it=windows.iterator();
  	  String parent=it.next();
  	  String child=it.next();
  	  driver.switchTo().window(child);
  	  
  }
}
