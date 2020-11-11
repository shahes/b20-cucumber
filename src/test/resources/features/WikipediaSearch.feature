Feature: Wikipedia search feature

  Agile Story: User should be able to search specific terms.

  Background: User is on the home page
    Given User is on the Wikipedia home page


  Scenario: title verification after searching a term
    When User enters a "Madonna"  in the search box and clicks
    Then User sees "Madonna" in the title of the page


  @Wikir
  Scenario:  main header verification
    When User enters a "xfgkrtith"  in the search box and clicks
    Then User sees "gkkdohokor" in the main header


  @Esra
  Scenario Outline: Search funcionality header verification
    When User enters a "<searchValue>"  in the search box and clicks
    Then User sees "<ExpectedTitle>" in the title of the page
    Then User sees "<expectedMainHeader>" in the main header
    Then User sees "<expectedImageHeader>" in the image header

    Examples: example test data for wikipedia search
      | searchValue   | ExpectedTitle | expectedMainHeader | expectedImageHeader |
      | Steve Jobs    | Steve Jobs    | Steve Jobs         | Steve Jobs          |
      | Einstein      | Einstein      | Einstein           | Einstein            |
      | Elvis Presley | Elvis Presley | Elvis Presley      | Elvis Presley       |
      | Mozart        | Mozart        | Mozart             | Mozart              |
      | Obama         | Obama         | Obama              | Obama               |
