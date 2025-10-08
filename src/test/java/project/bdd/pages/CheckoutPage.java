package project.bdd.pages;

import org.openqa.selenium.By;

public class CheckoutPage {

    public static final By CHECKOUT_BUTTON = By.className("checkout_button");
    public static final By CHECKOUT_INFORMATION_TEXT = By.xpath("/html/body/div/div[2]/div[2]");
    public static final By FIRST_NAME = By.id("first-name");
    public static final By LAST_NAME = By.id("last-name");
    public static final By POSTAL_CODE = By.id("postal-code");
    public static final By CONTINUE_BUTTON = By.className("cart_button");
    public static final By CHECKOUT_OVERVIEW_PAGE = By.xpath("//*[@id=\"contents_wrapper\"]/div[2]");
    public static final By ERROR_FIRST_NAME_REQUIRED = By.xpath("/html/body/div/div[2]/div[3]/div/form/h3");
    public static final By ERROR_LAST_NAME_REQUIRED = By.xpath("/html/body/div/div[2]/div[3]/div/form/h3");
    public static final By ERROR_POSTAL_CODE_REQUIRED = By.xpath("/html/body/div/div[2]/div[3]/div/form/h3");
    public static final By PRODUCT_NAME = By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div");
    public static final By PRODUCT_PRICE = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[5]");
    public static final By PRODUCT_TAX = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[6]");
    public static final By PRODUCT_TOTAL_PRICE = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[7]");
    public static final By FINISH_BUTTON = By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]");
    public static final By CONFIRMATION_MESSAGE = By.className("complete-header");

}
