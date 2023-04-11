package com.salesforce.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class MysettingsPage extends BasePage {

	public MysettingsPage(WebDriver driver) 
	{
		super(driver);
		
	}
	//Personal link
	@FindBy(xpath="//div[@id='PersonalInfo']")
	WebElement personalLink;
	//Login History
	@FindBy(xpath="//span[text()='Login History']")
	WebElement logInHistory;
	//download the excel sheet
	@FindBy(xpath="//div[@class='pShowMore']")
	WebElement excelSheet;
	//Display and LayOut
	@FindBy(xpath="//span[text()='Display & Layout']")
	WebElement displayLayout;
	//customise My Tabs
	@FindBy(id="CustomizeTabs_font")
	WebElement customizeTabs;
	//custom type
	@FindBy(id="p4")
	WebElement customType;
	//Availaable tab
	@FindBy(id="duel_select_0")
	WebElement availableTab;
	//Click Add Button
	@FindBy(xpath="//img[@title='Add']")
	WebElement addButton;
	//Click Save Button
	@FindBy(xpath="//td[@class='pbButtonb']//input[@value=' Save ']")
	WebElement saveButton;
	//Click Right corner AppMenu
	@FindBy(xpath="//div[@title='App Menu']")
	WebElement appMenu;
	//select saleForce chatter
	@FindBy(xpath="//div[@class='mbrMenuItems']//a[6]")
	WebElement saleforceChatter;
	//dialogue close button
	@FindBy(xpath="//a[@class='dialogClose']")
	WebElement dialogueClose;
	//Reports Tab
	@FindBy(xpath="//a[text()='Reports']")
	WebElement reportsTab;
	//selectsales fromRightcorner menu
	@FindBy(xpath="//div[@id='tsid-menuItems']//a[text()='Sales']")
	WebElement  selectSales;
	//EmailLink
	@FindBy(xpath="//span[text()='Email']")
	WebElement  emailLink;
	//Email Settings
	@FindBy(xpath="//span[text()='My Email Settings']")
	WebElement  emailSettings;
	//EmailName
	@FindBy(id="sender_name")
	WebElement  emailName;
	//Email address
	@FindBy(id="sender_email")
	WebElement  emailAddress;
	//saveButton Email
	@FindBy(xpath="//input[@title='Save']")
	WebElement emailSave;
	//Actual msg
	@FindBy(xpath="//div[text()='Your settings have been successfully saved.']")
	WebElement actualMsg;
	//CalendarAndReminders
	@FindBy(id="CalendarAndReminders_font")
	WebElement calendarReminder;
	//TestReminder Button
	@FindBy(id="Reminders_font")
	WebElement testReminder;
	//selectedTabs
	@FindBy(id="duel_select_1")
	WebElement selectedTabs;
	//Remove Tab
	@FindBy(xpath="//img[@title='Remove']")
	WebElement removeTabs;
	

	
	public void clickPersonalLink()
	{waitForElement(10,personalLink);
		personalLink.click();
	}
	public void clickLoginHistory()
	{waitForElement(10,logInHistory);
	logInHistory.click();
	}
	public void clickDownloadExcel()
	{waitForElement(10,excelSheet);
	excelSheet.click();
	}
	public void clickDisplayLayOut()
	{waitForElement(10,displayLayout);
	displayLayout.click();
	}
	public void clickCustomizeTabs()
	{waitForElement(10,customizeTabs);
	customizeTabs.click();
	}
	public void clickCustomType()
	{waitForElement(10,customType);
	customType.click();
	}
	public void selectSalesChatter()
	{
		//select salesforce chatter from dropdown
		Select frmcustomType=new Select(customType);
		frmcustomType.selectByVisibleText("Salesforce Chatter");
	}
	public void clickAvailableTab()
	{waitForElement(10,availableTab);
	availableTab.click();
		
	}
	public void clickAvailTab()
	{
		Select availTabs=new Select(availableTab);
		availTabs.selectByVisibleText("Reports");
	}
	public void clickAvalTab()
	{
		Select availTabs=new Select(availableTab);
		availTabs.selectByVisibleText("Cases");
	}
	public void clickAddButton()
	{waitForElement(10,addButton);
	addButton.click();
		}
	public void clickSaveButton()
	{waitForElement(10,saveButton);
	saveButton.click();
		}
	public void clickAppMenu()
	{waitForElement(10,appMenu);
	appMenu.click();
		}
	public void selectSalesForceChatter()
	{waitForElement(10,saleforceChatter);
	saleforceChatter.click();
		}
	public void switchToActive() throws InterruptedException
	{Thread.sleep(5000);
		driver.switchTo().activeElement();
	}
	public void closeDialogueBox()
	{waitForElement(10,dialogueClose);
	dialogueClose.click();
		}
	public void reportsTabIsSelected()
	{waitForElement(20,reportsTab);
	dialogueClose.isDisplayed();
		}
	public void switchToWindow() throws InterruptedException
	{
		String windowid=driver.getWindowHandle();
		Thread.sleep(5000);
		driver.switchTo().window(windowid);
	}
	public void selectSalesFromList()
	{waitForElement(15,selectSales);
	selectSales.click();
		}
	
	public void clickEmailLink()
	{waitForElement(15,emailLink);
	emailLink.click();
		}
	public void clickEmailSettings()
	{waitForElement(10,emailSettings);
	emailSettings.click();
		}
	public void clearEmailName()
	{waitForElement(10,emailName);
	emailName.clear();
		}
	public void enterEmailName()
	{waitForElement(10,emailName);
	emailName.sendKeys("Kavya Kakumani");
		}
	public void clearEmailAddress()
	{waitForElement(10,emailAddress);
	emailAddress.clear();
		}
	public void enterEmailAddress()
	{waitForElement(10,emailAddress);
	emailAddress.sendKeys("kavyak.cv@gmail.com");
		}
	public void clickEmailsave() 
	{
		waitForElement(10,emailSave);
		emailSave.click();
	}
	public void emailConfirmMsg()
	{
		String actualConfirmMsg=actualMsg.getText();
		String expectedConfirmMsg="Your settings have been successfully saved.";
		Assert.assertEquals(actualConfirmMsg, expectedConfirmMsg);
	}
	public void clickCalendarReminder() 
	{
		waitForElement(10,calendarReminder);
		calendarReminder.click();
	}
	public void clickTestReminder() 
	{
		waitForElement(10,testReminder);
		testReminder.click();
	}
	public void switchToChildWindow()
	{
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		Set<String>s=driver.getWindowHandles();
		for(String windowid:s)
		{
			System.out.println(windowid);
			if(!windowid.equals(parentid))
				driver.switchTo().window(windowid).close();
		}
	}
	public void clickSelectedTab() throws InterruptedException
	{  // Thread.sleep(4000);
		Select selecTabs=new Select(selectedTabs);
		selecTabs.selectByVisibleText("Reports");
	}
	public void clickSelecTab() throws InterruptedException
	{   Thread.sleep(4000);
		Select selecTabs=new Select(selectedTabs);
		selecTabs.selectByVisibleText("Cases");
	}
	
	public void removeTab()
	{
		waitForElement(10,removeTabs);
		removeTabs.click();
	}
	
	
	

}
