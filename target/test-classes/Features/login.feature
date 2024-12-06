
Feature: Facebook login feature
 
  
  Scenario: facebook login with valid credentials
    Given user is on login page
    And user enters valid "vrane" and "pass"
    When click on login Button
    Then user navigated to homepage

  