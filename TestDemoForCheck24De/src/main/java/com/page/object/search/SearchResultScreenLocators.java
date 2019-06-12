package com.page.object.search;

import com.driver.WebLocator;
import org.openqa.selenium.By;

public class SearchResultScreenLocators {

    public static final WebLocator SEARCH_RESULT_SECTION = new WebLocator("Section with search",
            By.xpath("//*[@id=\"hotelResultsContainer\"]/div/div[2]/div[2]/section"));

    public static final WebLocator PATH_TO_HOTEL_FROM_SEARCH_RESULT = new WebLocator("Name of a hotel",
            By.xpath("div/div/section/div/div[2]/div[1]/a"));

}
