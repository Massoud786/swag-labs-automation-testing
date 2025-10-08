package project.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait(){
        return new WebDriverWait(getChrome(), Duration.ofSeconds(20));
    }
    public void clickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public String getElementText(By locator)  {

        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    public void sentTextToElement(By locator, String text){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public boolean isElementDisplayed(By locator){
        try {
            return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        }
        catch (TimeoutException e){
            return false;
        }

    }
  }
