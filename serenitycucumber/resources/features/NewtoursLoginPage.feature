#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Valido
  Se prueba un login valido 

  @tag1
  Scenario: Se ingresa con usuario valido
    Given el usuario esta en la pagina de inicio de newtours
    When el usuario ingrese usuario y clave valida
    And haga click en el boton login
    Then el usuario debera ver la pagina de registrar vuelos

