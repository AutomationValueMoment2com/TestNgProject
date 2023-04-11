package com.salesforce.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) 
	{
		super(driver);
		
	}
	//Contacts Tab
	@FindBy(xpath="//a[@title='Contacts Tab']")
	WebElement contactsTab;
	//New Contact
	@FindBy(xpath="//input[@title='New']")
	WebElement newContact;
	//LastName
	@FindBy(id="name_lastcon2")
	WebElement lastName;
	//Account Name
	@FindBy(id="con4")
	WebElement accountName;
	//AccountName lookup Icon
	@FindBy(xpath="//img[@title='Account Name Lookup (New Window)']")
	WebElement accountLookup;
	//Frame1 in lookup
	@FindBy(id="searchFrame")
	WebElement frame1;
	//result frame
	@FindBy(id="resultsFrame")
	WebElement frame2;
	//search Lookup
	@FindBy(id="lksrch")
	WebElement searchLookup;
	//go Button
	@FindBy(xpath="//input[@title='Go!']")
	WebElement goButton;
	//select search results
	@FindBy(xpath="//th[@scope='row']//a")
	WebElement search;
	//create New view
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement createNewView;
	//view Name
	@FindBy(id="fname")
	WebElement viewName;
	//view Unique Name
	@FindBy(id="devname")
	WebElement viewUniqueName;
	//save Button
	@FindBy(xpath="//div[@class='pbHeader']//input[@title='Save']")
	WebElement saveButton;
	//Cancel Button
	@FindBy(xpath="//div[@class='pbHeader']//input[@title='Cancel']")
	WebElement cancelButton;
	//save&Cancel
	@FindBy(xpath="//div[@class='pbHeader']//input[@title='Save & New']")
	WebElement saveAndCancelButton;
	//New View Name
	@FindBy(xpath="//select[@title='View:']")
	WebElement newViewName;
	//select Recently Created
	@FindBy(id="hotlist_mode")
	WebElement drodown;
	//view dropdown
	@FindBy(id="fcf")
	WebElement view;
	//After select
	@FindBy(xpath="//select[@title='View:']")
	WebElement afterSelect;
	//contactname under NameField
	@FindBy(xpath="//a[text()='ABCD']")
	WebElement nameField;
	//Error Msg
	@FindBy(xpath="//div[@class='requiredInput']//div[@class='errorMsg']")
	WebElement errmsg;
	//firstRecent contact
	@FindBy(xpath="//th[@scope='row']//a")
	WebElement firstRecentContact;
	public void clickContactsTab()
	{   
		waitForElement(10,contactsTab);
		contactsTab.click();
	}
	public void clickNewContact()
	{   
		waitForElement(10,newContact);
		newContact.click();
	}
	public void enterLastName(String str )
	{
		waitForElement(10,lastName);
		lastName.sendKeys(str);	
	}
	public void clickAccountLookup()
	{
		waitForElement(10,accountLookup);
		accountLookup.click();
	}
	public void enterAccountName()
	{
		waitForElement(10,accountName);
		accountName.sendKeys("customs");
	}
	public void clickAccountName()
	{
		waitForElement(10,accountName);
		accountName.click();
	}
	
	public void switchToChilWindow() throws InterruptedException
    {
		Thread.sleep(5000);
        String parentid=driver.getWindowHandle();
        System.out.println(parentid);
   	 Set<String>s=driver.getWindowHandles();
   	 for(String windowid:s)
   		{
   		 System.out.println(windowid);
   		 if(!windowid.equals(parentid))
   		 driver.switchTo().window(windowid);
   		}
    }
	
	public void switchtoFrame1()
	{   
		waitForElement(10,frame1);
		driver.switchTo().frame(frame1);
	}
	public void enterTextLookupBox()
	{   Actions action=new Actions(driver);
	    action.moveToElement(searchLookup).build().perform();
		waitForElement(10,searchLookup);
		searchLookup.click();
		searchLookup.sendKeys("S*");
	}
	public void clickGobutton()
	{
		waitForElement(10,goButton);
		goButton.click();
	}
	public void switchToFrame2()
	{
		waitForElement(10,frame2);
		driver.switchTo().frame(frame2);
	}
	public void clickSearchResult()
	{   
		waitForElement(10,search);
		search.click();
	}
	public void switchBack() throws InterruptedException
	{Thread.sleep(2000);
		String parentid=driver.getWindowHandle();
		driver.switchTo().window(parentid);
	}
	public void switchDefault() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
	public void clickCreateNewView()
	{
		waitForElement(10,createNewView);
		createNewView.click();
	}
	public void enterViewName(String str)
	{
		waitForElement(10,viewName);
		viewName.sendKeys(str);;
	}
	public void clickViewUniqueName()
	{
		waitForElement(10,viewUniqueName);
		viewUniqueName.click();
	}
	public void enterViewUniqueName(String str)
	{
		waitForElement(10,viewUniqueName);
		viewUniqueName.sendKeys(str);
	}
	public void clearViewUniqueName()
	{
		waitForElement(10,viewUniqueName);
		viewUniqueName.clear();
	}
	
	public void clickSaveButton()
	{
		waitForElement(10,saveButton);
		saveButton.click();
	}
	public void validateNewViewName(String str)
	{   waitForElement(10,newViewName);
		Select options=new Select(newViewName);
		String actualOption=options.getFirstSelectedOption().getText();
		System.out.println(actualOption);
		String expectedOption=str;
		Assert.assertEquals(actualOption, expectedOption);
		options.getAllSelectedOptions();
	}
	public void selectRecentlyCreated()
	{ 
		waitForElement(10,drodown);
	    Select options=new Select(drodown);
	    options.selectByVisibleText("Recently Created");
	   // drodown.click();
		
	}
	public void selectMyContacts()
	{
		waitForElement(10,view);
		Select myContacts=new Select(view);
		myContacts.selectByVisibleText("My Contacts");
	}
	public void validateMyContactsPage()
	{   waitForElement(10,afterSelect);
		Select page=new Select(afterSelect);
		String actualPage=page.getFirstSelectedOption().getText();
		String expectedPage="My Contacts";
		Assert.assertEquals(actualPage, expectedPage);
	}
	public void clickNameUnderNamefield()
	{
		waitForElement(10,nameField);
		Actions action=new Actions(driver);
		action.moveToElement(nameField).build().perform();
		nameField.click();
	}
	public void validateErrorMsg()
	{
		waitForElement(10,errmsg);
		String actualErrorMsg=errmsg.getText();
		System.out.println(actualErrorMsg);
		String expectedErrorMsg="Error: You must enter a value";
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	public void clickCancelButton()
	{
		waitForElement(10,cancelButton);
	    cancelButton.click();
		
	}
	public void validate(String st)
	{   waitForElement(10,afterSelect);
		Select page=new Select(afterSelect);
		String actualPage=page.getFirstSelectedOption().getText();
		String expectedPage=st;
		Assert.assertNotEquals(actualPage, expectedPage);
	}
	public void clickSaveAndCanButton()
	{
		waitForElement(10,saveAndCancelButton);
		saveAndCancelButton.click();
	}
	public void getFirstRecentContact()
	{
		waitForElement(10,firstRecentContact);
		System.out.println(firstRecentContact.getText());
	}
	public void switchToWindows()
	{  // String parentId=driver.getWindowHandle();
		
	    Set<String>winIds=driver.getWindowHandles();
		List<String>windows=new ArrayList<String>(winIds);
		String parentId=windows.get(0);
		//String childId=windows.get(1);
		driver.switchTo().window(parentId);
		
		
	}
	
	
	

}
