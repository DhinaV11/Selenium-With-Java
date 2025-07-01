Feature: Login functionality on Practice Test site
  @a1
  Scenario: Successful login with valid credentials
    Given user is on the Practice Test login page
    When user enters valid username and password
    And clicks the login button
    Then user should be navigated to the logged-in page
    # running tag wise
    # mvn test "-Dcucumber.filter.tags=@smoke"

@a1 @smoke
  Scenario: Login with invalid username
    Given user is on the Practice Test login page
    When user enters invalid username and valid password
    And clicks the login button
    Then user should see an error message "Your username is invalid!"
@a1
  Scenario: Login with invalid password
    Given user is on the Practice Test login page
    When user enters valid username and invalid password
    And clicks the login button
    Then user should see an error message "Your password is invalid!"
@a4 @smoke
  Scenario: Login with empty username and password
    Given user is on the Practice Test login page
    When user does not enter username and password
    And clicks the login button
    Then user should see an error message "Your username is invalid!"
