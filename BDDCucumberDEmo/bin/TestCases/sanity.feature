@tag
Feature: sanity testcases for facebook
 

  @tag1
  Scenario: Login to facebook
    Given User open chrome browser
    And Enter Url
    When User enters username and password
    And Click on login button
    Then Login should be succesfull
   	And click on home hyperlink

   
   