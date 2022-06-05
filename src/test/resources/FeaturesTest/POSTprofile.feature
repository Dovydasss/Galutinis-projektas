Feature: POSTprofile endpoint

  Scenario: TEST all POSTS by rest endpoint
    When The user sends POST request to the member endpoint
    Then A new POST of memeber is displayed
    When The user sends POST request to the team endpoint
    Then A new POST of team is displayed
    When The user sends POST request to the mission endpoint
    Then A new POST of mission is displayed