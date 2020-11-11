

 Feature:Etsy Search feature

  Agile story : User should be able to search terms and see relevant results in the
  page and in the title
  Background: User should be on Etsy home page
    Given User is  on the home page
  @etsyWip
  Scenario:

    Then  User should see the title is as expected

  #expected: Etsy - Shop for handmade, vintage, custom,and unique gifts for everyone
@Wip
Scenario: Title verification after search term

  When User searches "wooden spoon" in the search box
  And User clicks on the search button
  Then User should see "Wooden spoon" in the Etsy title