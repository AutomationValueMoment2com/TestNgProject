package com.salesforce.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesforce.base.BasePage;

public class LoginPage extends BasePage 
{
	//UserName
	@FindBy(id="username")
	WebElement userName;
	//Password
	@FindBy(id="password")
	WebElement password;
	//Login Button
	@FindBy(id="Login")
	WebElement loginButton;
	//Error Msg
	@FindBy(id="error")
	WebElement errorMsg;
	//Remember Me
	@FindBy(id="rememberUn")
	WebElement rememberMe;
	//ForgotPassword
	@FindBy(xpath="//a[text()='Forgot Your Password?']")
	WebElement forgotPassword;
	//Check Username and Password
	@FindBy(xpath="//div[contains(text(),'Please check your username and password.')]")
	WebElement checkErrorMsg;
	//img[@id='logo']
	@FindBy(xpath="//img[@id='logo']")
	WebElement salesLogo;
	
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	public void enterUserName(String strUserName)
	{
		userName.sendKeys(strUserName);
	}
	public void enterWrongUsername(String inCorrectUsername)
	{
		userName.sendKeys(inCorrectUsername);
	}
	public void getUsername()
	{
		userName.getText();
	}
	public void clearUsername()
	{
		userName.clear();
	}
	public void enterPassword(String strPassword)
	{
		password.sendKeys("aniljaiaadhya15");
	}
	public void enterWrongPassword(String inCorrectPassword)
	{
		password.sendKeys("22131");
	}
	public void clearPassword()
	{
		password.clear();
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public void validateErrorMsg()
	{   
		String actualErrorMsg=errorMsg.getText();
		String expectedErrorMsg="Please enter your password.";
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
	public void checkRememberMe()
	{
		rememberMe.click();
	}
	public void uncheckRememberMe()
	{
		rememberMe.click();
	}
	public void clickForgotPassword()
	{
		forgotPassword.click();
	}
	public void validateCheckUsernamePassword()
	{
		String actualErrMsg=checkErrorMsg.getText();
		String expectedErrmsg="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualErrMsg, expectedErrmsg);
	}
	public void getUrlLogInPage()
	{
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://login.salesforce.com/";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	public void ValidateLogInPageAfterLogOut() throws InterruptedException
	{   Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		String expectedTitle="Login | Salesforce";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
}
