package com.org.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.org.base.Base;

public class HomePageTest extends Base{
	
	@Test
	public void validatehomrPage() {
		
		List<WebElement> Alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement links: Alllinks) {
			
			System.out.println(links.getText()+"-"+links.getAttribute("href"));
		}
		
	}

}
