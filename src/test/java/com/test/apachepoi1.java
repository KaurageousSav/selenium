package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class apachepoi1 {
  @Test
  public void f() throws IOException {
  
  File src=new File("C:\\Users\\training_b6b.00.10\\Desktop\\apachepoi_testdata.xlsx");
  FileInputStream fis=new FileInputStream(src);
  XSSFWorkbook wb= new XSSFWorkbook(fis);
  XSSFSheet SH=wb.getSheetAt(0);
  
  System.out.println("first row number"+SH.getFirstRowNum());
  System.out.println("last row number "+SH.getLastRowNum());
  
  int rowCount =SH.getLastRowNum()-SH.getFirstRowNum();

  System.out.println("RowCount is "+rowCount);
  System.out.println(SH.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+SH.getRow(0).getCell(1).getStringCellValue());
}
}