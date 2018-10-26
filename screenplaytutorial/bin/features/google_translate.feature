#Author: your.email@your.domain.com
Feature: Goolge Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages
      
  @tag1
  Scenario Outline: Translate from English to Spanish    
    Given that susan wants to translate a word
    When she translates the word <word> from English to Spanish
    Then she should see the word queso in the screen

    Examples: 
      | word   |
      | cheese |
      | good   |
