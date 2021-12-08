@full
Feature: Test the chat feature of whatapp
  I want to send a file to a user to see if the document-sending(via attachment) is working and the delivery is successfull

  @TC01
  Scenario: AC_01 Chat feature of sending docs via attachment
    Given I launch whatsapp app on my phone
    When I initiate a new chat
    And I see a list of the users
    When I select a contact from the list of users
    And I send a random file to that contact from the list
    Then I see that the random file is sent to that contact successfully