package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class AccountsPage extends BasePage{

	public AccountsPage(WebDriver driver) 
	{
		super(driver);
		
	}

	//Account tab
	@FindBy(id="Account_Tab")
	WebElement accountTab;
	//Account username
	@FindBy(id="mru005Dm0000015Ufo")
	WebElement accountUsername;
	//New tab
	@FindBy(xpath="//input[@name='new']")
	WebElement newTab;
	//account name
	@FindBy(id="acc2")
	WebElement accountName;
	//validate new account name
	@FindBy(xpath="//div[@class='textBlock']//h2")
	WebElement newAccName;
	//Type
	@FindBy(id="acc6")
	WebElement type;
	//customerPriority
	@FindBy(id="00NDm000005yP5I")
	WebElement customerPriority;
	//save button
	@FindBy(name="save")
	WebElement saveButton;
	//Type
	@FindBy(id="acc6_ileinner")
	WebElement atype;
	//Priority
	@FindBy(id="00NDm000005yP5I_ileinner")
	WebElement apriority;
	//create New view
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement createNwView;
	//view name
	@FindBy(id="fname")
	WebElement viewName;
	//view unique name
	@FindBy(id="devname")
	WebElement viewUniqueName;
	//save
	@FindBy(xpath="//input[@name='save']")
	WebElement saveButon;
	//Account view list
	@FindBy(xpath="//select[@title='View:']")
	WebElement viewList;
	//Accounts view(select)
	@FindBy(xpath="//select[@id='fcf']")
	WebElement accountsView;
	//Edit
	@FindBy(xpath="//a[text()='Edit']")
	WebElement accountsEdit;
	//New
	@FindBy(xpath="//input[@name='new']")
	WebElement accountsNew;
	//view Name field
	@FindBy(id="fname")
	WebElement viewNameField;
	//field
	@FindBy(id="fcol1")
	WebElement fieldType;
	//operator 
	@FindBy(id="fop1")
	WebElement operatorType;
	//value
	@FindBy(xpath="//input[@title='Value 1']")
	WebElement valueAs;
	//save
	@FindBy(xpath="//td[@class='pbButtonb']//input[1]")
	WebElement saveView;
	//Merge accounts
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement mergeAccounts; 
	//Find accounts textarea
	@FindBy(id="srch")
	WebElement findAccountsText;
	//click find accounts button
	@FindBy(xpath="//div[@class='pbWizardBody']//input[@value='Find Accounts']")
	WebElement findAccountsButton;
	//select Account1
	@FindBy(id="cid0")
	WebElement selectAccount1;
	//select Account2
	@FindBy(id="cid1")
	WebElement selectAccount2;
	//select Account3
	@FindBy(id="cid2")
	WebElement selectAccount3;
	//next button
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Next']")
	WebElement nextButton;
	//click Merge
	@FindBy(xpath="//div[@class='pbWizardHeader']//input[@value=' Merge ']")
	WebElement clickMerge;
	//Last activity Link
	@FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
	WebElement lastActivity;
	//Date Field Dropdown
	@FindBy(id="ext-gen148")
	WebElement dateField;
	//created Date
	@FindBy(xpath="//div[text()='Created Date']")
	WebElement createdDate;
	//From date
	@FindBy(id="ext-gen152")
	WebElement fromDate;
	//select Today
	@FindBy(xpath="//button[text()='Today']")
	WebElement fromToday;
	//To date
	@FindBy(id="ext-gen154")
	WebElement toDate;
	//select Today
	@FindBy(xpath="//table[@id='ext-comp-1114']//button[text()='Today']")
	WebElement toToday;
	//save Report
	@FindBy(id="ext-gen49")
	WebElement saveReport;
	//Report Name
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportName;
	//Report unique Name
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement reportUniqueName;
	//Save and Run Button
	@FindBy(xpath="//button[text()='Save and Run Report']")
	WebElement saveAndRunButton;
	
	public void clickAccountTab()
	{
		waitForElement(10,accountTab);
		accountTab.click();
	}
	public void clickAccUserName()
	{
		waitForElement(10,accountUsername);
		accountUsername.click();
	}
	public void clickNewTab()
	{
		waitForElement(10,newTab);
		newTab.click();
	}
	public void clickAccountName()
	{
		waitForElement(10,accountName);
		accountName.click();
	}
	public void enterAccountName(String str)
	{
		waitForElement(10,accountName);
		accountName.sendKeys(str);
	}
	public void selectType()
	{
		Select stype=new Select(type);
		stype.selectByVisibleText("Technology Partner");
	}
	public void selectPriority()
	{
		Select stype=new Select(customerPriority);
		stype.selectByVisibleText("High");
	}
	public void enterSaveButton()
	{
		waitForElement(10,saveButton);
		saveButton.click();
	}
	public void validateType()
	{
		String actualType=atype.getText();
		String expectedType="Technology Partner";
		Assert.assertEquals(actualType, expectedType);
	}
	public void validatePriority()
	{
		String actualPriority=apriority.getText();
		String expectedPriority="High";
		Assert.assertEquals(actualPriority, expectedPriority);
	}
	public void clickCreateNewView() 
	{
		createNwView.click();
	}
	public void enterViewName(String str)
	{
		viewName.sendKeys(str);
	}
	public void enterViewUniqueName(String str)
	{
		viewUniqueName.sendKeys(str);
	}
	public void clickSavButton()
	{
		saveButon.click();
	}
	public void clickViewList()
	{
		viewList.click();
	}
	public void checkViewList(String str)
	{
		Select viwList=new Select(viewList);
		viwList.selectByVisibleText(str);
	}
	public void clickSelectView()
	{   waitForElement(10,accountsView);
		Select selectView=new Select(accountsView);
		selectView.selectByVisibleText("NewAccountName");
	}
	public void clickAccountsEdit()
	{
		waitForElement(10,accountsEdit);
		accountsEdit.click();
	}
	public void clickAccountsNew()
	{
		waitForElement(10,accountsNew);
		accountsNew.click();
	}
	public void enterViewNameField()
	{//NewAccountName
		waitForElement(10,viewNameField);
		viewNameField.sendKeys("AccountName");
	}
	//fieldType
	public void selectFieldType()
	{
		 waitForElement(10,fieldType);
		 Select selectType=new Select(fieldType);
		 selectType.selectByVisibleText("Account Name");
	}
	public void selectOperatorType()
	{
		 waitForElement(10,operatorType);
		 Select selectType=new Select(operatorType);
		 selectType.selectByVisibleText("contains");
	}
	public void enterValueAsA()
	{
		waitForElement(10,valueAs);
		valueAs.sendKeys("a");
	}
	public void saveViewButton()
	{
		waitForElement(10,saveView);
		saveView.click();
		
	}
	public void clickMergeAccounts()
	{
		waitForElement(10,mergeAccounts);
		mergeAccounts.click();
	}
	public void enterFindAccounts()
	{
		waitForElement(10,findAccountsText);
		findAccountsText.sendKeys("*a*");	
	}
	public void clickFindAccounts()
	{   waitForElement(10,findAccountsButton);
		findAccountsButton.click();
	}
	public void clickAccount1()
	{
		waitForElement(10,selectAccount1);
		selectAccount1.click();
	}
	public void clickAccount2()
	{
		waitForElement(10,selectAccount2);
		selectAccount2.click();
	}
	public void clickAccount3()
	{
		waitForElement(10,selectAccount3);
		selectAccount3.isSelected();
	}
	public void clickNextButton()
	{
		waitForElement(10,nextButton);
		nextButton.click();
	}
	public void AcceptTheAlert()
	{   
		driver.switchTo().alert().accept();
	}
	public void clickMergeButton()
	{
		waitForElement(10,clickMerge);
		clickMerge.click();
	}
	//lastActivity
	public void clickLastActivity()
	{
		waitForElement(10,lastActivity);
		lastActivity.click();
	}
	public void clickDateField()
	{
		waitForElement(10,dateField);
		dateField.click();
	}
	public void selectCreatedDate()
	{
		waitForElement(10,createdDate);
		createdDate.click();
    }
	public void clickFromDate()
	{
		waitForElement(10,fromDate);
		fromDate.click();
	}
	public void clickFromToday()
	{
		waitForElement(10,fromToday);
		fromToday.click();
	}
	public void clickToDate()
	{
		waitForElement(10,toDate);
		toDate.click();
	}
	public void clickToToday()
	{
		waitForElement(10,toToday);
		toToday.click();
	}
	public void clickSaveReport()
	{
		waitForElement(10,saveReport);
		saveReport.click();
	}
	public void switchToPopup() throws InterruptedException
	{Thread.sleep(2000);
		driver.switchTo().activeElement();
	}
	public void moveToViewName()
	{
		Actions moveToView=new Actions(driver);
		moveToView.moveToElement(reportName).build().perform();
		reportName.sendKeys("FinalReport123");
	}
	public void moveToViewUniqueName()
	{
		Actions moveToViewUnique=new Actions(driver);
		moveToViewUnique.moveToElement(reportUniqueName).build().perform();
		reportUniqueName.click();
	}
	public void clickSaveAndRun() throws InterruptedException
	{  Thread.sleep(3000);
	   Actions clickSaveAndrun=new Actions(driver);
	   clickSaveAndrun.moveToElement(saveAndRunButton).build().perform();
	   waitForElement(10,saveAndRunButton);
	   clickSaveAndrun.doubleClick(saveAndRunButton).build().perform();
		
	}
	public void validateNewAccount(String str)
	{
		waitForElement(10,newAccName);
		String actual=newAccName.getText();
		String expected=str;
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
	
	
	
	
	
	
	

}
