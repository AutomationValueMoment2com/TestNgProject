package com.salesforce.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.RemindMeLaterPage;

public class RemindMeLaterTestcases extends BaseTest
{
	LoginPage logInPage;
	RemindMeLaterPage remindLater;
    WebDriver driver;
    String url;
    @BeforeMethod
	public void beforeMethod() throws IOException
	{
		driver=getDriver("chrome");
		url=getUrl("salesforceurl");
	    logInPage=new LoginPage(driver);
	    remindLater=new RemindMeLaterPage(driver);
	    driver.get(url);
	}
    @AfterMethod
    public void afterMethod()
     {
	   driver.close();
     }
     @Test
     public void clickRemindMeLater()
     {
    	 logInPage.enterUserName("kavya@value.com");
    	 logInPage.enterPassword("aniljaiaadhya15");
    	 logInPage.checkRememberMe();
    	 logInPage.clickLoginButton();
    	 remindLater.clickRemindMeLater();
	 }

}
