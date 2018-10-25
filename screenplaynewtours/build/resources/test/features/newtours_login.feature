#Author: your.email@your.domain.com
Feature: Newtours Loggin
   As a web user
   I want to use enter NewTours Page
   to and log in on the page
  @tag1
  Scenario Outline: Enter the register flight page
    Given that brahian wants login on newtours
    When he enter your username and password
      | userName   | password   |
      | <userName> | <password> |
    Then he should see the find flight page

    Examples: 
      | userName | password |
      | brahianr |     1234 |
##      | brer     |    12234 |
