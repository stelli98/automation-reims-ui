
Feature: Login Feature
  @Positive
  Scenario: Login User As Admin
    Given user open Reims application
    When the user type 'ADMIN' in username input
    And the user enter 'ADMIN123' in password input
    And the user press login button
    Then user should see logout option
    When the user press add user button


  @Positive
  Scenario: Create User With Vehicle
    Given user open Reims application
    When the user type 'stella' in username input
    And the user enter 'stella123' in password input
    And the user press login button
    Then user should see logout option
