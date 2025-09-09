
#@Smoke @Regression
Feature: login feature
  we need to validate the login feature

  @LoginSmoke1 @Smoke
  Scenario: login with valid username and password
    Given user should be on parabank homepage
    When user enter the valid username "Rakesh313"
    And user enter the valid password "Password123"
    And clicks on login button
    Then user should login successfully 

  @LoginSmoke2
  Scenario Outline: login with valid username nad password
    Given user should be on parabank homepage
    When user enter the valid username "<username>" and password "<password>"
    And clicks on login button
    Then user should login successfully 

    Examples: 
      | username  | password |
      | name1 | password12 | 
      | name2 | password23 |
