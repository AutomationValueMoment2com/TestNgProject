package com.salesforce.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.AccountsPage;
import com.salesforce.pages.ContactPage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MysettingsPage;
import com.salesforce.pages.RemindMeLaterPage;

   public class ContactTestcases extends BaseTest 
   {
	LoginPage logInPage;
    RemindMeLaterPage remindLater;
    HomePage homePage;
    MysettingsPage settingsPage;
    ContactPage contactPage;
    AccountsPage accountsPage;
    WebDriver driver;
    String url;
    String viewNam=RandomStringUtils.randomAlphabetic(6);
    String uniqueNam=RandomStringUtils.randomAlphabetic(6);
    String lastName=RandomStringUtils.randomAlphabetic(6);
   @BeforeMethod
   public void beforeMethod() throws IOException
   {
	 driver=getDriver("chrome");
	 url=getUrl("salesforceurl");
     logInPage=new LoginPage(driver);
     remindLater=new RemindMeLaterPage(driver);
     homePage=new HomePage(driver);
     settingsPage=new MysettingsPage(driver);
     contactPage=new ContactPage(driver);
     accountsPage=new AccountsPage(driver);
     driver.get(url);
   }
   /*@AfterMethod
	 * public void afterMethod()
	{
		takeScreenshot(driver);
		 driver.close();
	}*/
	@Test
	public void testcase25() throws InterruptedException
	{
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickNewContact();
		 contactPage.enterLastName(lastName);
		 contactPage.clickAccountName();
		 contactPage.clickAccountLookup();
		 contactPage.switchToChilWindow();
		 //contactPage.switchtoFrame1();
		 //contactPage.enterTextLookupBox();
		 //contactPage.clickGobutton();
		 contactPage.switchToFrame2();
		 contactPage.clickSearchResult();
		 contactPage.switchToWindows();
		 contactPage.clickSaveButton();
	}
	@Test
	public void testcase26() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickCreateNewView();
		 contactPage.enterViewName(viewNam);
		 contactPage.clickViewUniqueName();
		 contactPage.clickSaveButton();
		 contactPage.validateNewViewName(viewNam);
	}
	@Test
	public void testcase27() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.selectRecentlyCreated();
		 contactPage.getFirstRecentContact();
	}
	@Test
	public void testCase28() throws InterruptedException
	{
     logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.checkRememberMe();
	 logInPage.clickLoginButton();
	 remindLater.clickRemindMeLater();
	 contactPage.clickContactsTab();
	 settingsPage.switchToActive();
	 settingsPage.closeDialogueBox();
	 contactPage.selectMyContacts();
	 contactPage.validateMyContactsPage();
	}
	@Test
	public void testCase29() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickNameUnderNamefield();
		 //running repeatedly
	}
	@Test
	public void testcase30() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickCreateNewView();
		 contactPage.clickViewUniqueName();
		 contactPage.enterViewUniqueName(uniqueNam);
		 contactPage.clickSaveButton();
		 contactPage.validateErrorMsg();
		 
	}
	@Test
	public void testcase31() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickCreateNewView();
		 contactPage.enterViewName(viewNam);
		 contactPage.clickViewUniqueName();
		 contactPage.clearViewUniqueName();
		 contactPage.enterViewUniqueName(uniqueNam);
		 contactPage.clickCancelButton();
		 contactPage.validate(viewNam);
		 
	}
	@Test
	public void testcase32() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 contactPage.clickContactsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 contactPage.clickNewContact();
		 contactPage.enterLastName("Indian");
		 contactPage.clickAccountName();
		 contactPage.enterAccountName();
		 contactPage.clickSaveAndCanButton();
		 
	 }
	
}
