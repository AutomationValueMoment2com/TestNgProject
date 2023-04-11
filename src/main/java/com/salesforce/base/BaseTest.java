package com.salesforce.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.salesforce.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	CommonUtilities common=new CommonUtilities();
	public WebDriver getDriver1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	public WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		return driver;
	}
	public String getUrl(String key) throws IOException
	{
		String url=common.getProperty(key);
		return url;
	}
	public void takeScreenshot(WebDriver driver)
	{//Here we are typecasting the driver object to TakesScreenshot(I)type
		TakesScreenshot screenShot=((TakesScreenshot)driver);
		//To get screenshot we are using getscreenshotAs() method & returns a File,
		//the result will be stored in scr file in jvm(no physical space)
		File scrFile=screenShot.getScreenshotAs(OutputType.FILE);
		//to get timestamp for each screenshot
		Date currentDate=new Date();
		String timeStamp=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);
		//so to make it readable we have to store in another destination file
		//first create a folder screenshot and give the path of the folder, file name and timestamp 
		String filePath="C:\\Users\\ja36h\\Jnanesh Assignments\\TestNGFrameworkPractice\\ScreenshotFolder\\SalesForceScreenShot"+timeStamp+".jpeg";
		//creating a new file
		File destFile=new File(filePath);
		//copy the scrFile to destFile
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}}
		
		
		
		
	
}
	
	


