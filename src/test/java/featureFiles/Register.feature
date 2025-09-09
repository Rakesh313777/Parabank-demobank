

#@smoke @regression
Feature: Register feature
  Enter the valid register details

  @RegisterSmoke1 @Smoke
  Scenario: Enter all valid registration details 
    Given user should be on parabank Registration page
    When user enter the valid firstName "rakesh"
    And user enter the valid lastName "chir"
    And user enter the valid address "hyd"
    And user enter the valid city "hyd"
    And user enter the valid state "tenagana"
    And user enter the valid zipCode "500072"
    And user enter the valid phoneNumber "798982"
    And user enter the valid ssNumber "3454"
    And user enter the valid username1 "Rakesh3131"
    And user enter the valid password1 "Password123"
    And user enter the valid confirmPassword "Password123"
    And user clicks on registerButton
    Then Success message should be displayed
    
    
 

  @RegisterSmoke2
  Scenario Outline: Enter all valid registration details 
    Given user should be on parabank Registration page
    When user enter the valid firstName "<fname>" and lastName "<lname>" and address "<address>" and city "<city>" and state "<state>" and zipCode "<zipCode>" and phoneNumber "<phoneNumber>" and ssNumber "<ssNumber>" and username "<username>" and password "<password>" and confirmPassword "<confirmPassword>"
    And user clicks on registerButton
    Then Success message should be displayed
    
    Examples: 
      | fname | lname  | address   |  city | state  | zipCode | phoneNumber | ssNumber | username | password | confirmPassword |
      | name1 | lname1 | address1  |   hyd | telan  |     5   | 7989        |     3    | user1    | pass1    | pass1           |
      | name2 | lname2 | address2  | beng  | karnar |    7    | 4563        |    4     | user2    | pass2    | pass2           |
