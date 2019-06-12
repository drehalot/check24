package com.driver;

import com.log.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.driver.GlobalDriver.TIME_FOR_CHECK_ELEMENT;
import static com.driver.GlobalDriver.TIME_FOR_IMPLICITLY_WAIT;

public class DriverUtils extends Logger {

    private WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void checkTitleOfScreen(String title) {
        waitForPageLoad();

        WebDriverWait wait = new WebDriverWait(driver, TIME_FOR_IMPLICITLY_WAIT);
        wait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete") &&
                        wd.getTitle().contains(title));

        if (driver.getTitle().contains(title)) {
            showPassed("Page with title " + title + " was successfully loaded!");
        } else {
            showError("Page was not successfully loaded! Page has title " + driver.getTitle() + " instead title");
        }
    }

    public void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(driver, TIME_FOR_IMPLICITLY_WAIT);
        wait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

    }

    public void setTextInInput(WebLocator fieldForUser, String value) {
        waitForPageLoad();
        showInfo("Set value " + value + " for field \"" + fieldForUser.getNameOfElement() + "\"");

        driver.findElement(fieldForUser.getBy()).clear();
        driver.findElement(fieldForUser.getBy()).sendKeys(value);
    }

    public void pressOnWebElement(WebLocator locator) {
        showInfo("Pressing web element with name \"" + locator.getNameOfElement() + "\"");
        if (checkIfElementPresentOnScreen(locator)) {
            WebElement element = driver.findElement(locator.getBy());
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
        }
    }

    public void openUrl(String url) {
        showInfo("Opening page with url " + url);
        driver.get(url);
        waitForPageLoad();
    }

    public boolean checkIfElementPresentOnScreen(WebLocator locator) {
        try {

            WebDriverWait wait = new WebDriverWait(driver, TIME_FOR_CHECK_ELEMENT);
            wait.until((ExpectedCondition<Boolean>) wd ->
                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete") &&
                            wd.findElements(locator.getBy()).size() > 0);
            return true;
        } catch (Throwable throwable) {
            return false;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}