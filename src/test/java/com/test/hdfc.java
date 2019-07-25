package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hdfc {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();
  	  driver.get("https://www.hdfcbank.com/");
  	  driver.manage().window().maximize();
  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	  Actions act1=new Actions(driver);
  	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
  	  Thread.sleep(20);
  	  act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
  	  Thread.sleep(20);
  	  act1.moveToElement(driver.findElement(By.xpath("//a[@ href='/personal/products/demat/demat-account']"))).click().build().perform();
  	  System.out.println("page url is"+driver.getCurrentUrl());
  	  Thread.sleep(20);
  	  driver.close();
  }
}
