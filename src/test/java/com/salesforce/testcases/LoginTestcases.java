package com.salesforce.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.salesforce.base.BaseTest;
import com.salesforce.log.Log;
import com.salesforce.pages.LoginPage;
//import com.salesforce.utilities.CommonUtilities;

public class LoginTestcases extends BaseTest {
	    LoginPage logInPage;
	    WebDriver driver;
	   
	    String url;
	
@BeforeMethod
//@Parameters({"browser"})
	public void beforeMethod() throws IOException
	//public void beforeMethod(String browse) throws IOException
	{   driver=getDriver("chrome");
		//driver=getDriver(browse);
		url=getUrl("salesforceurl");
	    logInPage=new LoginPage(driver);
	    driver.get(url);
	    DOMConfigurator.configure("log4j.xml");
	    //Log.StartTestCase("")
	}

@AfterMethod 
	 public void afterMethod()
	 { 
	//takeScreenshot(driver);
		 driver.close(); 
     }
	 
@Test
public void logIn()
//Testcase2
	{ Log.info("I am logging in"); 
	 logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.clickLoginButton();
	 Log.info("Clicked on Login");
	
	}

@Test
public void checkLoginError()
//Testcase1
    {
	logInPage.enterUserName("kavya@value.com");
	logInPage.clearPassword();
	logInPage.clickLoginButton();
	logInPage.validateErrorMsg();
	}
@Test
public void checkRememberMe()
//Testcase3
    {
	logInPage.enterUserName("kavya@value.com");
    logInPage.enterPassword("aniljaiaadhya15");
    logInPage.checkRememberMe();
    logInPage.clickLoginButton();
    }
@Test
public void forgotPassword()
//Testcase 4b
{
	logInPage.enterWrongUsername("123");
	logInPage.enterWrongPassword("22131");
	logInPage.clickLoginButton();
	logInPage.validateCheckUsernamePassword();
}

}
