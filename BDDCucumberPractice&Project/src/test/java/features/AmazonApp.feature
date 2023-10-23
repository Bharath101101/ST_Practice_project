@all
Feature: testing the Amazon WebPage
Scenario: user login into the amazon page
Given user enters the amazon web page
Then User hovers on some elements
Then user clicks on signin 
Then User enters Mobile Number 
|7416290609|Admin@1234|
Then user clicks on Sign in
Then Print Error message
And Close the Browser