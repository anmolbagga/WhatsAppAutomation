package com.vox.main.whatsapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserChatPage extends BasePage {

	public UserChatPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id = "com.whatsapp:id/input_attach_button")
	MobileElement attachmentIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Document']")
	MobileElement documentIcon;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.whatsapp:id/status'])[last()]")
	MobileElement deliveryStatusOfTheLastMessage;

	public void clickAttachmentIcon() {
		click(attachmentIcon);
	}
	
	public void clickDocumentIcon() {
		click(documentIcon);
	}
	
	public void verifyElementPresentforDeleiveryStatus() {
		verifyElementPresent(deliveryStatusOfTheLastMessage);
	}


}
