@regression
Feature: Login Functionality
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke
  Scenario: User should navigate to the login page successfully
    Given I am on the home page
    When I click on the login link
    Then I should see the message "Welcome, Please Sign In!"

  @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on the home page
    When I click on the login link
    And I enter "<email>" in the email field
    And I enter "<password>" in the password field
    And I click on the login button
    Then I should see an error message "<errorMessage>"
    Examples:
      | email                 | password | errorMessage                                                                                |
      | hardikp2812@gmail.com | patel0009  | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | hardikp28@gmail.com  | patel12345 | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | hardikp123@gmail.com  | patel7878 | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |



  Scenario: Verify that the user should log in successfully with valid credentials
    Given I am on the home page
    When I click on the login link
    And I enter "shreepatel9612@gmail.com" in the email field
    And I enter "Shree@7777" in the password field
    And I click on the login button
    Then I should see the log out link displayed


  Scenario: Verify that the user should log out successfully
    Given I am on the home page
    When I click on the login link
    And I enter "shreepatel9612@gmail.com" in the email field
    And I enter "Shree@7777" in the password field
    And I click on the login button
    And I click on the log out link
    Then I should see the login link displayed