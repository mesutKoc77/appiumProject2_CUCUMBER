@qd
  Feature: Basarili login olunmali
    Scenario Outline: Kullanici olarak basariyla login olabilmemeliyim


      * Kullanici Browser Driver Kurulumlarini gerceklestiriri
      * Kullanici qualiytdemy sayfasina gider
      * Kullanici Cookiesöeri kabul eder
      * Login e tiklayarak login sayfasina ulastigini dogrular
      * yanlis degerlerle "<mail>" "<sifre>" siteye giris yapamadigini dogrular
      Examples:
      | mail  | |  sifre |
      |  yanlisMail | | yanlisSifre  |
      |  yanlisMail1 | |  yanlisSifre1 |
      | yanlisMail2  | | yanlisSifre2  |









