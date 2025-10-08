package project.bdd.pages;

import org.openqa.selenium.By;

public class ProductPage {
    public static final By PRODUCT_LABEL = By.className("product_label");
    public static final By BTN_PRIMARY = By.className("btn_primary");
    public static final By BTN_SECONDARY = By.className("btn_secondary");
    public static final By PRODUCT_SORT_CONTAINER = By.className("product_sort_container");
    public static final By REVERSE_ORDER = By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[2]");
    public static final By INVENTORY_ITEM_NAME = By.className("inventory_item_name");
    public static final By PRICE_LOW_TO_HIGH = By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[3]");
    public static final By PRICE_HIGH_TO_LOW = By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[4]");
    public static final By INVENTORY_ITEM_PRICE_LOW = By.className("inventory_item_price");
    public static final By INVENTORY_ITEM_PRICE_HIGH = By.className("inventory_item_price");
    public static final By PRODUCT_NAME = By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/a/div");
    public static final By INVENTORY_DETAIL_NAME = By.xpath("/html/body/div/div[2]/div[2]/div/div/div/div[1]");
    public static final By INVENTORY_DETAILS_DESCRIPTION = By.className("inventory_details_desc");
    public static final By INVENTORY_DETAILS_PRICE = By.className("inventory_details_price");
    public static final By PRODUCT_IMAGE = By.cssSelector("img.inventory_details_img");
    public static final By CART_ICON = By.id("shopping_cart_container");
    public static final By INVENTORY_NAME = By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div");
    public static final By CART_QUANTITY_LABEL = By.className("cart_quantity_label");
    public static final By HAMBURGER_MENU = By.className("bm-burger-button");
    public static final By LINK_TEXT = By.linkText("All Items");
    public static final By CART_QUANTITY = By.className("cart_quantity");





}
