Feature: Testing different request on the virgin games

  Scenario: Check if the virgin games can be accessed by users
    When I send a GET request with currency "GBP" endpoints
    Then I must get a valid status code 200
    Then I must verify all data has currency "GBP"