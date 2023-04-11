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
import com.salesforce.pages.RandomPage;
import com.salesforce.pages.RemindMeLaterPage;
import com.salesforce.pages.UserProfilePage;

public class RandomScenarios extends BaseTest {
	
	LoginPage logInPage;
	 RemindMeLaterPage remindLater;
	 HomePage homePage;
	 UserProfilePage profilePage;
	 MysettingsPage settingsPage;
	 DeveloperConsolePage developerConsolePage;
	 AccountsPage accountsPage;
	 OppurtunitiesPage opppurtunitiesPage;
	 RandomPage randomPage; 
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
		    randomPage=new RandomPage(driver);
			driver.get(url);
		}
	 /*@AfterMethod
		 * public void afterMethod()
		{
			takeScreenshot(driver);
			 driver.close();
		}*/
	 @Test
	 public void testcase33()
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 randomPage.clickUsrname();
		 randomPage.getTitl();
	}
	 @Test
	 public void testcase34() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 randomPage.clickUsrname();
		 randomPage.clickEdit();
		 randomPage.validateUser();
		 homePage.clickUserMenuDropdown();
		 homePage.clickMyProfile();
		 profilePage.clickEditPen();
		 profilePage.switchToFrame2();
		 randomPage.contactIsSelected();
		 profilePage.clickAboutTab();
		 profilePage.firstNameIsFocused();
		 profilePage.clickLastname();
		 profilePage.clearLastname();
		 profilePage.enterLastname("abcd");
		 profilePage.clickSaveall();
		 randomPage.validateName();
	}
	 @Test
	 public void testcase35() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 randomPage.clickOperatorPlus();
		 randomPage.clickCustomizeMyTabs();
		 settingsPage.clickSelecTab();
		 settingsPage.removeTab();
		 settingsPage.clickSaveButton();
		 randomPage.validateAllTabsPage();
		// randomPage.validateCasesTabVisibility();
         homePage.clickUserMenuDropdown();
		 homePage.clickLogOut();
		 logInPage.ValidateLogInPageAfterLogOut();
		// logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 //randomPage.validateAllTabsBar();
		 randomPage.clickOperatorPlus();
		 randomPage.clickCustomizeMyTabs();
		 settingsPage.clickAvalTab();
		 settingsPage.clickAddButton();
		 settingsPage.clickSaveButton();
	 }
	 @Test
	 public void testcase36() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 homePage.clickHomeTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 randomPage.clickDateLink();
		 randomPage.clickOn8Pm();
		 randomPage.getParentWindowId();
		 randomPage.clickOnSubjectComboIcon();
		 randomPage.switchToChildWindow();
		 randomPage.clickOtherLink();
		 randomPage.swithToDefault();
		 randomPage.clickDateField();
		 randomPage.clickNinePm();
		 randomPage.clickSave();
	}
	 @Test
	 public void testcase37() throws InterruptedException
	 {
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 homePage.clickHomeTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 randomPage.clickDateLink();
		 randomPage.clickOn4Pm();
		 randomPage.getParentWindowId();
		 randomPage.clickOnSubjectComboIcon();
		 randomPage.switchToChildWindow();
		 randomPage.clickOtherLink();
		 randomPage.swithToDefault();
		 randomPage.clickDateField();
		 randomPage.clickSevenPm();
		 randomPage.clickRecurrence();
		 randomPage.clickRecurrenceEndDate();
		 randomPage.clickSave();
	 }
}
