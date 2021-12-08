package com.vox.main.whatsapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChatPage extends BasePage {

	public ChatPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(id = "com.whatsapp:id/fab")
	MobileElement newChatButton;

	public void clickNewChatButton() {
		click(newChatButton);
	}

}
