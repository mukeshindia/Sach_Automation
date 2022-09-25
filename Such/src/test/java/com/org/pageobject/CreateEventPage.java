package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.org.base.Base.driver;

import java.time.Duration;

public class CreateEventPage {
	
	private WebElement eventtitle;
	

	public WebElement getEventtitle() {
		
		eventtitle=driver.findElement(By.xpath("//*[@id='eventTitle']"));
		
		return eventtitle;
	}
	
	public void validateStartDate() {
    driver.findElement(By.id("eventDateTime")).click();
		
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ant-picker-content")));
		
		String monthYearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYearVal);
		
		String month=monthYearVal.split(" ")[0].trim();
		String year=monthYearVal.split(" ")[1].trim();
		
		while(!(month.equals("September") && year.equals("2022"))) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-next-btn']")).click();
			monthYearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(monthYearVal);
			
			 month=monthYearVal.split(" ")[0].trim();
			 year=monthYearVal.split(" ")[1].trim();
		}
		
		driver.findElement(By.xpath("//*[text()='17']")).click();
		
	}

	}
	
	
	
	
	
	

