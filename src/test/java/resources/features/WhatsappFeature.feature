@tag
Feature: Test the chat feature of whatapp
  I want to send a file to a user to see if the chat is working and the delivery status is shown

  @tag1
  Scenario: Chat feature of sending docs in attachment
    Given I launch the whatsapp app on my phone
    When I initiate a new chat
    And I select users from the user list
    And I send a document to the user as attachment
    Then I see that the file is sent to the user