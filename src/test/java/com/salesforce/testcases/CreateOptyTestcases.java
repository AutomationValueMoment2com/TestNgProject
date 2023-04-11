package com.salesforce.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.AccountsPage;
import com.salesforce.pages.DeveloperConsolePage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MysettingsPage;
import com.salesforce.pages.OppurtunitiesPage;
import com.salesforce.pages.RemindMeLaterPage;
import com.salesforce.pages.UserProfilePage;

public class CreateOptyTestcases extends BaseTest {
	 LoginPage logInPage;
	 RemindMeLaterPage remindLater;
	 HomePage homePage;
	 UserProfilePage profilePage;
	 MysettingsPage settingsPage;
	 DeveloperConsolePage developerConsolePage;
	 AccountsPage accountsPage;
	 OppurtunitiesPage opppurtunitiesPage;
	 WebDriver driver;
	 String url;
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
		    opppurtunitiesPage=new OppurtunitiesPage(driver);
			driver.get(url);
		}
	 /*@AfterMethod 
	 public void afterMethod()
	 { takeScreenshot(driver);
		 driver.close(); 
     }*/
	 @Test
	 public void Testcase15() throws InterruptedException
		 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 opppurtunitiesPage.validateViewDropdown();
		 }
	 @Test
	 public void Testcase16() throws InterruptedException 
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 opppurtunitiesPage.clickViewButton();
		 opppurtunitiesPage.enterOppurtunityName();
		 opppurtunitiesPage.clickAccountName();
		 opppurtunitiesPage.enterAccountName();
		 opppurtunitiesPage.clickCloseDate();
		 opppurtunitiesPage.clickToday();
		 opppurtunitiesPage.clickTodayLink();
		 opppurtunitiesPage.clickStage();
		 opppurtunitiesPage.saveNewOppurtunity();
		 }
	 @Test
	 public void Testcase17() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 opppurtunitiesPage.clickOppurtunityPipeline();
		 opppurtunitiesPage.validationOfOppurtunityPipeline();
		 
	 }
	 @Test
	 public void Testcase18() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 opppurtunitiesPage.clickStuckOppurtunities();
		 opppurtunitiesPage.validationOfStuckOppurtunities();
	 }
	 @Test
	 public void Testcase19() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectCurrentFQ();
		 opppurtunitiesPage.selectAll();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectCurrentFQ();
		 opppurtunitiesPage.selectOpen();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectCurrentFQ();
		 opppurtunitiesPage.selectClosed();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectNextFQ();
		 opppurtunitiesPage.selectAll();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectNextFQ();
		 opppurtunitiesPage.selectOpen();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 opppurtunitiesPage.clickQuaterlyInterval();
		 opppurtunitiesPage.selectNextFQ();
		 opppurtunitiesPage.selectClosed();
		 opppurtunitiesPage.clickRunReport();
		 opppurtunitiesPage.clickOppurtunitiesTab();
		 //how to validate the results
		 
		 
	 }
	 

}
