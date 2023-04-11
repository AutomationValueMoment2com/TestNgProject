package com.salesforce.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LeadsPage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MysettingsPage;
import com.salesforce.pages.RemindMeLaterPage;

public class LeadsTestcases extends BaseTest {
	 LoginPage logInPage;
	 RemindMeLaterPage remindLater;
	 HomePage homePage;
	 MysettingsPage settingsPage;
	 LeadsPage leadsPage;
	 WebDriver driver;
	 String url;
	 String lastNam=RandomStringUtils.randomAlphabetic(6);
	 String compName=RandomStringUtils.randomAlphabetic(6);
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		driver=getDriver("chrome");
		url=getUrl("salesforceurl");
	    logInPage=new LoginPage(driver);
	    remindLater=new RemindMeLaterPage(driver);
	    homePage=new HomePage(driver);
	    settingsPage=new MysettingsPage(driver);
	    leadsPage=new LeadsPage(driver);
	    driver.get(url);
	}
	/*@AfterMethod
	 * public void afterMethod()
	{
		takeScreenshot(driver);
		 driver.close();
	}*/
	@Test
	public void testcase20() throws InterruptedException
	{
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 homePage.clickUserMenuDropdown();
		 homePage.clickLogOut();
		 
	}
	@Test
	public void testcase21() throws InterruptedException
	{
		 logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 leadsPage.validateLeadViewDropdown();
	}
	@Test
	public void testcase22() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 leadsPage.selectTodayLeads();
		 homePage.clickUserMenuDropdown();
		 homePage.clickLogOut();
		 logInPage.ValidateLogInPageAfterLogOut();
		 //logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 leadsPage.clickGo();
		 leadsPage.validateLeadViewAfterGo();
		 
		 
	}
	@Test
	public void testcase23() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 leadsPage.selectTodayLeads();
		 leadsPage.clickGo();
		 leadsPage.validateLeadViewAfterGo();
	}
	@Test
	public void testcase24() throws InterruptedException
	{
		logInPage.enterUserName("kavya@value.com");
		 logInPage.enterPassword("aniljaiaadhya15");
		 logInPage.checkRememberMe();
		 logInPage.clickLoginButton();
		 //remindLater.clickRemindMeLater();
		 leadsPage.clickLeadsTab();
		 settingsPage.switchToActive();
		 settingsPage.closeDialogueBox();
		 leadsPage.clickNewButton();
		 leadsPage.enterLastName(lastNam);
		 leadsPage.enterCompanyName(compName);
		 leadsPage.saveButton();
		 leadsPage.validateNewLeadName(lastNam);
		 
	}
	

}
