package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static  com.org.base.Base.driver;

public class SignInPage {
	
	private WebElement Login;
	private WebElement userId;
	private WebElement password;
	private WebElement signIn;
	

	


	



	public WebElement getLogin() {
		Login=driver.findElement(By.xpath("//*[text()='Login']"));
		return Login;
	}
	
	public WebElement getUserId() {
		userId=driver.findElement(By.xpath("//*[@id='userID']"));
		return userId;
	}
	public WebElement getPassword() {
		password=driver.findElement(By.xpath("//*[@id='password']"));
		return password;
	}
	
	public WebElement getSignIn() {
		signIn=driver.findElement(By.xpath("//*[text()='Sign In']"));
		return signIn;
	}

}
