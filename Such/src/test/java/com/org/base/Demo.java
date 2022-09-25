package com.org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static WebDriver driver;
     @Test(dataProvider ="validateDataProvider")
	public  void validateSignin(String userid,String passWord) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sachorgin-714333557.ap-south-1.elb.amazonaws.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userid+" " +passWord);
		driver.findElement(By.id("userID")).sendKeys(userid);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(2000);
		String errorMesage=driver.findElement(By.xpath("//*[text()='Password not Match']")).getText();
		System.out.println(errorMesage);
     }
		
		@DataProvider
     public Object[][] validateDataProvider() throws IOException{
    	 File file=new File("C:\\Users\\kumar.mukesh\\Desktop\\New folder\\Book1.xlsx");
    	 FileInputStream fis=new FileInputStream(file);
    	 XSSFWorkbook myExcellData=new XSSFWorkbook(fis);
    	 XSSFSheet mydata=myExcellData.getSheet("Sheet2");
    	 int totalRow=mydata.getPhysicalNumberOfRows();
    	 System.out.println("Total row" +totalRow);
    	 
    	 Object[][] data=new Object[totalRow][2];
    	 
    	 for(int i=0;i<totalRow;i++) {
    		 XSSFRow CurrRow=mydata.getRow(i);
    		 XSSFCell userIdCell=CurrRow.getCell(0);
    		 XSSFCell PassWordCell=CurrRow.getCell(1);
    		 
    		 String userId=userIdCell.getStringCellValue();
    		 String PassWord=PassWordCell.getStringCellValue();
    		 
    		 data[i][0]=userId;
    		 data[i][1]=PassWord;
    		 
    		 System.out.println(userId+" "+PassWord);
    	 }
    	
    	 
		return data;
    	 
     }
		
	

	

}
