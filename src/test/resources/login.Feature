Feature: Login

  Scenario: Login with Valid Username and Password
    Given user is on login page
    When user input email text box with "standard_user"
    And user input password text box with "secret_sauce"
    And user click login button
    Then User will redirect to homepage

  
