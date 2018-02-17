@AlreadyUser
Feature: AlreadyUser

  Scenario: As a registered user i don't want to register twice
    Given that i am already on the Home Page
    And i click sign in button
    And i enter my registered email address in to the email field for new user
    And click on create an account button
    Then i should have an error message that An account using this email address has already been registered. Please enter a valid password or request a new one.
