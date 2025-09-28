package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.bdd.pages.LoginPage;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class LoginTestSteps extends SeleniumUtilities {
    @When("user fills up the login form")
    public void userFillsUpTheLoginForm(DataTable dataTable){
        Map<String, String> data = dataTable.asMap();
        String userName = data.get("username");
        String password = data.get("password");

        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD,password);

    }
    @Then("user clicks on sign in button")
    public void userClicksOnSignButton(){
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
}
