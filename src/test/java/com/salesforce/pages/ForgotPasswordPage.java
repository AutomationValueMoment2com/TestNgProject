package com.salesforce.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.salesforce.base.BasePage;

public class ForgotPasswordPage extends BasePage {
	public ForgotPasswordPage(WebDriver driver) 
	{
		super(driver);
	}
    //ForgotPassword
	@FindBy(id="un")
	WebElement userName;
	//ContinueButton
	@FindBy(id="continue")
	WebElement continueButton;
	
	public void enterUserName()
	{
		userName.sendKeys("kavya@value.com");
	}
	public void clickContinue()
	{
		continueButton.click();
	}
	

}
