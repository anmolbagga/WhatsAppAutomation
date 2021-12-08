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

	@Given("I launch whatsapp app on my phone")
	public void i_launch_whatsapp_app_on_my_phone() throws MalformedURLException {
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

	@Then("I select a contact from the list of users")
	public void i_select_a_contact_from_the_list_of_users() {
		selectContactsPage.clickContactIntheContactList();
	}

	@When("I send a random file to that contact")
	public void i_send_a_random_file_to_that_contact() {
		userChatPage.clickAttachmentIcon();
		userChatPage.clickDocumentIcon();
		recentFilesPage.clickRecentFile();
		recentFilesPage.clickSendButton();
	}

	@Then("I see that the random file sent to that contact successfully")
	public void i_see_that_the_random_file_sent_to_that_contact_successfully() {
		userChatPage.verifyElementPresentforDeleiveryStatus();
		tearDown();
	}

}
