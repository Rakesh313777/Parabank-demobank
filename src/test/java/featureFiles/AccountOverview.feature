

@AccountOverviewSmoke
Feature: Accountoverview feature


Background: User should be on parabank page and login with valid username & password
    Given user should be on parabank homepage
    When user enter the valid username "Rakesh313"
    And user enter the valid password "Password123"
    And clicks on login button
    Then user should login successfully
    
    
Scenario:user should able to see the account overview
    When user clicks on account overview
    And  user clicks on receiver account number
    Then user should see the transfered listed in the account details