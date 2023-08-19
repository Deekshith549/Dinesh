


Feature: Verify products page URL
Background:
    Given the user launches the website
Scenario: User click on the products link and verify the URL
    Given the user launches the website
    When the user click on the products link
    Then the user should be redirected to a products page with URL containing products  
    
    
    Scenario: User click on the Depositor link and verify the URL
    Given user launches the website
    When user click on the Depositor link
    Then user should be redirected to a Depositor page with URL containing products  
   