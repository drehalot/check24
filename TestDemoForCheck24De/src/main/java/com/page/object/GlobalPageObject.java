package com.page.object;

import com.driver.DriverUtils;

public abstract class GlobalPageObject {

    protected DriverUtils utils;

    protected GlobalPageObject(DriverUtils utils) {
        this.utils = utils;
    }

    protected abstract String getTitle();
}
