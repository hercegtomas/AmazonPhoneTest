Feature: List Samsung Mobile Phones
  Scenario: Filter Samsung phones by specifications
    Given I am on the Amazon homepage
    When I navigate to Mobile Phones section
    And I apply filters for Samsung phones with Camera Resolution 20 MP and above, Model Year 2023, and Price Range £50 - £100
    Then I should see a list of Samsung phones matching the criteria