package com.salesforce.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class OppurtunitiesPage extends BasePage {

	public OppurtunitiesPage(WebDriver driver)
	{
		super(driver);
		
	}
	//Oppurtunities Tab
	@FindBy(id="Opportunity_Tab")
	WebElement oppurtunitiesTab; 
	//viewDropdown
	@FindBy(id="fcf")
	WebElement viewDropdown;
	//New 
	@FindBy(xpath="//input[@name='new']")
	WebElement viewButton;
	//Oppurtunity Name
	@FindBy(id="opp3")
	WebElement oppurtunityName;
	//accountName
	@FindBy(id="opp4")
	WebElement accountName;
	//Account Name Lookup
	@FindBy(id="opp4_lkwgt")
	WebElement accountNameLookup;
	//search frame
	@FindBy(id="searchFrame")
	WebElement searchFrame;
	//Search Box
	@FindBy(id="lksrch")
	WebElement searchBox;
	//searchResults
	@FindBy(xpath="//a[text()='kavya1']")
	WebElement searchResults;
	//Go Button
	@FindBy(xpath="//input[@title='Go!']")
	WebElement goButton;
	//switch to Results Frame
	@FindBy(id="resultsFrame")
	WebElement resultsFrame;
	//close Date
	@FindBy(id="opp9")
	WebElement closeDate;
	//today
	@FindBy(xpath="//a[text()='Today']")
	WebElement today;
	//click Today Link
	@FindBy(xpath="//span[@class='dateFormat']//a")
	WebElement todayLink;
	//stage(select)
	@FindBy(id="opp11")
	WebElement stage;
	//probability
	@FindBy(id="opp12")
	WebElement probability;
	//Lead source
	@FindBy(id="opp6")
	WebElement leadSourc;
	//primary campaign source
	@FindBy(xpath="//img[@title='Primary Campaign Source Lookup (New Window)']")
	WebElement primarySourc;
	//save
	//oppurtunityPipeline
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement oppurtunityPipeline;
	//stuck oppurtunities
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckOppurtunities;
	//Quaterly Interval
	@FindBy(id="quarter_q")
	WebElement quaterlyInterval;
	//Quaterly Include
	@FindBy(id="open")
	WebElement quaterlyInclude;
	//Run Report
	@FindBy(xpath="//input[@title='Run Report']")
	WebElement runReport;
	//Save New Oppurtunity
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement save;
	//validate oppurtunity Pipeline
	@FindBy(xpath="//h1[text()='Opportunity Pipeline']")
	WebElement oppurPipelineValid;
	//Validate Stuck oppurtunities
	@FindBy(xpath="//h1[text()='Stuck Opportunities']")
	WebElement stuckOppurtunitiesValid;
	public void clickOppurtunitiesTab()
	{
		waitForElement(10,oppurtunitiesTab);
		oppurtunitiesTab.click();
	}
	public void validateViewDropdown()
	{
		Select viewDropDown=new Select(viewDropdown);
		//get List of WebElements from select Dropdown
		List<WebElement>allOptions=viewDropDown.getOptions();
		//create another List<String>Array to add text of all webElements(from allOptions)
		List<String>actualAllOptions = new ArrayList<String>();
		for (WebElement element : allOptions )
		{
	    //Here we are adding alloptions to actualAllOptions List
		actualAllOptions.add(element.getText().toString());
		}
		//create one empty List<String>Array to add all Expected data
		List<String>expectedAllOptions=new ArrayList<String>();
		//Adding List of Expected String items to expectedAllOptions
		expectedAllOptions.add("All Opportunities");
		expectedAllOptions.add("Closing Next Month");
		expectedAllOptions.add("Closing This Month");
		expectedAllOptions.add("My Opportunities");
		expectedAllOptions.add("New Last Week");
		expectedAllOptions.add("New This Week");
		expectedAllOptions.add("Private");
		expectedAllOptions.add("Recently Viewed Opportunities");
		expectedAllOptions.add("Won");
		//compare Actual List with Expected List
		Assert.assertEquals(actualAllOptions, expectedAllOptions);
		}
     public void clickViewButton()
       {
	    waitForElement(10,viewButton);
	    viewButton.click();	
       }
     public void enterOppurtunityName()
     {
    	 waitForElement(10,oppurtunityName);
    	 oppurtunityName.sendKeys("Equipment");
     }
     public void clickAccountName()
     {
    	 waitForElement(10,accountName);
    	 accountName.click(); 
     }
     public void enterAccountName()
     {
    	 waitForElement(10,accountName);
    	 accountName.sendKeys("kavya1"); 
     }
     public void switchToChilWindow() throws InterruptedException
     {Thread.sleep(5000);
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
     public void switchToSearchFrame()
     { 
    	 waitForElement(10,searchFrame);
    	 driver.switchTo().frame(searchFrame);
     }
     
     public void enterSearchBox() throws InterruptedException
     {  
    	 waitForElement(10,searchBox);
    	 searchBox.sendKeys("kavya1");
     }
     public void clickGoButton()
     {
    	 waitForElement(10,goButton);
    	 goButton.click(); 
     }
     public void switchToResultsFrame() throws InterruptedException
     {   Thread.sleep(6000);
    	 waitForElement(10,resultsFrame);
    	 driver.switchTo().frame(resultsFrame);
     }
     public void clickSearchResults()
     { 
    	 waitForElement(10,searchResults);
    	 searchResults.click(); 
    	 
     }
     public void switchToParentWindow() throws InterruptedException
     {   Thread.sleep(5000);
    	System.out.println(driver.switchTo().defaultContent());
     }
     public void clickCloseDate() throws InterruptedException
     {   Thread.sleep(5000);
    	 waitForElement(10,closeDate);
    	 closeDate.click(); 
     }
     public void clickToday()
     {
    	 waitForElement(10,today);
    	 Actions action=new Actions(driver);
    	 action.moveToElement(today).build().perform();
    	 today.click();
     }
     public void clickTodayLink()
     {
    	 waitForElement(10,todayLink);
    	 todayLink.click(); 	 
     }
     public void clickStage()
     {
    	 waitForElement(10,stage);
    	 Select stag=new Select(stage);
    	 stag.selectByVisibleText("Needs Analysis");
    	 
     }
     public void saveNewOppurtunity()
     {
    	 waitForElement(10,save);
    	 save.click(); 	 
     }
     public void clickOppurtunityPipeline()
     {
    	 waitForElement(10,oppurtunityPipeline);
    	 oppurtunityPipeline.click(); 
     }
     
     public void validationOfOppurtunityPipeline()
     {
    	 waitForElement(10,oppurPipelineValid);
    	 String actual=oppurPipelineValid.getText(); 
    	 String expected="Opportunity Pipeline";
    	 Assert.assertEquals(actual, expected);
     }
    
     public void clickStuckOppurtunities()
     {
    	 waitForElement(10,stuckOppurtunities);
    	 stuckOppurtunities.click(); 
     }
     public void validationOfStuckOppurtunities()
     {
    	 waitForElement(10,stuckOppurtunitiesValid);
    	 String actual=stuckOppurtunitiesValid.getText(); 
    	 String expected="Stuck Opportunities";
    	 Assert.assertEquals(actual, expected);
     }
     public void clickQuaterlyInterval()
 	{
    	 waitForElement(10,quaterlyInterval);
    	 quaterlyInterval.click();
 	}
     public void selectCurrentFQ()
 	{
 		Select availTabs=new Select(quaterlyInterval);
 		availTabs.selectByVisibleText("Current FQ");
 	}
     public void selectNextFQ()
  	{
  		Select availTabs=new Select(quaterlyInterval);
  		availTabs.selectByVisibleText("Next FQ");
  	}
     
     public void clickQuaterlyInclude()
  	  {
     	 waitForElement(10,quaterlyInclude);
     	quaterlyInclude.click();
  	  }
      public void selectAll()
  	  {
  		Select availList=new Select(quaterlyInclude);
  		availList.selectByVisibleText("All Opportunities");
  	  }
      public void selectOpen()
   	  {
   		Select availList=new Select(quaterlyInclude);
   		availList.selectByVisibleText("Open Opportunities");
   	  }
      public void selectClosed()
     	{
     		Select availList=new Select(quaterlyInclude);
     		availList.selectByVisibleText("Closed Opportunities");
     	}
      public void clickRunReport()
    	{
       	 waitForElement(10,runReport);
       	runReport.click();
    	}
     
     
   /*  public void noSuchWindowException() throws InterruptedException
     {try {
    	 Thread.sleep(5000);
         String parentid=driver.getWindowHandle();
         System.out.println(parentid);
    	 Set<String>s=driver.getWindowHandles();
    	 for(String windowid:s)
    		{
    		 System.out.println(windowid);
    		 if(!windowid.equals(parentid))
    		 driver.switchTo().window(windowid);
    		 Thread.sleep(5000);
    		 waitForElement(10,searchFrame);
        	 driver.switchTo().frame(searchFrame);
        	 waitForElement(10,searchBox);
        	 searchBox.sendKeys("kavya1");
        	 waitForElement(10,goButton);
        	 goButton.click(); 
        	 Thread.sleep(6000);
        	 waitForElement(10,resultsFrame);
        	 driver.switchTo().frame(resultsFrame);
        	 waitForElement(10,searchResults);
        	 searchResults.click(); 
    		}}
    	 catch (NoSuchWindowException e) {
    	      System.out.println("Unable to find the window: " + e.getMessage());
    	    } finally {
    	      driver.quit();
    	    }

     }*/
     
	}
	
	

