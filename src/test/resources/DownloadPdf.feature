#lenguaje:es
Feature: Validar pdf

  Scenario: Descargar pdf y validarlo

    Given Ingresar la seccion de aprender es facil
    When  Descargar el pdf de Fatca y CRS
    Then Validar que el archivo descargado sea el de la pagina