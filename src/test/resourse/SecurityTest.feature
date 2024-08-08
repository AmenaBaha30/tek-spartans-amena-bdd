Feature: Security tests scenarios

  Scenario: validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "amena.baha2020@gmail.com" and "AfghanIstan90" and click on login
    Then user should be able to see account link

  Scenario Outline: Validate sign in with invalid credentials
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "<username>" and "<password>" and click on login
    Then user should see error "wrong username or password"

    Examples:
      | userName                   |  |password
      | invalid@gmail.com          |  | password@123      |
      | "amena.baha2020@gmail.com" |  |"AfghanIstan90"|
      | "amena.baha2020@gmail.com" |  | "notpassword@11"|