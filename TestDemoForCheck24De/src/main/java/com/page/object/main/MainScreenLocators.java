package com.page.object.main;

import com.driver.WebLocator;
import org.openqa.selenium.By;

public class MainScreenLocators {

    public static final WebLocator MEIN_KONTO =
            new WebLocator("Mein Konto", By.xpath("/html/body/div[3]/div[2]/div/header/div[1]/div/div[1]/div/div[1]/span/span[2]"));

    public static final WebLocator STARTED_SIE_HER = new WebLocator("Started Sie Her",
            By.xpath("/html/body/div[3]/div[2]/div/header/div[1]/div/div[1]/div/div[1]/div/div[2]/a"));

}
