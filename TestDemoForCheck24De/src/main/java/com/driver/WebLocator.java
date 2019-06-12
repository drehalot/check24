package com.driver;

import org.openqa.selenium.By;

public class WebLocator {

    private String nameOfElement;

    private By by;

    public WebLocator(String name, By by) {
        this.nameOfElement = name;
        this.by = by;
    }

    public String getNameOfElement() {
        return nameOfElement;
    }

    public By getBy() {
        return by;
    }

}
