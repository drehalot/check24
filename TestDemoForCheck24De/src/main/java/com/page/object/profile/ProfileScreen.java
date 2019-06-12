package com.page.object.profile;

import com.driver.DriverUtils;
import com.page.object.GlobalPageObject;
import com.page.object.NameOfScreens;
import com.page.object.search.SearchResultScreen;

public class ProfileScreen extends GlobalPageObject {

    public ProfileScreen(DriverUtils utils) {
        super(utils);
        checkAndClosePopup();
    }

    public void checkAndClosePopup() {
        if (utils.checkIfElementPresentOnScreen(ProfileScreenLocators.POPUP_MSG)) {
            utils.pressOnWebElement(ProfileScreenLocators.POPUP_BUTTON_CLOSE);
        }
    }

    @Override
    protected String getTitle() {
        return NameOfScreens.TITLE_PROFILE_SCREEN;
    }

    private ProfileScreen pressTabTravel() {
        utils.pressOnWebElement(ProfileScreenLocators.TAB_TRAVEL);
        return this;
    }

    private ProfileScreen pressTabSearchHotel() {
        utils.pressOnWebElement(ProfileScreenLocators.TAB_HOTEL);
        return this;
    }

    private ProfileScreen setNameOfHotel(String value) {
        utils.setTextInInput(ProfileScreenLocators.HOTEL_NAME_INPUT, value);
        return this;
    }

    private SearchResultScreen pressButtonSearch() {
        utils.pressOnWebElement(ProfileScreenLocators.BUTTON_SEARCH);
        return new SearchResultScreen(utils);
    }

    public SearchResultScreen searchHotelByName(String value) {
        return pressTabTravel().pressTabSearchHotel().setNameOfHotel(value).pressButtonSearch();
    }

}
