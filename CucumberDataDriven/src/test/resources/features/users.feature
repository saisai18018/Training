Feature: User validation with list

  Scenario: Validate multiple usernames
    Given the following usernames:
      | Sai   |
      | Bharath |
      | Kotha  |
      | Divya  |
      | Meghana  |
    When I process the usernames
    Then I should see 5 usernames processed
