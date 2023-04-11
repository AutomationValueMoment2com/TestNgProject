package com.salesforce.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.DeveloperConsolePage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MysettingsPage;
import com.salesforce.pages.RemindMeLaterPage;
import com.salesforce.pages.UserProfilePage;
import com.salesforce.utilities.CommonUtilities;

public class HomePageTestcase extends BaseTest 
{
	 LoginPage logInPage;
	 RemindMeLaterPage remindLater;
	 HomePage homePage;
	 UserProfilePage profilePage;
	 MysettingsPage settingsPage;
	 DeveloperConsolePage developerConsolePage;
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
			driver.get(url);
			
		}

	/*@AfterMethod 
		 public void afterMethod()
		 { takeScreenshot(driver);
			 driver.close(); 
	     }*/
	@Test
	public void validateUserMenuDropdownList()
	{
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 remindLater.clickRemindMeLater();
		 homePage.isUserMenudropdownVisible();
		 homePage.clickUserMenuDropdown();
		 homePage.validateUserMenuDropdownList();
	}
	@Test
	public void checkMyProfileTestcase6() throws InterruptedException
	{ 
	 logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.checkRememberMe();
	 logInPage.clickLoginButton();
	 //remindLater.clickRemindMeLater();
	 homePage.clickUserMenuDropdown();
	 homePage.validateUserMenuDropdownList();
	 homePage.clickMyProfile();
	 profilePage.clickEditPen();
	 profilePage.switchToFrame2();
	 profilePage.clickContactTab();
	 profilePage.clickEmail();
	 profilePage.clickAboutTab();
	 profilePage.clickLastname();
	 profilePage.clearLastname();
	 profilePage.enterLastname("kakumani");
	 profilePage.clickSaveall();
	 profilePage.switchToParentId();
	 profilePage.clickPostLink();
	 profilePage.switchToFrame1();
	 profilePage.enterPostLinkText("Shipment Date");
	 profilePage.switchToDefault();
	 profilePage.clickShareButton();
	 profilePage.clickFileLink();
	 profilePage.clickUploadFile();
	 //profilePage.clickchooseFile();
	 profilePage.filepathToChooseFile("C:\\\\Users\\\\ja36h\\\\Jnanesh Assignments\\\\tekArchAssignments\\\\dataFolder\\\\Reader.txt");
	 profilePage.clickShare();
	 profilePage.hoverOnProfileImage();
	 profilePage.clickPhotoLink();
	 profilePage.switchToPhotoFrame();
	 profilePage.filepathPhotoChooseFile("C:\\Users\\ja36h\\Videos\\Jnanesh Java training\\HackthronInterviewQuestions\\JpgPhoto.jpg");
	 profilePage.selectShowMyPhoto();
	 profilePage.saveProfilePhoto();
	 profilePage.clickSaveCrop();
	 
}
	@Test
	public void checkMysettingsTestcase7() throws InterruptedException
	{
		
	 logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.checkRememberMe();
	 logInPage.clickLoginButton();
	 //remindLater.clickRemindMeLater();
	 homePage.clickUserMenuDropdown();
	 homePage.clickMySettings();
	 settingsPage.clickPersonalLink();
	 settingsPage.clickLoginHistory();
	 settingsPage.clickDownloadExcel();
	 settingsPage.clickPersonalLink();
	 settingsPage.clickDisplayLayOut();
	 settingsPage.clickCustomizeTabs();
	 settingsPage.clickCustomType();
	 settingsPage.selectSalesChatter();
	 settingsPage.clickAvailableTab();
	 settingsPage.clickAvailTab();
	 settingsPage.clickAddButton();
	 settingsPage.clickSaveButton();
	 settingsPage.clickAppMenu();
	 settingsPage.selectSalesForceChatter();
	 settingsPage.switchToActive();
	 settingsPage.closeDialogueBox();
	 settingsPage.reportsTabIsSelected();
	 settingsPage.switchToWindow(); 
	 settingsPage.clickAppMenu();
	 settingsPage.selectSalesFromList();
	 homePage.clickUserMenuDropdown();
	 homePage.clickMySettings();
	 settingsPage.clickEmailLink();
	 settingsPage.clickEmailSettings();
	 settingsPage.clearEmailName();
	 settingsPage.enterEmailName();
	 settingsPage.clearEmailAddress();
	 settingsPage.enterEmailAddress();
	 settingsPage.clickEmailsave();
	 settingsPage.emailConfirmMsg();
	 settingsPage.clickCalendarReminder();
	 settingsPage.clickTestReminder();
	 settingsPage.switchToChildWindow();
	 settingsPage.clickDisplayLayOut();
	 settingsPage.clickCustomizeTabs();
	 settingsPage.clickCustomType();
	 settingsPage.selectSalesChatter();
	 settingsPage.clickSelectedTab();
	 settingsPage.removeTab();
	 settingsPage.clickSaveButton();
	 
	}
	@Test
	public void DevelopeConsoleTestcase8()
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 homePage.clickUserMenuDropdown();	
		 homePage.validateUserMenuDropdownList();
		 homePage.clickDeveloperConsole();
		 developerConsolePage.switchToWindow();
		 
	}
	@Test
	public void LogOutTestcase9() throws InterruptedException
	{logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.checkRememberMe();
	 logInPage.clickLoginButton();
	 //remindLater.clickRemindMeLater();
	 homePage.clickUserMenuDropdown();	
	 homePage.validateUserMenuDropdownList();
	 homePage.clickLogOut();
	 logInPage.ValidateLogInPageAfterLogOut();
	 
	 
	}
	@Test
	public void TestCase10()
	{logInPage.enterUserName("kavya@value.com");
	 logInPage.enterPassword("aniljaiaadhya15");
	 logInPage.checkRememberMe();
	 logInPage.clickLoginButton();
	 //remindLater.clickRemindMeLater();
	 homePage.getUser();
	 }
	
	
	
	
		 
}
