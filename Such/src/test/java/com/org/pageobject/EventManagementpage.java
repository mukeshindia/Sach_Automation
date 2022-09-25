package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.Base.driver;

public class EventManagementpage {
	
	private WebElement eventManagement;
	private WebElement createEvent;
	private WebElement searchBox;
	private WebElement upcomingEvent;
	


	
	
	public WebElement getEventManagement() {
		eventManagement=driver.findElement(By.xpath("//*[text()='Event Management']"));
		return eventManagement;
	}
	public WebElement getCreateEvent() {
		createEvent=driver.findElement(By.xpath("//*[text()='Create Event']"));
		return createEvent;
	}
	public WebElement getSearchBox() {
		searchBox=driver.findElement(By.xpath("//*[@class='form-control']"));
		return searchBox;
	}
	
	public WebElement getUpcomingEvent() {
		upcomingEvent=driver.findElement(By.xpath("//*[text()='Upcoming Event (3)']"));
		return upcomingEvent;
	}

	

}
