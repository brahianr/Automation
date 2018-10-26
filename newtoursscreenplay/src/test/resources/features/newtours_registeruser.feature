#Author: your.email@your.domain.com
Feature: Newtours Register User
  As a web user
   I want to use enter NewTours Page
   to and register on the page

  Scenario Outline: Title of your scenario outline
    Given that brahian wants register on newtours
    When he clicks on the link register
    And he registers with the following data
      | firstName   | lastName   | phone   | email   | address1   | address2   | city   | state   | postalCode   | country   | userName   | password   | confirmPassword   |
      | <firstName> | <lastName> | <phone> | <email> | <address1> | <address2> | <city> | <state> | <postalCode> | <country> | <userName> | <password> | <confirmPassword> |
    Then he should see the message registration successful

    ##<firstName> <lastName> <phone> <email> <address1> <address2> <city> <state> <postalCode> <country> <userName> <password> <confirmPassword>
    Examples: 
      | firstName | lastName | phone | email      | address1 | address2 | city      | state  | postalCode | country  | userName | password | confirmPassword |
      | pepe      | carro    |  1233 | pepe@g.com | calle2   | calle4   | medelllin | narnia |      07562 | COLOMBIA | pepe2    |     1234 |            1234 |
