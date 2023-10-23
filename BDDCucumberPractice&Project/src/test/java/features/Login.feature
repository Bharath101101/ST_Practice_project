Feature: Testing rediff mypage

  Background: 
    Given I open the rediff mypage
    Then I capture the title of the page
    When I enter username and password
    Then I click on login button


  Scenario: User has to test if login on rediff is successful or not
    And I should see an error message
    Then I click on Click Here link
    And I close the browser

     Scenario: 
    Then I click on Create a Rediffmail account
    Then I capture the title of the page
    And I close the browser