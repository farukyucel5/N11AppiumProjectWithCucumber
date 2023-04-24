  Feature:n11 Mobil Uygulamasi

    Scenario:n11 Mobil Uygulamasi ile Telefon Satin Alma Otomasyonu
      Given Kategorilere tiklanir
      And Elektronik tiklanir
      Then TelefonveAksesuarlari Secilir
      Then Cep telefonu secilir
      Then Marka secilir
      When Filtrelemeye tiklanir
      And Filtreleme yapilir
      When Sonuclarigostere tiklanir
      And  artı butonuna basılır
      Then Sepete ikonuna basilir
      And  filtrelenen urunun mavi ve 128GB  oldugu dogrulanir
      Then uygulama kapatilir

    Scenario:n11 Mobil Uygulamasi ile Telefon Satin Alma Otomasyonu
      Given Kategorilere tiklanir
      And Elektronik tiklanir
      Then TelefonveAksesuarlari Secilir
      Then Cep telefonu secilir
      Then Marka secilir
      When Filtrelemeye tiklanir
      And Filtreleme yapilir
      When Sonuclarigostere tiklanir
      And Urun detayına gidilir
      Then Sepete urun eklenir
      And  filtrelenen urunun mavi ve 128GB  oldugu dogrulanir
      Then uygulama kapatilir


    Scenario Template:Lenovo Thinkpad laptop arama sonuclarının lenovo icerdigi dogrulanır
      Given arama kutusuna tiklanir
      And  "<input>" yazilir ve arama yapilir
      Then Arama sonuclarinin "<input>" icerdigi dogrulanır
      And  uygulama kapatilir
      Examples:
        | input         |
        |lenovo thinkpad|


    @smoke
    Scenario: Dropdowns
      Given click the "Kategoriler"
      And  click the "Otomotiv & Motosiklet"
      And  click the "Yedek Parça"
      And click the "Egzoz"
      And click the "Filtrele"
      Then click the "Teslimat Adresi Seç"
      And click the "Şehir Seç"
      Then Scroll down to the "İstanbul"
      And click the "İlçe Seç"
      Then Scroll down to the "Beşiktaş"
      And click the "Onayla"
      And click the "Sonuçları Göster"
      And verify that "AYNI GÜN TESLİMAT" is visible

      







