Feature: Filter movies by rating

  Scenario: Happy path only the chosen rating is shown
    When I filter movies by rating "PG-13"
    Then I should see "Men In Black"
    And I should not see "Alien"

  Scenario: Sad path no movie has the chosen rating
    When I filter movies by rating "G"
    Then I should see no movies