@tag
Feature: Test the chat feature of whatapp
  I want to send a file to a user to see if the chat is working and the delivery status is shown

  @tag1
  Scenario: Chat feature of sending docs in attachment
    Given I launch whatsapp app on my phone
    When I initiate a new chat
    Then I select a contact from the list of users
    When I send a random file to that contact
    Then I see that the random file sent to that contact successfully