Feature: AndroidKey
  Background: Activate the search box
    Given Click on the searchbox
  @smoke
  Scenario: AndroidKey events1
    Given type "Mobile" in the searchBox
    And press on the key "Space"
    And press on the key "Backspace"
    Given type "phone" in the searchBox
    And press on the key "Enter"


