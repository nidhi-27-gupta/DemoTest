Feature: Navigating the mega menu

  Scenario: Verify user is able to navigate through the mega menu items 
    Given Automation practice website is opened
    When I hover my mouse to megamenu item Dresses -> Summer dresses
    Then I should be able to view Summer dresses page