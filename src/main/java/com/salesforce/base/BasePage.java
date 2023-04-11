package com.salesforce.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
protected WebDriver driver;
	public BasePage(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void waitForElement(int time,WebElement element)
	{
	WebDriverWait wait=new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void switchToParentId()
	{
		String windowId=driver.getWindowHandle();
		driver.switchTo().window(windowId);
	}
	public void switchToDefault()
	{
		driver.switchTo().defaultContent();
	}
	public void switchToIFrame(WebElement frame)
	{
		driver.switchTo().frame(frame);
	}
	public void actionMoveToElement(WebElement element) 
	{   waitForElement(10,element);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}
