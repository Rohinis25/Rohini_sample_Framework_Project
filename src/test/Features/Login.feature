
@mustRun
Feature: Account functionality
  @login1
  Scenario: Verify user is in the login page
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on My Account Menu
    Then verify user is in  the login page or not
    Then close browser

@login2
  Scenario: Login without password
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on My Account Menu
    Then user provides valid Email Address in login form "abcd@gmail.com"
    And Leave password field empty for login ""
    Then user clicks login button
    Then verify user is in  the login page or not
    Then Take a screenshot of the error message displayed
    Then close browser

  @login3
  Scenario:Checking lost your password functionality
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on My Account Menu
    Then user provides valid Email Address in login form "abcd@gmail.com"
    Then user click on lost password
    Then user provides email address again for reset password "abcd@gmail.com"
    Then user clicks Reset password button
    Then close browser
  @login4
Scenario:Password Change
  Given user opens the browser and navigates to "https://practice.automationtesting.in/"
  Then  Click on My Account Menu
  Then user provides valid Email Address in login form "rohini_s@ymail.com"
  And valid password for login "Selenium&25??"
  Then user clicks login button
  When user clicks on login button My Account page is loaded
  Then user clicks on Account Details button
  Then user provides First name "Rohini"
  And Last name "s"
  Then user provides current password "Selenium&25??"
  Then user provides New password "Selenium&25??"
  And confirm new password ,user enters new password again "Selenium&25??"
  Then click Save Changes button
  Then user takes the screenshot of password changed and stores it
  Then close browser
  @login5
  Scenario:Checking Remember me Functionality
    Given user opens the browser and navigates to "https://practice.automationtesting.in/"
    Then  Click on My Account Menu
    Then user provides valid Email Address in login form "rohini_s@ymail.com"
    And valid password for login "Selenium&25??"
    Then user clicks Remember me checkbox
    Then user clicks login button
    When user clicks on login button My Account page is loaded
    Then user opens another window in same browser
    Then close the My Account page window
    Then user navigates to "https://practice.automationtesting.in/my-account/" opened new window
    Then Verifying user can navigates to My account page without login
    Then user takes the screenshot and stores it
    Then close browser







