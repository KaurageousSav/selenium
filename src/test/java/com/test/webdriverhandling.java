package com.test;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdriverhandling {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();
  	  String url="https://www.online.citibank.co.in";
  	  driver.navigate().to(url);
  	  driver.manage().window().maximize();
  	  driver.findElement(By.xpath("//a[@title='Login']")).click();
  	  Set<String> windows=driver.getWindowHandles();
  	  Iterator <String> it=windows.iterator();
  	  String parentwindow=it.next();
  	  String childwindow=it.next();
  	  driver.switchTo().window(childwindow);
  	  driver.findElement(By.xpath("//input[@id='User_Id']")).sendKeys("cmk");
  	  driver.findElement(By.xpath("//body[@onload='javascript:loadValue();']"));
  	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456788");
  	  driver.findElement(By.xpath("//div[@class='cl fl ls_login']")).click();
  	  System.out.println("child title is "+driver.getTitle());
  	  driver.close();
  	  driver.switchTo().window(parentwindow);
  	  System.out.println("parent window is "+driver.getTitle());
  	  
  	  
  	  
  	  
  }
}
