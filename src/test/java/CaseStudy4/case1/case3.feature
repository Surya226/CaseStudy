Feature: Search
 
Scenario Outline: Searching Product
    Given user open testmeapp
    When user click signIn button
    And user Enter "<username>" in the user id field
    And enter "<password>" in the password field
    And click on login
    Then Homepage is displayed
    When user search "<product>" in search field
    And click search button

    Examples:
      | username | password | product |
      |  Lalitha |  Password123| head |