package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.Base.driver;

public class ExportCSVpage {
	
	private WebElement exportCsv;

	public WebElement getExportCsv() {
		exportCsv=driver.findElement(By.xpath("//*[text()='Export CSV']"));
		return exportCsv;
	}

}
