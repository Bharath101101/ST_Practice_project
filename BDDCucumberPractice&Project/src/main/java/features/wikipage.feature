@all
Feature: Test the Wiki page on chrome browser

@create @functional
  Scenario: Test create account on wikki oage
    Given User is on main page
    Then User Enters username
    And User Enters password
@login @functional
  Scenario: Test create account on wikki oage
    Given User is on main page
    When User clicks on login page
    Then User clicks on check box on login page
    Then User clicks on forgot your passowrd Link
