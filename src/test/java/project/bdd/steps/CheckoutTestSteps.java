package project.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.CheckoutPage;
import project.bdd.pages.ProductPage;
import project.bdd.utility.SeleniumUtilities;

public class CheckoutTestSteps extends SeleniumUtilities {

    @When("user opens the cart page")
    public void userOpensTheCartPage(){
        clickOnElement(ProductPage.CART_ICON);
    }
    @And("user clicks on Checkout button")
    public void userClicksOnCheckoutButton(){
        clickOnElement(CheckoutPage.CHECKOUT_BUTTON);
    }
    @Then("user should land on the checkout your information page")
    public void userShouldLandOnTheCheckOutYourInformationPage() throws InterruptedException {
        Thread.sleep(3000);
        String actualCheckoutInformation = getElementText(CheckoutPage.CHECKOUT_INFORMATION_TEXT);
        String expectedCheckoutInformationPage = "Checkout: Your Information";
        Assert.assertEquals(expectedCheckoutInformationPage,actualCheckoutInformation);

    }
    @When("user fills in the form with {string}, {string}, and {string}")
    public void userFillsInTheFormWithInfo(String firstName, String lastName, String postalCode){
        sentTextToElement(CheckoutPage.FIRST_NAME,firstName);
        sentTextToElement(CheckoutPage.LAST_NAME,lastName);
        sentTextToElement(CheckoutPage.POSTAL_CODE,postalCode);

    }
    @And("user clicks the continue button")
    public void userClicksOnContinueButton(){
        clickOnElement(CheckoutPage.CONTINUE_BUTTON);
    }
    @Then("user should proceed to the checkout page")
    public void userShouldProceedToTheCheckoutPage(){
        String actualCheckoutOverview = getElementText(CheckoutPage.CHECKOUT_OVERVIEW_PAGE);
        String expectedCheckoutOverview = "Checkout: Overview";
        Assert.assertEquals(expectedCheckoutOverview,actualCheckoutOverview);
    }

    @When("user clicks on cart icon")
    public void userClicksOnCartIcon(){
        clickOnElement(ProductPage.CART_ICON);

    }
    @And("user clicks on checkout button")
    public void userClicksOnCheckoutBtn(){
        clickOnElement(CheckoutPage.CHECKOUT_BUTTON);
    }
    @Then("user should be taken to the checkout your information page")
    public void userShouldBeTakenToTheCheckoutPage() throws InterruptedException {
        Thread.sleep(3000);
        String actualCheckoutInformation = getElementText(CheckoutPage.CHECKOUT_INFORMATION_TEXT);
        String expectedCheckoutInformationPage = "Checkout: Your Information";
        Assert.assertEquals(expectedCheckoutInformationPage,actualCheckoutInformation);
    }
    @When("user completes checkout information with {string}, {string}, and {string}")
    public void userCompleteCheckoutInformation(String firstName, String lastName, String postalCode){
        sentTextToElement(CheckoutPage.FIRST_NAME,firstName);
        sentTextToElement(CheckoutPage.LAST_NAME,lastName);
        sentTextToElement(CheckoutPage.POSTAL_CODE,postalCode);
    }
    @And("user clicks the continue btn")
    public void userClicksOnContinueBtn(){
        clickOnElement(CheckoutPage.CONTINUE_BUTTON);
    }
    @Then("an error message should appear saying {string}")
    public void errorMessage(String expected) throws InterruptedException {
        Thread.sleep(3000);
        String actualErrorMessage = getElementText(CheckoutPage.ERROR_FIRST_NAME_REQUIRED);
        Assert.assertEquals(expected, actualErrorMessage);

        String actualLastNameError = getElementText(CheckoutPage.ERROR_LAST_NAME_REQUIRED);
        Assert.assertEquals(expected,actualLastNameError);

        String actualFirstNameErrorMessage = getElementText(CheckoutPage.ERROR_FIRST_NAME_REQUIRED);
        Assert.assertEquals(expected,actualFirstNameErrorMessage);

        String actualPostalErrorMessage = getElementText(CheckoutPage.ERROR_POSTAL_CODE_REQUIRED);
        Assert.assertEquals(expected,actualPostalErrorMessage);
    }

    @Given("user places an item to the cart")
    public void userPlacesAnItemToTheCart(){
       clickOnElement(ProductPage.BTN_PRIMARY);
}
    @When("user lands to the cart page")
        public void userLandsToTheCartPage(){
            clickOnElement(ProductPage.CART_ICON);
    }
    @And("user continues to the checkout page")
    public void userLandsToTheCheckoutPage(){
        clickOnElement(CheckoutPage.CHECKOUT_BUTTON);
    }

    @When("user provides checkout information with {string}, {string}, and {string}")
    public void userFillsInTheCheckoutForm(String firstName, String lastName, String postalCode) throws InterruptedException {
        Thread.sleep(2000);
        sentTextToElement(CheckoutPage.FIRST_NAME,firstName);
        sentTextToElement(CheckoutPage.LAST_NAME,lastName);
        sentTextToElement(CheckoutPage.POSTAL_CODE,postalCode);
    }
    @And("user clicks on continue")
    public void userClicksOnContinue(){
        clickOnElement(CheckoutPage.CONTINUE_BUTTON);
    }
    @Then("user should see productName {string}, productPrice {string}, productTax {string}, and productPrice {string}")
    public void userLandsToCheckoutOverviewPage(String productName, String productPrice, String productTax, String productTotal){
       String actualProductName = getElementText(CheckoutPage.PRODUCT_NAME);
       Assert.assertEquals(productName,actualProductName);

       String actualProductPrice = getElementText(CheckoutPage.PRODUCT_PRICE);
       Assert.assertEquals(productPrice,actualProductPrice);

       String actualProductTax = getElementText(CheckoutPage.PRODUCT_TAX);
       Assert.assertEquals(productTax,actualProductTax);

       String actualProductTotal = getElementText(CheckoutPage.PRODUCT_TOTAL_PRICE);
       Assert.assertEquals(productTotal,actualProductTotal);
    }
    @Given("user puts an item to the cart")
    public void userPutsAnItemToTheCart(){
        clickOnElement(ProductPage.BTN_PRIMARY);
    }
    @When("user is taken to the cart page")
    public void userIsTakenToTheCartPage(){
        clickOnElement(ProductPage.CART_ICON);
    }
    @And("user navigates to checkout page")
    public void userNavigatesToCheckoutPage(){
        clickOnElement(CheckoutPage.CHECKOUT_BUTTON);
    }
    @When("user fills in the checkout information with {string}, {string}, and {string}")
    public void userFillsInTheCheckoutFormInfo(String firstName, String lastName, String postalCode) throws InterruptedException {
        Thread.sleep(3000);
        sentTextToElement(CheckoutPage.FIRST_NAME,firstName);
        sentTextToElement(CheckoutPage.LAST_NAME,lastName);
        sentTextToElement(CheckoutPage.POSTAL_CODE,postalCode);
    }
    @And("user continues to the checkout overview page")
    public void userLandsOnCheckoutOverviewPage(){
        clickOnElement(CheckoutPage.CONTINUE_BUTTON);
    }
    @When("user clicks the Finish button")
        public void userClicksTheFinishButton() throws InterruptedException {
        Thread.sleep(3000);
            clickOnElement(CheckoutPage.FINISH_BUTTON);
    }
    @Then("user should see an order confirmation {string}")
    public void userShouldGetAConfirmationMessage(String expectedConfirmationMessage){
        String actualConfirmationMessage = getElementText(CheckoutPage.CONFIRMATION_MESSAGE);
        Assert.assertEquals(expectedConfirmationMessage,actualConfirmationMessage);
    }

}
