package com.salesforce.testcases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.salesforce.base.BaseTest;
import com.salesforce.pages.ForgotPasswordPage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.RemindMeLaterPage;
public class ForgotPasswordTestcases extends BaseTest {
	  LoginPage logInPage;
	  RemindMeLaterPage remindLater;
	  ForgotPasswordPage forgotPwd;
	  WebDriver driver;
	  String url;
	  @BeforeMethod
	   public void beforeMethod() throws IOException
	   {
		   driver=getDriver("chrome");
			url=getUrl("salesforceurl");
		    logInPage=new LoginPage(driver);
		    remindLater=new RemindMeLaterPage(driver);
		    forgotPwd=new ForgotPasswordPage(driver);
		    driver.get(url);
	   }
	  @AfterMethod 
		 public void afterMethod()
		 { 
			 driver.close(); 
	     }
	  @Test
	  public void enterUserName()
	  {
		  logInPage.clearUsername();
		  logInPage.clearPassword();
		  logInPage.clickForgotPassword();
		  forgotPwd.enterUserName();
		  forgotPwd.clickContinue();
	  }
	

}
