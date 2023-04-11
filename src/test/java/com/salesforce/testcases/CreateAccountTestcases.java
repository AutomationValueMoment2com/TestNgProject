package com.salesforce.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.AccountsPage;
import com.salesforce.pages.DeveloperConsolePage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MysettingsPage;
import com.salesforce.pages.RemindMeLaterPage;
import com.salesforce.pages.UserProfilePage;

public class CreateAccountTestcases extends BaseTest {
	 LoginPage logInPage;
	 RemindMeLaterPage remindLater;
	 HomePage homePage;
	 UserProfilePage profilePage;
	 MysettingsPage settingsPage;
	 DeveloperConsolePage developerConsolePage;
	 AccountsPage accountsPage;
	 WebDriver driver;
	 String url;
	 String newAccountName=RandomStringUtils.randomAlphabetic(6);
	 String newViewName=RandomStringUtils.randomAlphabetic(6);
	 String newUniqueName=RandomStringUtils.randomAlphabetic(6);
	 @BeforeMethod
	 public void beforeMethod() throws IOException
		{
			driver=getDriver("chrome");
			url=getUrl("salesforceurl");
		    logInPage=new LoginPage(driver);
		    remindLater=new RemindMeLaterPage(driver);
		    homePage=new HomePage(driver);
		    profilePage=new UserProfilePage(driver);
		    settingsPage=new MysettingsPage(driver);
		    developerConsolePage=new DeveloperConsolePage(driver);
		    accountsPage=new AccountsPage(driver);
			driver.get(url);
		}
	 /*@AfterMethod 
	 public void afterMethod()
	 { 
		 driver.close(); 
     }*/
			
		@Test
		public void TestCase10() throws InterruptedException
		{logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 homePage.getUser();
		 accountsPage.clickAccountTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 accountsPage.clickNewTab();
		 accountsPage.clickAccountName();
		 accountsPage.enterAccountName(newAccountName);
		 accountsPage.selectType();
		 accountsPage.selectPriority();
		 accountsPage.enterSaveButton();
		 accountsPage.validateNewAccount(newAccountName);
		 accountsPage.validateType();
		 accountsPage.validatePriority();
		 }
		@Test
		public void Testcase11() throws InterruptedException
		{
			logInPage.enterUserName("kavya@value.com");
			 logInPage.enterPassword("aniljaiaadhya15");
			 logInPage.checkRememberMe();
			 logInPage.clickLoginButton();
			 //remindLater.clickRemindMeLater();
			 homePage.getUser();
			 accountsPage.clickAccountTab();
			 settingsPage.switchToActive();
			 settingsPage.closeDialogueBox();
			 accountsPage.clickCreateNewView();
			 accountsPage.enterViewName(newViewName);
			 accountsPage.enterViewUniqueName(newUniqueName);
			 accountsPage.clickSavButton();
			 accountsPage.clickViewList();
			 accountsPage.checkViewList(newViewName);
			 
			 
		}
		@Test
		public void testcase12() throws InterruptedException
		{
			logInPage.enterUserName("kavya@value.com");
			 logInPage.enterPassword("aniljaiaadhya15");
			 logInPage.checkRememberMe();
			 logInPage.clickLoginButton();
			 //remindLater.clickRemindMeLater();
			 homePage.getUser();
			 accountsPage.clickAccountTab();
			
			 settingsPage.switchToActive();
			 settingsPage.closeDialogueBox();
			 accountsPage.clickSelectView();
			 accountsPage.clickAccountsEdit();
			 //accountsPage.clickAccountsNew();
			 accountsPage.enterViewNameField();
			 accountsPage.selectFieldType();
			 accountsPage.selectOperatorType();
			 accountsPage.enterValueAsA();
			 accountsPage.saveViewButton();
			 //last step is pending validation
			 }
		@Test
		public void testcase13() throws InterruptedException
		{
			logInPage.enterUserName("kavya@value.com");
			 logInPage.enterPassword("aniljaiaadhya15");
			 logInPage.checkRememberMe();
			 logInPage.clickLoginButton();
			// remindLater.clickRemindMeLater();
			 homePage.getUser();
			 accountsPage.clickAccountTab();
			 settingsPage.switchToActive();
			 settingsPage.closeDialogueBox();
			 accountsPage.clickMergeAccounts();
			 accountsPage.enterFindAccounts();
			 accountsPage.clickFindAccounts();
			 accountsPage.clickAccount1();
			 accountsPage.clickAccount2();
			 accountsPage.clickAccount3();
			 accountsPage.clickNextButton();
			 accountsPage.clickMergeButton();
			 accountsPage.AcceptTheAlert();
			}
		@Test
		public void Testcase14() throws InterruptedException
		{
			 logInPage.enterUserName("kavya@value.com");
			 logInPage.enterPassword("aniljaiaadhya15");
			 logInPage.checkRememberMe();
			 logInPage.clickLoginButton();
			 remindLater.clickRemindMeLater();
			 //homePage.getUser();
			 accountsPage.clickAccountTab();
			 settingsPage.switchToActive();
			 settingsPage.closeDialogueBox();
			 accountsPage.clickLastActivity();
			 accountsPage.clickDateField();
			 accountsPage.selectCreatedDate();
			 accountsPage.clickFromDate();
			 accountsPage.clickFromToday();
			 accountsPage.clickToDate();
			 accountsPage.clickToToday();
			 accountsPage.clickSaveReport();
			 accountsPage.switchToPopup();
			 accountsPage.moveToViewName();
			 accountsPage.moveToViewUniqueName();
			 accountsPage.clickSaveAndRun();
			
			 }


}
