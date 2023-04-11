package com.salesforce.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class RandomPage extends BasePage {
String parentId;
	public RandomPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Kavya kakumani']")
	WebElement userName;
	//User Edit
	@FindBy(xpath="//input[@title='Edit']")
	WebElement editUser;
	//validate username
	@FindBy(xpath="//h2[text()=' Kavya kakumani']")
	WebElement valUseNam;
	//contact Tab
	@FindBy(id="contactTab")
	WebElement contactTab;
	//userProfilename
	@FindBy(id="tailBreadcrumbNode")
	WebElement userProfilename;
	//+ operator
	@FindBy(xpath="//img[@title='All Tabs']")
	WebElement operatorPlus;
	//click customizeTabs
	@FindBy(xpath="//input[@title='Customize My Tabs']")
	WebElement customizeMyTabs;
	//All Tabs
	@FindBy(xpath="//h1[text()='All Tabs']")
	WebElement allTabs;
	//cases Tab 
	@FindBy(id="Case_Tab")
	WebElement casesTab;
	//AllTabsBar
	@FindBy(xpath="//ul[@id='tabBar']//li")
	List<WebElement> allTabsBar;
	//Home tab Date link
	@FindBy(xpath="//span[@class='pageDescription']//a")
	WebElement dateLink;
	//click on 8:00 pm
	@FindBy(xpath="//a[contains(text(),'8:00 PM')]")
	WebElement click8Pm;
	//click on 4:00 pm
	@FindBy(xpath="//a[contains(text(),'4:00 PM')]")
	WebElement click4Pm;
	//subject combo icon
	@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
	WebElement subjectComboIcon;
	//combo box other link
	@FindBy(xpath="//a[text()='Other']")
	WebElement otherLink;
	//End Time field
	@FindBy(id="EndDateTime_time")
	WebElement endTime; 
	//save
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement save;
	//click 9:00 pm
	@FindBy(xpath="//div[text()='9:00 PM']")
	WebElement ninePm;
	//click 7:00 PM
	@FindBy(xpath="//div[text()='7:00 PM']")
	WebElement sevenPm;
	//Recurrence
	@FindBy(id="IsRecurrence")
	WebElement recurrenceField;
	//Recurrence End Date
	@FindBy(id="maxRecurrence")
	WebElement recurrenceEndDate;
	
	public void validateName()
	{
		String actual=userProfilename.getAttribute("title");
		String expected="Kavya abcd  ";
		Assert.assertEquals(actual, expected);
	}
		
	public void clickUsrname() 
	{
		waitForElement(10,userName);
		userName.click();
	}
	public void getTitl()
	{
		System.out.println(driver.getTitle());
	}
	
	public void clickEdit()
	{
		waitForElement(10,editUser);
		editUser.click();
	}
	public void validateUser() throws InterruptedException 
	{   waitForElement(10,valUseNam);
		String actual=valUseNam.getText();
		String expected="Kavya kakumani";
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);
		
	}
	public void contactIsSelected()
	{
		 waitForElement(10,contactTab);
		 contactTab.isSelected();
	}
	public void clickOperatorPlus() throws InterruptedException
	{   Thread.sleep(4000);
		waitForElement(10,operatorPlus);
		operatorPlus.click();
	}
	public void clickCustomizeMyTabs()
	{
		waitForElement(10,customizeMyTabs);
		customizeMyTabs.click();
	}
	public void validateAllTabsPage()
	{
		waitForElement(10,allTabs);
		String actual=allTabs.getText();
		String expected="All Tabs";
		Assert.assertEquals(actual,expected);
	}
	public void validateCasesTabVisibility() 
	{
		waitForElement(10,casesTab);
		Boolean actual=!(casesTab.isDisplayed());
		System.out.println(actual);
		Boolean expected=true;
		Assert.assertEquals(actual,expected);
		
	}
	public void validateAllTabsBar() throws InterruptedException
	{
		Thread.sleep(4000);
		Boolean actual=allTabsBar.contains(casesTab);
		Boolean expected=false;
		Assert.assertEquals(actual,expected);
		
	}
	public void getParentWindowId()
	{
		parentId=driver.getWindowHandle();
		
	}
	public void clickDateLink()
	{
		waitForElement(10,dateLink);
		dateLink.click();
	}
	public void clickOn8Pm()
	{
		waitForElement(10,click8Pm);
		click8Pm.click();
	}
	public void clickOnSubjectComboIcon()
	{
		waitForElement(10,subjectComboIcon);
		subjectComboIcon.click();
	}
	public void switchToChildWindow()
	{
		//String ParentId=driver.getWindowHandle();
		Set<String>winIds=driver.getWindowHandles();
		List<String>windows=new ArrayList<String>(winIds);
		String childId=windows.get(1);
		driver.switchTo().window(childId);
	}
	public void clickOtherLink()
	{
		waitForElement(10,otherLink);
		Actions action=new Actions(driver);
		action.moveToElement(otherLink).build().perform();
		otherLink.click();
	}
	public void swithToDefault() throws InterruptedException
	{Thread.sleep(4000);
		driver.switchTo().window(parentId);
	}
	public void clickDateField()
	{
		waitForElement(10,endTime);
		endTime.click();	
	}
	public void clickNinePm()
	{
		waitForElement(10,ninePm);
		ninePm.click();	
	}
	public void clickSave()
	{
		waitForElement(10,save);
		save.click();	
	}
	public void clickOn4Pm()
	{
		waitForElement(10,click4Pm);
		click4Pm.click();
	}
	public void clickSevenPm()
	{
		waitForElement(10,sevenPm);
		sevenPm.click();	
	}
	public void clickRecurrence()
	{
		
		waitForElement(10,recurrenceField);
		recurrenceField.click();
	}
	public void clickRecurrenceEndDate()
	{
		
		waitForElement(10,recurrenceEndDate);
		recurrenceEndDate.click();
	}
	
	
	

}
