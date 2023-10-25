@all
Feature: Testing the Health Care Page

  Scenario: User tries to buy a new health care policy
    Given User on main page
    Then User clicks on Buy Now
    Then User enters following details
      | Name | Phone No   | Pincode |
      | Yoru | 9848223311 |  111111 |
    Then User selects from dropdown
    And Validate the user mobile number
    And user clicks on the star health logo
    And Close All the browsers