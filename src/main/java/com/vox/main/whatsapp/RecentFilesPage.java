package com.vox.main.whatsapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RecentFilesPage extends BasePage {

	public RecentFilesPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.google.android.documentsui:id/item_root')])[1]")
	MobileElement recentFile;
	
	@AndroidFindBy(id = "android:id/button1")
	MobileElement sendButton;

	public void clickRecentFile() {
		click(recentFile);
	}

	public void clickSendButton() {
		click(sendButton);
	}

}
