@ManageUserPersonal
Feature: Manage User Personal

  @Positive @AdminFeature
  Scenario: Create User With Vehicle
    Given user open Reims application
    When the user type 'ADMIN' in username input
    And the user enter 'ADMIN123' in password input
    And the user press login button
    Then user should see logout option
    When the user press add user button
    And the user type 'louis' in username input in create user form
    And the user type 'louis123' in  password input in create user form
    And the user click role 'ADMIN' in create user form
    And the user select date of birth to first Date of Month in create user form
    And the user click gender 'FEMALE' in create user form
    And the user click division 'TECHNOLOGY' in create user form
    And the user choose 'yes' for having vehicle
    And the user type 'BL 123 A' in license input in create user form
    And the user type 'Avanza Silver' in vehicle input in create user form
    And the user click save new user
    Then user should be on manage user page

  @Positive @AdminFeature
  Scenario: Create User Without Vehicle
    Given user open Reims application
    When the user type 'ADMIN' in username input
    And the user enter 'ADMIN123' in password input
    And the user press login button
    Then user should see logout option
    When the user press add user button
    And the user type 'bianca' in username input in create user form
    And the user type 'bianca123' in  password input in create user form
    And the user click role 'USER' in create user form
    And the user select date of birth to first Date of Month in create user form
    And the user click gender 'MALE' in create user form
    And the user click division 'TECHNOLOGY' in create user form
    And the user choose 'no' for having vehicle
    And the user click save new user
    Then user should be on manage user page

  @Positive @AdminFeature
  Scenario: Delete User
    Given user open Reims application
    When the user type 'ADMIN' in username input
    And the user enter 'ADMIN123' in password input
    And the user press login button
    Then user should see logout option
    When user see 'bianca' user card
    And user press delete button inside 'bianca' user card of an user
    And user should not see 'bianca' user card





