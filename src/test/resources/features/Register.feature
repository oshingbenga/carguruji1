@Register

Feature: Register

  Scenario: First time customer
    Given that i am already on the Home Page
    And i click sign in button
    And i enter new email address into the email field
    Then click on create an account button
    And a form called Your Personal Information page display
    And i select Mr
    And i type in my First Name into the field provided
    And i type in my Last Name into the field provided
    And My email display
    Then i enter password into the password field
    And i select Date Of Birth from the combo
    Given my Fists name
    And my Last Name
    And my Address
    And my City
    And my State
    And my Post Code
    And my Country
    And enter Additional Information
    Then enter Home Phone No
    And Mobile Phone No
    And Assign an alias for future reference
    #Then Click Register Button
   #And i can see a welcome Message


