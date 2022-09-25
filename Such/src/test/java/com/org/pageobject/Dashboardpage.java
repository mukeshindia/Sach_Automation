package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.Base.driver;

public class Dashboardpage {
	
	private WebElement dashBoard;

	public WebElement getDashBoard() {
		dashBoard=driver.findElement(By.xpath("//*[@class='page-title']"));
		return dashBoard;
	}

}
