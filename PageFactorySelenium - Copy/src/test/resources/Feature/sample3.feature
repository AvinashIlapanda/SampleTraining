Feature:

Scenario: To check the login Functional
Given: User opens the Browser
And User navigates to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" Webpage
When user enters the login Credentials
|TestData123.xlsx|
And User click the Login button
Then User verifies the Profile account
And User closes the Browser
