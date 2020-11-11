@loginWithBackground
Feature: Login

  B 231:As a user, I should be able to login with correct credentials to different accounts
#This is how you comment in feature file

  Background:Backstory is that user is on the login page
    Given user is on the login page

  Scenario: Librarian login scenario


    When user logs in as librarian
    Then user should be able to see the dashboard

  Scenario:Student login scenario


    When user logs in as student
    Then user should be able to see the dashboard
@db
  Scenario:Admin login scenario

#BEFORE ANNOTATION RUNS HERE
#BEFORE STEP RUNS HERE
    When user logs in as Admin
  #AFTER STEP RUNS HERE
  #BEFORE STEP RUNS HERE
    Then user should be able to see the dashboard
  #AFTER STEP RUNS HERE
  #aFTER ANNOTATION RUNS HERE