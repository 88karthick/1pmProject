@feature2
Feature: To validate Login funcationality of Facebook application

  Background: 
    Given User have to enter facebook login through chrome browser

  @value2
  Scenario: 
    To validate login by using valid email and invalid password

    When User have to enter Valid email and invalid password
      | username | Gowri            |
      | password |            45678 |
      | email    | greens@gmail.com |
    And user have to click login button
    Then user have to show credentials page

  @value3
  Scenario: 
      To validate login by using invalid email and invalid password

    When User have to enter INVALID email and invalid password
      | username    | password | mail      | course  |
      | automation1 | manual   | framework | tags    |
      | testng      | pom      | junit     | array   |
      | exception   | action   | robot     | testing |
    And user have to click login button
    Then user have to show credentials page
