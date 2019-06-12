package com.page.object.profile;

import com.driver.WebLocator;
import org.openqa.selenium.By;

public class ProfileScreenLocators {

    public static final WebLocator POPUP_MSG = new WebLocator("Popup", By.id("c24-dialog-points-modal"));

    public static final WebLocator POPUP_BUTTON_CLOSE = new WebLocator("Close popup", By.xpath("//*[@id=\"c24-dialog-points-modal\"]/div/header/button"));

    public static final WebLocator TAB_TRAVEL = new WebLocator("Reise", By.xpath("//*[@id=\"c24-header-bottom\"]/div/nav/div/div/div[6]/a"));

    public static final WebLocator TAB_HOTEL = new WebLocator("Tab Hotel", By.xpath("//*[@id=\"c24-travel-js-traveltype-hotelonly-tab-wrapper\"]/a"));

    public static final WebLocator HOTEL_NAME_INPUT = new WebLocator("Reiseziel oder Hotel", By.xpath("//*[@id=\"searchFormContainer\"]/section/form/div[1]/div[1]/div[1]/div/div[1]/input"));

    public static final WebLocator BUTTON_SEARCH = new WebLocator("Hotels finder", By.xpath("//*[@id=\"searchFormContainer\"]/section/form/div[2]/div/div[1]/div[2]/div/div[2]/div/div/button"));

}