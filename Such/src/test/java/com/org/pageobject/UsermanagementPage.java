package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.Base.driver;

public class UsermanagementPage {
	
	private WebElement userManagement;
	private WebElement Alluser;
	private WebElement ActiveUser;
	
	private WebElement searchBox;
	private WebElement Action;
	private WebElement viewDetails;
	private WebElement backTolist;
	private WebElement ActiveInactive;
	private WebElement ClickActiveInactive;
	private WebElement Cancle;
	
	
	


	


	public WebElement getCancle() {
		Cancle=driver.findElement(By.xpath("//*[text()='Cancel']"));
		return Cancle;
	}
	public WebElement getUserManagement() {
		
		userManagement=driver.findElement(By.xpath("//*[text()='User Management']"));
		return userManagement;
	}
	public WebElement getAlluser() {
		Alluser=driver.findElement(By.xpath("//*[@id='pills-tab-1']"));
		return Alluser;
		
	}
	public WebElement getActiveUser() {
		ActiveUser=driver.findElement(By.xpath("//*[@id='pills-tab-2']"));
		return ActiveUser;
	}
	public WebElement getSearchBox() {
		searchBox=driver.findElement(By.xpath("//*[@class='form-control']"));
		return searchBox;
	}
	public WebElement getAction() {
		Action=driver.findElement(By.xpath("//*[@id=\"main-wrapper admin\"]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[3]/td[6]/div/div/button/img"));
		return Action;
	}
	
	public WebElement getBackTolist() {
		backTolist=driver.findElement(By.xpath("//*[text()='Back to list']"));
		return backTolist;
	}
	public WebElement getViewDetails() {
		viewDetails=driver.findElement(By.xpath("//*[@class='dropdown-item']"));
		return viewDetails;

}
	public WebElement getClickActiveInactive() {
		ClickActiveInactive=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[3]/button[2]/span"));
		return ClickActiveInactive;
	}
	public WebElement getActiveInactive() {
		ActiveInactive=driver.findElement(By.xpath("//*[text()='Active User']"));
		return ActiveInactive;
	}

}
