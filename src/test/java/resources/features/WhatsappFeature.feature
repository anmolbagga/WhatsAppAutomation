#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
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
