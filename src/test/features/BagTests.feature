Feature: As a user
         I validate bag

  @bagFt @smoke @regression
  Scenario: User adding an item in bag

    Given I am on Home Page "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "standard_user" and password "secret_sauce"
    And I click login button
    And I choose product "Sauce Labs Backpack" with cart updated "1"
    And I click bag icon and page heading as "YOUR CART"
    Then I should see product "Sauce Labs Backpack" in bag
