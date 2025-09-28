package project.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By NAME = By.id("user-name");
    public static final By PASSWORD = By.name("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.xpath("/html/body/div[2]/div[1]/div/div/form/h3");
}
