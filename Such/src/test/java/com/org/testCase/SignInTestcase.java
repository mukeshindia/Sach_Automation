package com.org.testCase;



import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.org.base.Base;
import com.org.pageobject.AddUserPage;
import com.org.pageobject.BulkInvitePage;
import com.org.pageobject.Dashboardpage;
import com.org.pageobject.ExportCSVpage;
import com.org.pageobject.SignInPage;
import com.org.pageobject.UsermanagementPage;
import com.org.utils.Propertyconfiguration;

public class SignInTestcase extends Base {

	
	SignInPage sip=new SignInPage();
	Dashboardpage dbp=new Dashboardpage();
	UsermanagementPage ump=new UsermanagementPage();
	AddUserPage adp=new AddUserPage();
	ExportCSVpage ecp=new ExportCSVpage();
	BulkInvitePage bip=new BulkInvitePage();
	
	    @Test(priority = 1)
	    public void validatelogin() throws InterruptedException {
	    testCase=extentReports.createTest("validatelogin");
		sip.getLogin().click();
		logger.info("click on Login button");
		Thread.sleep(5000);
	}
	    
		@Test(dataProvider ="validateDataProvider" ,priority=2)
		public void validateUsereId(String userId,String PassWord  ) throws InterruptedException {
			Thread.sleep(2000);
			testCase=extentReports.createTest("validateUsereId");
			sip.getUserId().sendKeys(userId);
			sip.getPassword().sendKeys(PassWord);

			sip.getSignIn().click();
			
			Thread.sleep(2000);
		}
	
		@Test(priority = 2)
		public void validatedashboardTitle() throws IOException {
			testCase=extentReports.createTest("validatedashboardTitle");
			String exptitle="ashboard";
			String actTitle=dbp.getDashBoard().getText();
			if(exptitle.equals(actTitle)) {
				testCase.pass("page title is DashBoard");
			}else {
				testCase.fail("page title does not DashBoard");
				
				Propertyconfiguration.screenShot();
				testCase.addScreenCaptureFromPath("C:\\Users\\kumar.mukesh\\eclipse-workspace\\Such\\Report\\FaildScreenshot\\faild.png");
				
			}
			
			
			assertEquals(actTitle, exptitle);
		}
		@Test(priority = 3)
		
		public void validateUserManagement() throws InterruptedException {
			testCase=extentReports.createTest("validateUserManagement");
			ump.getUserManagement().click();
			Thread.sleep(2000);
		}
		//@Test(priority = 5)
		public void validateActiveUser() {
			ump.getActiveUser().click();
		}
		
		@Test(priority = 4)
		public void validateAction() throws InterruptedException {
			testCase=extentReports.createTest("validateAction");
			Thread.sleep(2000);
			ump.getAction().click();
			Thread.sleep(2000);
			ump.getViewDetails().click();
			Thread.sleep(2000);
			ump.getBackTolist().click();
			Thread.sleep(4000);
		
		}
		@Test(priority = 5)
		public void validtateInactiveActive() throws InterruptedException {
			testCase=extentReports.createTest("validtateInactiveActive");
			ump.getAction().click();
			Thread.sleep(2000);
			ump.getActiveInactive().click();
			Thread.sleep(4000);
			ump.getCancle().click();
			
			//ump.getClickActiveInactive().click();
			
		}
		//@Test(priority = 6)
		public void validateSerchBox() throws InterruptedException {
			Thread.sleep(2000);
			testCase=extentReports.createTest("validateUserManagement");
			ump.getSearchBox().sendKeys("sa");
		}
		
		@Test(priority = 7)
		public void validateExportCsv() throws InterruptedException {
			Thread.sleep(2000);
			ecp.getExportCsv().click();
		}
		@Test(priority = 8)
		public void validateBulkinvite() throws InterruptedException {
			Thread.sleep(2000);
			bip.getBulkinvite().click();
			Thread.sleep(2000);
			bip.getBrowser().click();
			
		}
		
		//@Test(priority = 7)
		public void validateAdduser() {
			adp.getAddUser().click();
			adp.getName().sendKeys("Jitendra Singh");
			adp.getEmail().sendKeys("jk@gmail.com");
			adp.getMobile().sendKeys("8787909809");
			adp.getAddButton().click();
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
