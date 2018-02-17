@Login
Feature: Login


Scenario Outline: As a registered user, i want to Login Successfully
  Given that i am already on the Home Page
  And i can see a Logo Banner
  When i click sign in button
  And i enter email address "<email>" details
  And i enter the password "<password>" details
  And i click the Login Button
  Then i should be logged in successfully.
  And sign out
 # And Close the page

  Examples:
  | email                                     | password   |
  | oshingbengaone@gmail.com                  | jesusislord|
  | oshingbenga@gmail.com                     | jesusislord|

