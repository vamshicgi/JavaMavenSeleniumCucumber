Feature: feature to test login functionality

  Scenario: check login is successfull with valid credentials
    Given user is on login page
    When user entered userid and password
    And user clicked on login buttion
    Then user is navigated to home page