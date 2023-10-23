Feature: Email page Test

  Scenario: New File for docString Practice
    When I reset my password on the email
    Then I should recieve an email with following content
      """
      Hello,
      please check on this to reset password
      Thanks
      """
