package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.LoginPage;
import project.bdd.pages.ProductPage;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class LoginTestSteps extends SeleniumUtilities {

    @Given("user enters login credentials")
    public void userFillsUpTheLoginForm(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String userName = data.get("username");
        String password = data.get("password");

        sentTextToElement(LoginPage.NAME, userName);
        sentTextToElement(LoginPage.PASSWORD, password);
    }

    @When("user clicks on the login button")
    public void userClicksOnSignButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("user should land on the product page")
    public void userShouldLandOnTheProductPage() {
        String actualProductLabelText = getElementText(ProductPage.PRODUCT_LABEL);
        String expectedProductLabelText = "Products";
        Assert.assertEquals(expectedProductLabelText, actualProductLabelText);
    }
    @When("user logs in with username {string} and password {string}")
    public void userLogsInWithUsernameAndPassword(String username, String password){
        sentTextToElement(LoginPage.NAME,username);
        sentTextToElement(LoginPage.PASSWORD,password);
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @Then("an error message should be displayed saying {string}")
    public void anErrorMessageShouldBeDisplayed(String expectedMessage){
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals(actualErrorMessage,expectedMessage);
    }
}
