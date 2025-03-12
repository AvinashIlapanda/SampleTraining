Feature: 
@SmokeTest
Scenario: To check title of the Application
Given: User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
Then User verifies the title of the Webpage
And User closes the Browser

Scenario Outline: To check the login Functional
Given: User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When user enters '<Username>' the username
And User enters '<Password>' the password
And User click the Login button
Then User verifies the Profile account
And User closes the Browser
Examples: 
|Username|Password|
|Admin|admin123|
|Admin|admin123|
