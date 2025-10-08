package project.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.LoginPage;
import project.bdd.pages.LogoutPage;

import project.bdd.utility.SeleniumUtilities;

public class LogoutTestSteps extends SeleniumUtilities {
    @Given("user logs in with {string} and {string}")
    public void userLogsInWithCredentials(String userName, String userPassword){
        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD,userPassword);
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @When("user opens the hamburger menu")
    public void userOpensTheHamburgerMenu(){
        clickOnElement(LogoutPage.HAMBURGER_BUTTON);
    }
    @And("user selects the logout option")
    public void userSelectsTheLogoutOption() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(LogoutPage.LOGOUT_SIDEBAR_LINK);

    }
    @Then("user should be redirected to the login page")
    public void userShouldBeTakenToLoginPage(){
        boolean isLoginButtonDisplayed = isElementDisplayed(LoginPage.LOGIN_BUTTON);
        Assert.assertTrue("Login button should be visible after logout",isLoginButtonDisplayed);
    }
}
