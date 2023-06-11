Feature: Android key events

  Background: activate the search box
    Given Click on the search box
    @smoke
  Scenario: Key events
    And type "Mobile" in the search box
    Then press on the key "Space"
    And press on the key "Backspace"
    And type "phone" in the search box
    Then press on the key "Enter"

