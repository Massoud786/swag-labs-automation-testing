package project.bdd.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.ProductPage;
import project.bdd.utility.SeleniumUtilities;

public class InventoryTestSteps extends SeleniumUtilities {

    @Given("user lands on the product page after log in")
        public void userLandsOnTheProductPageAfterLogin(){
            String actualTitle = getElementText(ProductPage.PRODUCT_LABEL);
            String expectedTitle = "Products";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("user clicks on product to buy")
    public void userClicksOnProductToBuy() throws InterruptedException {
        clickOnElement(ProductPage.BTN_PRIMARY);

    }
    @Then("validate user chooses item from product lists")
    public void validateUserChoosesItemFromProductLists(){
        String actualResult = getElementText(ProductPage.BTN_SECONDARY);
        String expectedResult = "REMOVE";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Given("user opens the sort menu")
        public void userOpensTheSortMenu(){
        clickOnElement(ProductPage.PRODUCT_SORT_CONTAINER);
    }
    @When("user selects sort products by name in reverse alphabetical order Z-A")
    public void userSortsProductInReverseOrder(){
        clickOnElement(ProductPage.REVERSE_ORDER);
    }
    @Then("products should be sorted by name in reverse alphabetical")
    public void productInReverseOrder(){
        boolean isElementInReverseOrderDisplayed = isElementDisplayed(ProductPage.INVENTORY_ITEM_NAME);
        Assert.assertTrue("Element is displayed",isElementInReverseOrderDisplayed);
    }
    @When("user selects sort by price from low to high")
    public void userSelectsSortByPriceFromLowToHigh(){
        clickOnElement(ProductPage.PRICE_LOW_TO_HIGH);
    }
    @Then("products with lowest price should be displayed")
    public void productsWithLowestPrice(){
     String actualLowestPrice = getElementText(ProductPage.INVENTORY_ITEM_PRICE_LOW);
     String expectedLowestPrice = "$7.99";
     Assert.assertEquals(expectedLowestPrice,actualLowestPrice);
    }
    @When("user selects sort by price from high to low")
    public void userSelectsSortByPriceFromHighToLow(){
        clickOnElement(ProductPage.PRICE_HIGH_TO_LOW);
    }
    @Then("products with highest price should be displayed")
    public void productsWithHighestPrice(){
        String actualHighestPrice = getElementText(ProductPage.INVENTORY_ITEM_PRICE_HIGH);
        String expectedHighestPrice = "$49.99";
        Assert.assertEquals(expectedHighestPrice,actualHighestPrice);
    }
    @Given("user selects a product")
    public void userSelectsAProduct(){
        clickOnElement(ProductPage.PRODUCT_NAME);

    }
    @When("user lands to product detail page")
    public void userLandsToProductDetailPage(){
        boolean isUserLandedToProductPage = isElementDisplayed(ProductPage.PRODUCT_IMAGE);
        Assert.assertTrue("Product image should be visible on detail page",isUserLandedToProductPage);
    }
    @Then("product name, description, and price should be displayed")
    public void productDescriptionAndPriceShouldBeDisplayed() {

        String actualProductName = getElementText(ProductPage.INVENTORY_DETAIL_NAME);
        String expectedProductName = "Sauce Labs Backpack";
        Assert.assertEquals(expectedProductName,actualProductName);

        String actualProductDescription = getElementText(ProductPage.INVENTORY_DETAILS_DESCRIPTION);
        String expectedProductDescription = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds " +
                "uncompromising style with unequaled laptop and tablet protection.";
        Assert.assertEquals(expectedProductDescription,actualProductDescription);

        String actualProductPrice = getElementText(ProductPage.INVENTORY_DETAILS_PRICE);
        String expectedProductPrice = "$29.99";
        Assert.assertEquals(expectedProductPrice,actualProductPrice);

    }
    @Given("user selects Add to cart button")
    public void addProductToCart(){
        clickOnElement(ProductPage.BTN_PRIMARY);
    }
    @When("user navigates to the cart page")
    public void userLandsToTheCartPage(){
        clickOnElement(ProductPage.CART_ICON);
    }
    @Then("the selected item should be in the cart")
    public void selectedItemShouldBeInTheCart()  {
        boolean isSelectedItemDisplayed = isElementDisplayed(ProductPage.INVENTORY_NAME);
        Assert.assertTrue("Selected item should be displayed in the cart",isSelectedItemDisplayed);
    }
    @Given("user adds an item to the cart")
    public void addItemToTheCart(){
        clickOnElement(ProductPage.BTN_PRIMARY);
    }
    @When("user removes the item from the cart")
    public void removeItemFromTheCart()  {
        clickOnElement(ProductPage.BTN_SECONDARY);
    }
    @Then("the cart should be empty")
    public void theCartShouldBeEmpty(){
        clickOnElement(ProductPage.CART_ICON);
        boolean isCartEmpty = isElementDisplayed(ProductPage.CART_QUANTITY_LABEL);
        Assert.assertTrue("Cart should be empty",isCartEmpty);
    }
    @Given("user adds item to the cart")
    public void userAddsItemToTheCart(){
        clickOnElement(ProductPage.BTN_PRIMARY);
    }
    @When("user opens hamburger menu")
    public void userNavigatesAwayAndReturnToTheCart(){
        clickOnElement(ProductPage.HAMBURGER_MENU);

    }
    @And("user selects All Items option")
    public void userSelectAllItemOption() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ProductPage.LINK_TEXT);
    }
    @And("user clicks on the cart icon")
    public void userClicksOnTheCartIcon(){
        clickOnElement(ProductPage.CART_ICON);
    }
    @Then("the added item should still be present")
    public void addedItemShouldStillBePresent(){
        boolean isItemStillPresent = isElementDisplayed(ProductPage.CART_QUANTITY);
        Assert.assertTrue("Item QTY 1 should be displayed",isItemStillPresent);
    }
}
