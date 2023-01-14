Feature: As a user
  I validate Login

  @loginFt @smoke @regression
  Scenario: User verifying login with valid username and password

    Given I am on Home Page "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "standard_user" and password "secret_sauce"
    And I click login button
    Then I should get re-directed to list of products page with heading text "PRODUCTS"

  @loginFt @regression
  Scenario: User verifying login with invalid username and password

    Given I am on Home Page "https://www.saucedemo.com" with title "Swag Labs"
    When I enter username "standard_user_inv" and password "secret_sauce_inv"
    And I click login button
    Then I should get an error message "Epic sadface: Username and password do not match any user in this service"

  @loginFt @regression
  Scenario: User verifying login with invalid username and password

    Given I am on Home Page "https://www.saucedemo.com" with title "Swag Labs"
    When I click login button
    Then I should get an error message "Epic sadface: Username is required"

