package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class apachepoi_testme {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Users\\training_b6b.00.10\\Desktop\\apachepoi_testdata.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet SH=wb.getSheetAt(0);
	  System.out.println("first row number"+SH.getFirstRowNum());
	  System.out.println("last row number "+SH.getLastRowNum());
	  int rowCount =SH.getLastRowNum()-SH.getFirstRowNum();
	  System.out.println("row count is"+rowCount);
	  for(int i=0;i<=rowCount;i++)
	  {
		  System.out.println(SH.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(0).getCell(1).getStringCellValue());
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
  	  WebDriver driver = new ChromeDriver();
  	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
  	  driver.manage().window().maximize();
  	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  driver.findElement(By.name("userName")).sendKeys(SH.getRow(i).getCell(0).getStringCellValue());
	  driver.findElement(By.name("password")).sendKeys(SH.getRow(i).getCell(1).getStringCellValue());
	  driver.findElement(By.xpath("btn btn-lg btn-success col-xs-4 col-md-offset-0")).click();
	 
  }
}
}
