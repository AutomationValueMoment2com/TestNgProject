package com.salesforce.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.salesforce.base.BasePage;

public class DeveloperConsolePage extends BasePage {

	public DeveloperConsolePage(WebDriver driver)
	{
		super(driver);
		
	}
	public void switchToWindow()
	{
		//String ParentId=driver.getWindowHandle();
		Set<String>winIds=driver.getWindowHandles();
		List<String>windows=new ArrayList<String>(winIds);
		String childId=windows.get(1);
		driver.switchTo().window(childId).close();
	}
	

}
