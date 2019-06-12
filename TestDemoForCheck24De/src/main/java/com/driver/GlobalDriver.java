package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GlobalDriver {

    public static final int TIME_FOR_IMPLICITLY_WAIT = 60;

    public static final int TIME_FOR_CHECK_ELEMENT = 10;

    private WebDriver driver;

    private DriverUtils driverUtils;

    public GlobalDriver() {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIME_FOR_IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        this.driverUtils = new DriverUtils(driver);
    }

    public DriverUtils getDriverUtils() {
        return driverUtils;
    }

    public void closeDriver() {
        driverUtils.showInfo("Closing of WebDriver");
        if (driver != null) {
            driver.close();
        }
        driverUtils.getResultOfSoftAssert().assertAll();
    }
}
