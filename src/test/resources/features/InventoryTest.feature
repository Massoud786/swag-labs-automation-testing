
Feature: Inventory Management

  Scenario: Validate user lands on the product page after log in to choose items to buy
    @Given  user lands on the product page after log in
    @When   user clicks on products to buy
    @Then   validate user chooses item from product lists

    Scenario: Sort products by name Z-A
      @Given  user opens the sort menu
      @When   user selects sort products by name in reverse alphabetical order Z-A
      @Then   products should be sorted by name in reverse alphabetical

      Scenario: Sort products by price low to high
        @Given  user opens the sort menu
        @When   user selects sort by price from low to high
        @Then   products should be displayed from lowest to highest price

      Scenario: View product details
        @Given  user selects a product
        @When   user navigates to product detail page
        @Then   product description and price should be displayed

      Scenario: Add product to cart
        @Given  user selects Add to cart
        @When   user navigates to the cart page
        @Then   the selected item should be in the cart

      Scenario: Remove product from cart
        @Given  user adds an item to the cart
        @When   user removes the item from the cart
        @Then   the cart should be empty

      Scenario: Validate cart review
        @Given  user adds item to cart
        @When   user is on the cart page
        @Then   validate product name, price, and total are present

      Scenario: Validate cart persistence
        @Given user adds an item to the cart
        @When user navigates away and return to the cart
        @Then the added item should still be present


