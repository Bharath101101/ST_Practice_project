Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for login page
    Given I am on tutorialsNinja Homepage
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter the password as '<password>' on the page
    Then I click login button
  Examples: 
  |EmailId|pwd|
  |seleniumdemo@gmail.com|123456|
