package com.page.object.search;

import com.driver.DriverUtils;
import com.page.object.GlobalPageObject;
import com.page.object.NameOfScreens;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultScreen extends GlobalPageObject {

    public SearchResultScreen(DriverUtils utils) {
        super(utils);
        utils.checkTitleOfScreen(getTitle());
    }

    public List<WebElement> getResultOfSearch() {
        utils.waitForPageLoad();
        List<WebElement> result = new ArrayList<>();
        if (utils.checkIfElementPresentOnScreen(SearchResultScreenLocators.SEARCH_RESULT_SECTION)) {
            result = utils.getDriver().findElement(SearchResultScreenLocators.SEARCH_RESULT_SECTION.getBy()).
                    findElements(SearchResultScreenLocators.PATH_TO_HOTEL_FROM_SEARCH_RESULT.getBy());
        }

        for (final WebElement element : result) {
            utils.showInfo("Name of hotel is " + element.getText());
        }
        return result;
    }

    @Override
    protected String getTitle() {
        return NameOfScreens.TITLE_SEARCH_RESULT;
    }
}
