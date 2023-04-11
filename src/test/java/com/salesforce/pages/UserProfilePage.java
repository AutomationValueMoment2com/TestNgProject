package com.salesforce.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.salesforce.base.BasePage;
public class UserProfilePage extends BasePage {
	public UserProfilePage(WebDriver driver) 
	{
		super(driver);
		
	}//EditPen
	@FindBy(xpath="//div[@class='editPen']/child::a[@class='contactInfoLaunch editLink']")
	WebElement penEdit;
	//About Tab
	@FindBy(xpath="//a[normalize-space(text())='About']")
	WebElement aboutTab;
	//Contact Tab
	@FindBy(xpath="//a[normalize-space(text())='Contact']")
	WebElement contactTab;
	//iFrame2
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement iframe2;
	//Lastname in About tab
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	//firstName
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	//Save All Button
	@FindBy(xpath="//input[@class='zen-btn zen-primaryBtn zen-pas']")
	WebElement saveAll;
	//Email in Contact Tab
	@FindBy(id="email")
	WebElement email;
	//Post Link
	@FindBy(xpath="//a[@id='publisherAttachTextPost']//span[@class='publisherattachtext ']")
	WebElement postLink;
	//iframe1
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement iframe1;
	//PostLink Textarea
	@FindBy(xpath="//body[@class='chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr placeholder cke_show_borders']")
	WebElement postLinkTextarea;
	//Share Button
	@FindBy(id="publishersharebutton")
	WebElement shareButton;
	//File Link
	@FindBy(xpath="//a[@title='File']")
	WebElement fileLink;
	//upload a file
	@FindBy(xpath="//a[contains(text(),'Upload a file ')]")
	WebElement uploadFile;
	//Choose File
	@FindBy(id="chatterFile")
	WebElement chooseFile;
	//share
	@FindBy(xpath="//input[@value='Share']")
	WebElement share;
	//Profile Image
	@FindBy(xpath="//span[contains(@class,'profileImage chatter-avatarFull chatter-avatar')]")
	WebElement profileImage;
	//Add Photo link
	@FindBy(id="uploadLink")
	WebElement photoLink;
	//iFrame addphoto
	@FindBy(id="uploadPhotoContentId")
	WebElement iframeUploadPhoto;
	//clickPhoto chooseFile
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
	WebElement photoChooseFile;
	//show my photo public
	@FindBy(id="j_id0:uploadFileForm:photoVisibility")
	WebElement showMyPhoto;
	//save profile photo button
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement savePhoto;
	@FindBy(xpath="//iframe[@title='sessionserver']")
	WebElement parentIframe;
	//crop the photoIframe
	@FindBy(id="uploadPhotoContentId")
	WebElement cropIframe;
	//show my photo public
	@FindBy(xpath="//input[@name='j_id0:j_id7:j_id9']")
	WebElement showPublic;
	//save crop photo
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	WebElement saveCrop;
	
	public void clickEditPen()
	{
		waitForElement(10,penEdit);
		penEdit.click();
	}
	
	public void switchToFrame2() throws InterruptedException
	{   Thread.sleep(3000);
		waitForElement(10,iframe2);
		driver.switchTo().frame(iframe2);
	}
	public void clickAboutTab()
	{
		waitForElement(10,aboutTab);
	    aboutTab.click();
		
	}
	
	public void firstNameIsFocused()
	{
		waitForElement(10,firstName);
		firstName.isSelected();
		
	}
	
	public void clickLastname()
	{
		waitForElement(10,lastName);
		lastName.click();
	}
	public void clearLastname()
	{
		waitForElement(10,lastName);
		lastName.clear();
	}
	public void enterLastname(String name)
	{
		waitForElement(10,lastName);
		lastName.sendKeys(name);
	}
	public void clickSaveall()
	{
		waitForElement(10,saveAll);
		saveAll.click();
	}
	public void clickContactTab()
	{
		waitForElement(10,contactTab);
		contactTab.click();
	}
	public void clickEmail()
	{
		waitForElement(10,email);
		email.click();
	}
	/*public void switchToParentWindow() throws InterruptedException
	{   Thread.sleep(5000);
		switchToParentId();
	}*/
	public void clickPostLink()
	{   
		waitForElement(10,postLink);
		postLink.click();	
	}
	public void switchToFrame1()
	{
		waitForElement(10,iframe1);
		driver.switchTo().frame(iframe1);
	}
	public void enterPostLinkText(String enterText)
	{   
		waitForElement(10,postLinkTextarea);
		postLinkTextarea.sendKeys(enterText);	
	}
	public void clickShareButton()
	{   
		waitForElement(10,shareButton);
		shareButton.click();	
	}
	public void clickFileLink()
	{   
		waitForElement(10,fileLink);
		fileLink.click();	
	}
	public void clickUploadFile()
	{   
		waitForElement(10,uploadFile);
		uploadFile.click();	
	}
	public void clickchooseFile()
	{
		waitForElement(10,chooseFile);
		chooseFile.click();

	}
	public void filepathToChooseFile(String filePath)
	{
		waitForElement(10,chooseFile);
		chooseFile.sendKeys(filePath);
	}
	public void clickShare()
	{
		waitForElement(10,share);
		share.click();
	}
	public void hoverOnProfileImage()
	{
		actionMoveToElement(profileImage);
		
	}
	public void clickPhotoLink()
	{
		waitForElement(10,photoLink);
		photoLink.click();
		
	}
	public void switchToPhotoFrame()
	{
		switchToIFrame(iframeUploadPhoto);
	}
	public void filepathPhotoChooseFile(String photoPath)
	{
		waitForElement(10,photoChooseFile);
		photoChooseFile.sendKeys(photoPath);
	}
	
	public void selectShowMyPhoto()
	{
		waitForElement(10,showMyPhoto);
		showMyPhoto.click();
	}
	public void saveProfilePhoto()
	{
		waitForElement(10,savePhoto);
	    savePhoto.click();
	}
	
	public void switchToCropParentFrame()
	{
		switchToIFrame(parentIframe);
	}
	public void switchToCropFrame() 
	{   
		switchToIFrame(cropIframe);
	}
	
	public void selectShowPublic()
	{
		
		waitForElement(15,showPublic);
		showPublic.click();
	}
	public void clickSaveCrop() throws InterruptedException
	{   
		waitForElement(10,saveCrop);
		actionMoveToElement(saveCrop);
		saveCrop.click();
	}
	
	}
	


