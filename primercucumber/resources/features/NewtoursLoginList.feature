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
Feature: Login usando lista
  Se hara el login con datos del datatable alamcenados
  en una lista

    @tag1
    Scenario: Login con usuarios validos
      Given se esta en la pagina de inicio de newtours
      When ingreso el username y el password
        | brahianr | 1234 |
      And hace click en el boton sing-on
      #Then se vera la pagina de registrar vuelos
    
    @tag2  
    Scenario: Login usando mapas
      Given se esta en la pagina de inicio de newtours
      When se ingresa el usuario y la clave
        | userName | password |
        | brahianr |     1234 |
      And hace click en el boton sing-on
  # Then se vera la pagina de registrar vuelos
  
  @tag3
  Scenario Outline: Login usando ejemplos de la tabla
    Given se esta en la pagina de inicio de newtours
    When usuario ingresa <user> y <pass>
    And hace click en el boton sing-on
    Examples: 
      | user     | pass   |
      | brahianr |   1234 |
      | bbq      | 123456 |
