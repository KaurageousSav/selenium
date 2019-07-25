package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class apachepoi_simmi {
WebDriver driver=null;
  @Test
  public void f() throws IOException {
 File src=new File("C:\\Users\\training_b6b.00.10\\Desktop\\testdata_simmi.xlsx");

      

      FileInputStream fis=new FileInputStream(src);

     

      XSSFWorkbook wb= new XSSFWorkbook(fis);

     

      XSSFSheet SH=wb.getSheetAt(0);

     

      System.out.println("first row number"+SH.getFirstRowNum());

      System.out.println("last row number "+SH.getLastRowNum());

     

      int rowCount =SH.getLastRowNum()-SH.getFirstRowNum();

      System.out.println("RowCount is "+rowCount);

     
      for(int i=1;i<=rowCount;i++)
      {
      System.out.println(SH.getRow(i).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(i).getCell(1).getStringCellValue());

  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
  driver.get(url);
  driver.manage().window().maximize();
  driver.findElement(By.linkText("SignIn")).click();
  driver.findElement(By.id("userName")).sendKeys(SH.getRow(i).getCell(0).getStringCellValue());
  driver.findElement(By.name("password")).sendKeys(SH.getRow(i).getCell(1).getStringCellValue());
  driver.findElement(By.name("Login")).click();
  driver.close();
  
  
  //writing in excel file
  XSSFRow header=SH.getRow(0);
  XSSFCell header2=header.createCell(2);
  header2.setCellValue("status");
  SH.getRow(1).createCell(2).setCellValue("PASS");
  SH.getRow(2).createCell(2).setCellValue("PASS");
  FileOutputStream fos=new FileOutputStream(src);
wb.write(fos);
  
      }
  }
}