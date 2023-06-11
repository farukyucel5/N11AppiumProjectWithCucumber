Feature: N11 app mobile test c_01

  Scenario: N11 searchbox test
    Given Type "Kulaklik" in the searchBox
    And  click the "first product"
    Then click the "sepetim"
    And verify that "Ödemeye Geç" is visible
    Then Close the app

  Scenario: Scroll down
    Given Type "Kulaklik" in the searchBox
    And Scroll down to the "Huawei"


  Scenario: Scroll down2
    Given Type "Kulaklik" in the searchBox
    And Scroll down to the "Qcy"

  Scenario: Dropdown
    Given click the "Kategoriler"
    And click the "Otomotiv & Motosiklet"
    And click the "Yedek Parça"
    And click the "Egzoz"
    And click the "Filtrele"
    And click the "Teslimat Adresi Seç"
    Then click the "Şehir Seç"
    And Scroll down to the "İstanbul"
    And click the "İlçe Seç"
    Then Scroll down to the "Beşiktaş"
    And click the "Onayla"
    Then click the "Sonuçları Göster"
    And verify that "AYNI GÜN TESLİMAT" is visible


