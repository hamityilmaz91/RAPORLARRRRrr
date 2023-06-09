# cucumber frameworkunde herseyin temeli feature file lardir .Butun adimlar test caseler burda yazilir

@ilk @son

Feature: US_01  Medunna sayfasi testi

Background: Her senaryodan once bir kere calisir
      Given kullanici amazon sayfasina gider

    Scenario:  US_01 icin TC_01 Kullanici medunna sayfasina gider ve Login olur


      And  kullanici arama kutusuna iphone yazar
      And  kullanici arama kutusuna " bisey" yazar
      And kullanici arama kutusuna "kemal" yazar
      
      
