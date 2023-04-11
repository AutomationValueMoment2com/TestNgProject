 package com.salesforce.pages;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
//UserMenudropdown
   @FindBy(id="userNavLabel")
   WebElement userMenuDropdown;
   //My Profile
   @FindBy(xpath="//a[text()='My Profile']")
   WebElement myProfile;
   //My settings
   @FindBy(xpath="//a[text()='My Settings']")
   WebElement mySettings;
   //Developer console
   @FindBy(xpath="//a[text()='Developer Console']")
   WebElement developerConsole;
   //Log Out
   @FindBy(xpath="//a[text()='Logout']")
   WebElement logOut;
   //userName
   @FindBy(xpath="//a[text()='Kavya kakumani']")
   WebElement user;
//userMenuDropdownList
	@FindBy(xpath="//div[@id='userNav-menuItems']//a")
	List<WebElement> userMenuDropdownList;
	//Home Tab
	@FindBy(xpath="//a[@title='Home Tab']")
	WebElement homeTab;
	public void isUserMenudropdownVisible()
	{
		waitForElement(10,userMenuDropdown);
		Assert.assertTrue(userMenuDropdown.isDisplayed());
	}
	public void clickUserMenuDropdown()
	{
		waitForElement(10,userMenuDropdown);
		userMenuDropdown.click();
	}
	public void validateUserMenuDropdownList()
	{
		String expectedList[]= {"My Profile","My Settings","Developer Console","Switch to Lightning Experience","Logout"};
	    List<WebElement>userMenuList=userMenuDropdownList;
		int listSize=userMenuList.size();
		for(WebElement userDropdown:userMenuList)
		{	//System.out.println(userDropdown.getText());
		for(int i=0;i<expectedList.length;i++)
			{
				Assert.assertTrue(expectedList.length==listSize);
				Assert.assertTrue(expectedList[i].equals(userMenuList.get(i).getText()));
		     }
		}
		}
	public void clickMyProfile()
	{
	waitForElement(10,myProfile);
	myProfile.click();	
	}
	public void clickMySettings()
	{
	waitForElement(10,mySettings);
	mySettings.click();	
	}
	public void clickDeveloperConsole()
	{
		waitForElement(10,developerConsole);
		developerConsole.click();
	}
	public void clickLogOut()
	{
		waitForElement(10,logOut);
		logOut.click();
	}
	public void getUser()
	{
		waitForElement(10,user);
		String actualName="Kavya kakumani";
		String expectedName=user.getText();
		Assert.assertEquals(actualName, expectedName);
	}
	public void clickHomeTab()
	{
		waitForElement(10,homeTab);
		homeTab.click();
	}
	
}

