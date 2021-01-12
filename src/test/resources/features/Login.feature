Feature: Login

  Agile Story:As a user, I should be able to login with correct credentials to different accounts
#This is how you comment in feature file

  @librarian @smoke
  Scenario: Librarian login scenario

    Given user is on the login page
    When user logs in as librarian
    Then user should be able to see the dashboard
@student
  Scenario:Student login scenario

    Given user is on the login page
    When user logs in as student
    Then user should be able to see the dashboard
@Employee, @Sunday
  Scenario:Admin login scenario

    Given user is on the login page
    When user logs in as Admin
    Then user should be able to see the dashboard