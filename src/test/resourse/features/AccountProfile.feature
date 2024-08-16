Feature: Account profile feature

  Background: Login to to account and setups
    Given user click on "Sign in" link
    Then validate user is in sign in page
    When user enter "amena90@@gmail.com" on "Email" field
    When user enter "Password@123" on "Password" field
    When user click on "Login" button
    Then user should be able to see account link
    Given user click on "Account" link

  @UserStory5
  Scenario: Change Name and phone number and validate
    Then validate user is in account page
    When user enter "Amena" on "Name" field
    When user enter "5073346639" on "Phone Number" field
    When user click on "Update" button
    Then validate Toast Displayed
    When wait for 5 seconds
    Then validate account name is "Amena"
    When user enter "Baha" on "Name" field
    When user enter "5073346639" on "Phone Number" field
    When user click on "Update" button
    Then validate Toast Displayed