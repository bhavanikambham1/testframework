@login  @regression
Feature: login Functionality


  Scenario: Unsuccessful login with invalid entries
    When I enter username as "username@abc.com" and password as "abcd"
    And I click login button
    Then verify that error message displayed

  Scenario: Unsuccessful login with empty entries
    When I enter username as "" and password as ""
    Then I should not able to click Log in button

  Scenario: Unsuccessful login with valid username and invalid password
    When I enter username as "sajid.chudesara@gildedco.com" and password as "abcd"
    And I click login button
    Then verify that error message displayed

  Scenario: Unsuccessful login with empty username and invalid password
    When I enter username as "" and password as "abcd"
    Then I should not able to click Log in button
  @test
  Scenario:Successful login with valid credentials
    Given I enter user name as "sajid.chudesara@gildedco.com" and password as "password"
    And I click login button
    Then I verify that navigated dashboard page successfully






