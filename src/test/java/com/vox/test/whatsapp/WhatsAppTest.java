package com.vox.test.whatsapp;

import org.testng.annotations.Test;

import com.vox.main.whatsapp.ChatPage;
import com.vox.main.whatsapp.RecentFilesPage;
import com.vox.main.whatsapp.SelectContactPage;
import com.vox.main.whatsapp.UserChatPage;

public class WhatsAppTest extends BaseTest {
	
	ChatPage chatPage;
	RecentFilesPage recentFilesPage;
	SelectContactPage selectContactsPage;
	UserChatPage userChatPage;
	
	@Test
	public void testWhatsapp() {
		chatPage = new ChatPage(driver);
		recentFilesPage = new RecentFilesPage(driver);
		selectContactsPage = new SelectContactPage(driver);
		userChatPage = new UserChatPage(driver);
		
		chatPage.clickNewChatButton();
		selectContactsPage.clickContactIntheContactList();
		userChatPage.clickAttachmentIcon();
		userChatPage.clickDocumentIcon();
		recentFilesPage.clickRecentFile();
		recentFilesPage.clickSendButton();
		userChatPage.verifyElementPresentforDeleiveryStatus();
	}
	

}
