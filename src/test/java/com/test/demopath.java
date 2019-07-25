package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demopath {
	WebDriver driver=null; 
  @Test
  public void f() {
	  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
	  	  driver = new ChromeDriver();
	  	  String url="https://demowebshop.tricentis.com";
	  	  driver.get(url);
	  	  driver.manage().window().maximize();
	  	  driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	  	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("simmisimran516@gmail.com");
	  	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("qwerty12345");
	  	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  	  driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	  	  
	    }
	  }

