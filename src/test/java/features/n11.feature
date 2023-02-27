  Feature:n11 Mobil Uygulamasi
    @smoke1
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



    @smoke2
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

    @smoke3
    Scenario Template:Lenovo Thinkpad laptop arama sonuclarının lenovo icerdigi dogrulanır
      Given arama kutusuna tiklanir
      And  "<input>" yazilir ve arama yapilir
      Then Arama sonuclarinin "<input>" icerdigi dogrulanır
      And  uygulama kapatilir
      Examples:
        | input         |
        |lenovo thinkpad|


