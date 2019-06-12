package com.page.object.main;

import com.driver.DriverUtils;
import com.page.object.GlobalPageObject;
import com.page.object.NameOfScreens;
import com.page.object.reg.RegistrationForm;

public class MainScreen extends GlobalPageObject {

    public MainScreen(DriverUtils utils, String url) {
        super(utils);
        utils.openUrl(url);
        utils.checkTitleOfScreen(getTitle());
    }

    public RegistrationForm redirectToRegistrationForm() {
        utils.pressOnWebElement(MainScreenLocators.MEIN_KONTO);
        utils.pressOnWebElement(MainScreenLocators.STARTED_SIE_HER);
        return new RegistrationForm(utils);

    }

    @Override
    protected String getTitle() {
        return NameOfScreens.TITLE_MAIN_SCREEN;
    }
}
