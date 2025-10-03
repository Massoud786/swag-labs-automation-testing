
@inventory
Feature: Inventory Management

  Background:

        Given user enters login credentials
      | username     | standard_user |
      | password     | secret_sauce  |
        When user clicks on the login button
        Then user should land on the product page

  Rule: Sorting
    Background:
      And user opens the sort menu


        Scenario: Validate user lands on the product page after log in to choose items to buy
        Given  user lands on the product page after log in
        When   user clicks on product to buy
        Then   validate user chooses item from product lists



        Scenario: Sort products by name Z-A
        When   user selects sort products by name in reverse alphabetical order Z-A
        Then   products should be sorted by name in reverse alphabetical


        Scenario: Sort products by price from lowest to highest
        When   user selects sort by price from low to high
        Then   products with lowest price should be displayed


        Scenario: Sort products by price from highest to lowest
          When   user selects sort by price from high to low
          Then   products with highest price should be displayed

        Scenario: View product details
        Given  user selects a product
        When   user lands to product detail page
        Then   product name, description, and price should be displayed


        Scenario: Add product to cart
        Given  user selects Add to cart button
        When   user navigates to the cart page
        Then   the selected item should be in the cart


        Scenario: Remove product from cart
        Given  user adds an item to the cart
        When   user removes the item from the cart
        Then   the cart should be empty


        Scenario: Validate cart persistence
        Given user adds item to the cart
        When user opens hamburger menu
        And  user selects All Items option
        And  user clicks on the cart icon
        Then the added item should still be present


