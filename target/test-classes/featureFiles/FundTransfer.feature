
 @FundSmoke
Feature: Fund Transfer feature
  
    
    Background:user should register or login first then only transfer the funds
    Given user should be on parabank homepage
    When user enter the valid username "Rakesh313"
    And user enter the valid password "Password123"
    And clicks on login button
    Then user should login successfully
   
    Scenario: Successfull fund transfer between accounts
    When user clicks on transfer funds from the menu
    Then user should be redirected to the fund transfer page
    When user select the following accounts to fund transfer 0 and 0
    And  user enter the amount "25"
    And  clicks on the transfer button 
    Then user verify the transfer amount as a confirmation message is displayed
    
    
    When user clicks on account overview
    And  user clicks on receiver account number
    Then user should see the transfered listed in the account details
    
    