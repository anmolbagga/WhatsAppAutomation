package com.vox.main.whatsapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectContactPage extends BasePage {

	public SelectContactPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.whatsapp:id/contactpicker_text_container')])")
	MobileElement contactList;

	@AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.whatsapp:id/contactpicker_text_container')])[3]")
	MobileElement contactInContactList;

	public void clickContactIntheContactList() {
		click(contactInContactList);
	}
	
	public boolean verifyContactListIsThere() {
		return verifyElementPresent(contactList);
	}

}
