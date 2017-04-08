Feature: Google Search


  As a basic user
  I want to navigate to search something
  so I need to start browser and navigate

  Scenario: homepage navigation

    Given I am simple user
    When I enter some query
    Then I see result


  Scenario: homepage navigation