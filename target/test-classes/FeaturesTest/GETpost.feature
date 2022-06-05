Feature: GETpost endpoint

  Scenario: Fetch all GETS by rest endpoint
    When The user sends GET request to the member endpoint
    Then A list of members is displayed
    When The user sends GET request to the mission endpoint
    Then A list of missions is displayed
    When The user sends GET request to the team endpoint
    Then A list of teams is displayed





