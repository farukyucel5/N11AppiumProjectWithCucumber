Feature: N11 app mobile test c_01
  @smoke
  Scenario: N11 searchbox test
    Given Type "Kulaklik" in the searchBox
    And  click the "first product"
    Then click the "sepetim"
    And verify that "Ödemeye Geç" is visible
    Then Close the app