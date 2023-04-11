package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class EmailConfirmPage extends BasePage 
{
	public EmailConfirmPage(WebDriver driver)
	{
		super(driver);
	}
	//ConfirmationPage
	@FindBy(xpath="//p[contains(text(),'We’ve sent you an email')]")
	WebElement confirmMsg;
	
	public void emailConfirmMsg()
	{
		String actualConfirmMsg=confirmMsg.getText();
		String expectedConfirmMsg="We’ve sent you an email with a link to finish resetting your password.";
		Assert.assertEquals(actualConfirmMsg, expectedConfirmMsg);
	}
}
