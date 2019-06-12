package com.page.object.reg;

import com.driver.DriverUtils;
import com.page.object.GlobalPageObject;
import com.page.object.NameOfScreens;
import com.page.object.profile.ProfileScreen;

public class RegistrationForm extends GlobalPageObject {

    public RegistrationForm(DriverUtils utils) {
        super(utils);
        utils.checkTitleOfScreen(getTitle());
    }

    public RegistrationForm setUserName(String value) {
        utils.setTextInInput(RegistrationFormLocators.FIELD_FOR_USER, value);
        return this;
    }


    public RegistrationForm setFirstPassword(String value) {
        utils.setTextInInput(RegistrationFormLocators.FIELD_FOR_FIRST_PASSWORD, value);
        return this;
    }

    public RegistrationForm setSecondPassword(String value) {
        utils.setTextInInput(RegistrationFormLocators.FIELD_FOR_SECOND_PASSWORD, value);
        return this;
    }

    public ProfileScreen pressButtonRegistration() {
        utils.pressOnWebElement(RegistrationFormLocators.BUTTON_REGISTATION);
        return new ProfileScreen(utils);
    }

    @Override
    protected String getTitle() {
        return NameOfScreens.TITLE_REGISTRATION_FORM;
    }

}
