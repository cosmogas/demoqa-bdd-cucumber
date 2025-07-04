Feature: Login to demoqa

  Scenario: Successful login
    Given user opens login page
    When user logs in with username "testuser" and password "Test1234!"
    Then dashboard should show username "testuser"

  Scenario: User adds and verifies a new table entry
    Given user opens web tables page
    When user adds new person with name "Ivan" and email "ivan@example.com"
    Then table should contain entry with name "Ivan" and email "ivan@example.com"

  Scenario: User deletes a table entry
    Given user opens web tables page
    When user deletes entry with name "Cierra"
    Then table should not contain entry with name "Cierra"


  Scenario: Verify ToolsQA home page title
    Given user opens ToolsQA home page
    Then page title should be "DEMOQA"


  Scenario: User sees Elements section on home page
    Given user opens ToolsQA home page
    Then section "Elements" should be visible









