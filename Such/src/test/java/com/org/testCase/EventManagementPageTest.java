package com.org.testCase;

import org.testng.annotations.Test;

import com.org.base.Base;
import com.org.pageobject.EventManagementpage;
import com.org.pageobject.SignInPage;
import com.org.utils.Propertyconfiguration;

public class EventManagementPageTest extends Base {
	
	           SignInPage sip=new SignInPage();
	           
	           EventManagementpage emp=new EventManagementpage();
	           @Test(priority = 1)
	           public void validatelogin() throws InterruptedException {
		       testCase=extentReports.createTest("validatelogin");
			   sip.getLogin().click();
			   Thread.sleep(2000);
				
				sip.getUserId().sendKeys(Propertyconfiguration.props.getProperty("userId"));
				sip.getPassword().sendKeys(Propertyconfiguration.props.getProperty("passWord"));
				Thread.sleep(2000);
				sip.getSignIn().click();
	           }
	           
	           @Test(priority = 2)
	           public void validateEventmanagement() throws InterruptedException {
	        	   Thread.sleep(2000);
	        	   emp.getEventManagement().click();
	        	   
	           }
	           
	           @Test(priority = 3)
	           public void validateEventSearchBox() throws InterruptedException {
	        	   Thread.sleep(2000);
	        	   emp.getSearchBox().sendKeys("My");
	           }
	           
	           @Test(priority = 4)
	           public void validateList() throws InterruptedException {
	        	   Thread.sleep(2000);
	        	   emp.getUpcomingEvent().click();
	           }
	           
	           @Test(priority = 5)
	           public void validateCreateEvent() throws InterruptedException {
	        	   Thread.sleep(2000);
	        	   emp.getCreateEvent().click();
	        	   
	           }
			   
			
	

}
