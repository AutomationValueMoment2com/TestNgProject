package com.salesforce.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.salesforce.base.BasePage;

public class RemindMeLaterPage extends BasePage
{
public RemindMeLaterPage(WebDriver driver)
{
		super(driver);
}

@FindBy(xpath="//a[text()='Remind Me Later']")
WebElement remindMeLater;
public void clickRemindMeLater()
{   
	waitForElement(15,remindMeLater);
	remindMeLater.click();
}

}
