Feature: Contar Calorias finales

Scenario: CORRER UNA MARATON DE 5 KM QUEMANDO 20 CALORIAS POR KM QUEMO EN TOTAL 100 KCAL
  Given Correr 5 km
  When Quemo 20 calorias por km
  Then Quemo en total 100 calorias

Scenario: NO CORRO Y QUEMARIA 20 CALORIAS POR KM POR LO TANTO QUEMO EN TOTAL 0 KCAL
  Given No ejercito
  When Quemo 20 calorias por km
  Then Quemo en total 0 calorias

Scenario: CORRO 10 KM QUEMANDO 10 CALORIAS POR KM Y ME COMO UN SANDWICH DE 100 CALORIAS POR LO TANTO QUEMO EN TOTAL 0 KCAL
  Given Correr 10 km
  When Quemo 10 calorias por km
  Then Como un sandwich de 100 calorias y quemo en total 0 calorias

Scenario: CORRO 11 KM QUEMANDO 10 CALORIAS POR KM Y ME COMO UN SANDWICH DE 120 CALORIAS POR LO TANTO QUEMO EN TOTAL -10 KCAL
  Given Correr 11 km
  When Quemo 10 calorias por km
  Then Como un sandwich de 100 calorias y quemo en total -10 calorias
