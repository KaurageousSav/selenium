package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=null; 
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  String url="https://www.google.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("title is"+driver.getTitle());
  }
}
