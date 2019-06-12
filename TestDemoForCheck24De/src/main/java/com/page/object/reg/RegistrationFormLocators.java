package com.page.object.reg;

import com.driver.WebLocator;
import org.openqa.selenium.By;

public class RegistrationFormLocators {

    public static final WebLocator FIELD_FOR_USER = new WebLocator("E-Mail-Adresse", By.id("email"));

    public static final WebLocator FIELD_FOR_FIRST_PASSWORD = new WebLocator("Passwort auswählen", By.id("password"));

    public static final WebLocator FIELD_FOR_SECOND_PASSWORD = new WebLocator("Passwort wiederholen", By.id("passwordrepetition"));

    public static final WebLocator BUTTON_REGISTATION =
            new WebLocator("jetzt registrieren", By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/div/form/div[6]/div[2]/button"));

}
