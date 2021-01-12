Feature:Search
  Agile Story: As a user, I should be able to search when I am on Google search

  Background: User should be on google search page
    Given User is on the google search page


  Scenario: Google default title verification

    Then User should see title is Google


  @wip   @smoke # work in progress
  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the title

  @hey @smoke
  Scenario: Google title verification after search
    When User searches "peach"
    Then User should see "peach" in the title

  @aboutTitle
  Scenario: Google -About- link page title verification

    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News

  @dataTable @smoke
  Scenario: Multiple search item verification
  // When User enters 3 search items
    Then User should see all of them below
      | apple  |
      | orange |
      | mango  |

@GoogleTable
  Scenario: Google footer links verification
    Then user should be able to see the all footer links
      | Advertising      |
      | Business         |
      | How search works |
      | Privacy          |
      | Terms            |
      | Settings         |









