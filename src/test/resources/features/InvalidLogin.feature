@InvalidLogin

Feature: Invalid Login


  Scenario Outline: As a registered user, i want to see error message when i enter invalid email or password
    Given that i am already on the Home Page
    And i can see a Logo Banner
    When i click sign in button
    And i enter email address "<email>" details
    And i enter the password "<password>" details
    And i click the Login Button
    Then i should see error message "<error>" details
#    And Close the page

    Examples:
      | email                                     | password   |error                       |
      | oshingbenga@gmail.com                     | jesus      | Invalid password.          |
      | oshin@gmail.com                           | jesusislord| Authentication failed.     |
      | oshingbenga@gmail.com                     |            | Password is required.      |
      |                                           | jesusislord| An email address required. |
      |                                           |            | An email address required. |

