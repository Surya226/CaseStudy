
Feature: Title of your feature
  I want to use this template for my feature file


  Scenario Outline: Login
    Given User clicks the SignIn button
    When User enters the "<Username>" 
    Then User entered the "<Password>" 

    Examples: 
      |Username |Password|
      | Lalitha |Password123 | 
      

