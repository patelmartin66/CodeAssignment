Feature: Positive Test Scenarios

  Scenario: input data for all fields
    Given User launches the application
    When user enters the data for all fields
    When user submits the form
    Then positeve Response message will be displayed

  Scenario: input data for all fields
    Given User launches the application
    When user enters the data for mandatory fields
    When user submits the form
    Then positeve Response message will be displayed
    
     Scenario: input data for all fields
    Given User launches the application
    When user skips the data for mandatory fields
    When user submits the form
    Then error Response message will be displayed
    
  