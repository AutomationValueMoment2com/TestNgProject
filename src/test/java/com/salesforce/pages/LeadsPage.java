package com.salesforce.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class LeadsPage extends BasePage
{

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}
	//Leads Tab
	@FindBy(xpath="//a[@title='Leads Tab']")
	WebElement leadsTab;
	//Lead view
	@FindBy(id="fcf")
	WebElement leadView;
	//Go button
	@FindBy(xpath="//input[@title='Go!']")
	WebElement goButton;
	//Validate Todays Lead after Go
	@FindBy(id="00BDm0000046aHP_listSelect")
	WebElement leadAfterGo;
	//Leads New Button
	@FindBy(xpath="//input[@name='new']")
	WebElement newButton;
	//LastName
	@FindBy(id="name_lastlea2")
	WebElement lastName;
	//company Name
	@FindBy(id="lea3")
	WebElement companyName;
	//save button
	@FindBy(xpath="//td[@class='pbButton']//input[@title='Save']")
	WebElement saveButton;
	//h2[contains(text(),'ABC')]
	//New Leadname
	@FindBy(xpath="//h2[@class='topName']")
	WebElement newLeadName;
	public void clickLeadsTab()
	{
		 waitForElement(10,leadsTab);
		 leadsTab.click();
	}
	public void clickLeadView()
	{
		waitForElement(10,leadView);
		leadView.click();
	}
	public void ValidateLeadView()
	{
		waitForElement(10,leadView);
		String actualLeadView=leadView.getText();
		String expectedLeadView="Today's Leads";
		Assert.assertEquals(actualLeadView, expectedLeadView);
	}
	public void validateLeadViewDropdown()
	{
		Select viewDropDown=new Select(leadView);
		//get List of WebElements from select Dropdown
		List<WebElement>allOptions=viewDropDown.getOptions();
		//create another List<String>Array to add text of all webElements(from allOptions)
		List<String>expectedAllOptions = new ArrayList<String>();
		for (WebElement element : allOptions ) {
		expectedAllOptions.add(element.getText().toString());
		}
		//create one empty List<String>Array to add all Actual data
		List<String>actualAllOptions=new ArrayList<String>();
		//Adding List of Actual String items to actualAllOptions
		actualAllOptions.add("All Open Leads");
		actualAllOptions.add("My Unread Leads");
		actualAllOptions.add("Recently Viewed Leads");
		actualAllOptions.add("Today's Leads");
		actualAllOptions.add("View - Custom 1");
		actualAllOptions.add("View - Custom 2");
		//compare Actual List with Expected List
		Assert.assertEquals(actualAllOptions, expectedAllOptions);
		}
	public void selectTodayLeads()
	{
		Select viewDropDown=new Select(leadView);
		viewDropDown.selectByVisibleText("Today's Leads");
	}
	public void clickGo()
	{   waitForElement(10,goButton);
		goButton.click();	
	}
	public void getTitl()
	{
		driver.getTitle();
	}
	public void selectUnreadLeads()
	{
		Select viewDropDown=new Select(leadView);
		viewDropDown.selectByVisibleText("My Unread Leads");
	}
	public void validateLeadViewAfterGo()
	{Select viewDropDown=new Select(leadAfterGo);
		String actualOption=viewDropDown.getFirstSelectedOption().getText();
		System.out.println(actualOption);
		String expectedOption="Today's Leads";
		Assert.assertEquals(actualOption, expectedOption);
	}
	public void clickNewButton()
	{
		waitForElement(10,newButton);
		newButton.click();	
	}
	public void enterLastName(String str1)
	{
		waitForElement(10,lastName);
	   lastName.sendKeys(str1);	
	}
	public void enterCompanyName(String str2)
	{
		waitForElement(10,companyName);
		companyName.sendKeys(str2);	
	}
	public void saveButton()
	{
		waitForElement(10,saveButton);
		saveButton.click();	
	}
	public void validateNewLeadName(String str1)
	{
		String actualName=newLeadName.getText();
		String expectedName=str1;
		Assert.assertEquals(actualName, expectedName);
	}

}
