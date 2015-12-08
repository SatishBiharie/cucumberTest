Feature: Belly

  Scenario: a few cukes
    Given I am on the google home page
    When I search for "Tweakers"
    Then I should see "Tweakers - Wij stellen technologie op de proef" on the first link
