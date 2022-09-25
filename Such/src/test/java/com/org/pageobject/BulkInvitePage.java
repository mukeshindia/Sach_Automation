package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.Base.driver;

public class BulkInvitePage {
	
	
	private WebElement bulkinvite;
	private WebElement browser;

	

	public WebElement getBulkinvite() {
		bulkinvite=driver.findElement(By.xpath("//*[text()='Bulk Invite']"));
		return bulkinvite;
	}
	
	public WebElement getBrowser() {
		browser=driver.findElement(By.xpath("//*[text()='Browse']"));
		return browser;
	}
	
	

}
