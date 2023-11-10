Feature: Test GitHub APIs using Rest Assured

  Scenario: get all the gitHub repos with authorization as bearer token
    Given User Enters GitHub base URL and Authentication
    When User executes HTTP get Method
    Then Validate the response status code
