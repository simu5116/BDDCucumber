Feature: Application Login

Scenario: HomePage Valid
    Given User is on Net Banking landing page
    When User logs in with username "simran" and password "harjani"
    Then Home page is populated
    And cards are displayed
    
    
Scenario: HomePage Valid
    Given User is on Net Banking landing page
    When User logs in with username "dhiraj" and password "harjani"
    Then Home page is populated
    And cards are displayed    