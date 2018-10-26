#DEfinir el Autor  el feature y el Scenario correspondiente segun la estructura.
#Author: brahianr
Feature: SteptoStep Job
  As a Web User  
  I want to use Computrabajo
  to search job in different companies and countries

  Scenario: Search job in another country
    Given that vlady opens his browser at computrabajo Home Page
    And he goes to option of search
    When he search the word proyecto
    Then he should see the options of job in the screen
