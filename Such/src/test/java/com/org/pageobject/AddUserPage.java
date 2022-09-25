package com.org.pageobject;

import static com.org.base.Base.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUserPage {
	
	private WebElement addUser;
	private WebElement name;
	private WebElement email;
	private WebElement mobile;
	private WebElement addButton;
	
	

	public WebElement getAddUser() {
		addUser=driver.findElement(By.xpath("//*[text()='Add User']"));
		return addUser;
	}


	public WebElement getName() {
		name=driver.findElement(By.xpath("//*[@id='basic_userFullName']"));
		return name;
	}

	public WebElement getEmail() {
		email=driver.findElement(By.xpath("//*[@id='basic_userEmail']"));
		return email;
	}

	public WebElement getMobile() {
		mobile=driver.findElement(By.xpath("//*[@id='basic_userContact']"));
		return mobile;
	}
	public WebElement getAddButton() {
		addButton=driver.findElement(By.xpath("//*[text()='Add']"));
		return addButton;
	}

}
