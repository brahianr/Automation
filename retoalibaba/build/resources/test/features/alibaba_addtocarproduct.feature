#Author: your.email@your.domain.com
Feature: Add to car a Product
    As a web user
   I want to use enter alibaba Page
   to and add to car product

  Scenario Outline: Title of your scenario outline
    Given that edison add to car a product
    When he search a product <product>
    And he select the product <numero> <quantity>
    And he add to car the product 
    Then he should see the product on the car

    Examples: 
      | product | numero | quantity |
      | pc      |     13 |        2 |
