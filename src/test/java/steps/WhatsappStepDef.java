package steps;

import java.net.MalformedURLException;

import com.vox.main.whatsapp.ChatPage;
import com.vox.main.whatsapp.RecentFilesPage;
import com.vox.main.whatsapp.SelectContactPage;
import com.vox.main.whatsapp.UserChatPage;
import com.vox.test.whatsapp.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatsappStepDef extends BaseTest {

	ChatPage chatPage;
	RecentFilesPage recentFilesPage;
	SelectContactPage selectContactsPage;
	UserChatPage userChatPage;

	@Given("I launch the whatsapp app on my phone")
	public void i_launch_the_whatsapp_app_on_my_phone() throws MalformedURLException {
		setUp();
		chatPage = new ChatPage(driver);
		recentFilesPage = new RecentFilesPage(driver);
		selectContactsPage = new SelectContactPage(driver);
		userChatPage = new UserChatPage(driver);
	}

	@When("I initiate a new chat")
	public void i_initiate_a_new_chat() {
		chatPage.clickNewChatButton();
	}

	@When("I select users from the user list")
	public void i_select_users_from_the_user_list() {
		selectContactsPage.clickContactIntheContactList();
	}

	@When("I send a document to the user as attachment")
	public void i_send_a_document_to_the_user_as_attachment() {
		userChatPage.clickAttachmentIcon();
		userChatPage.clickDocumentIcon();
		recentFilesPage.clickRecentFile();
		recentFilesPage.clickSendButton();
	}

	@Then("I see that the file is sent to the user")
	public void i_see_that_the_file_is_sent_to_the_user() {
		userChatPage.verifyElementPresentforDeleiveryStatus();
		tearDown();
	}

}
