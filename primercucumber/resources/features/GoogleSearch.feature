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
Feature: Busqueda por Google
  Yo como usuario quiero realizar una busqueda por google

  @tag1
  Scenario: Realizar una busqueda en Google
    Given que lanzo el navegador Chrome    
    When abro pagina de inicio de Google Chrome
    Then busco "el timepo del mañana" en Googles
   


