package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 {
	WebDriver driver=null;
  @Test
  public void popup() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="http://demowebshop.tricentis.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	  Thread.sleep(2000);
	  Alert alt=driver.switchTo().alert();
	  System.out.println("alert text is: "+alt.getText());
	  alt.accept();
  }
}
