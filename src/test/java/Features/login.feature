Feature: Trendyol Login

  Background:

    Given I am on the Trendyol homepage
    When I click the pop up X button
    When I click the cookie accept button
    When I click the Sign In

  Scenario: 1.17 Login-Unregistered
    And I enter a valid email address in the Email field (Must not be a previously registered email)
    And I enter a valid password in the password field
    And I click the Sign In button
    Then I should see the user cannot log in successfully
    And I should see the receives Your email address and-or password is incorrect warning appears


