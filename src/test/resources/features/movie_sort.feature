Feature: Sort movies

  Scenario: Happy path newest movies come first
    Given a movie "Old Movie" rated "G" released in 1990 is in the catalog
    And a movie "Newest Movie" rated "PG" released in 2025 is in the catalog
    And a movie "Mid Movie" rated "PG-13" released in 2010 is in the catalog
    When I see movies newest first
    Then I should see "Newest Movie"

  Scenario: Sad path empty catalog
    When I filter movies by rating "G"
    Then I should see no movies